/*
 *
 * Copyright (c) 2016 Aleksandar Dezelin
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/**
 * 
 */
package bitcoin4j.network.protocol;

import java.security.InvalidParameterException;

/**
 * @author dezelin
 *
 */
public class CompactInteger {
	private long value;

	public CompactInteger(long value) {
		this.setValue(value);
	}

	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * @return the value as compact byte[]
	 */
	public byte[] getCompactValue() {
		byte[] compact;
		if (value <= 252) {
			compact = new byte[1];
			compact[0] = (byte) value;
		} else if (value <= 0xffff) {
			compact = new byte[3];
			compact[0] = (byte) 0xfd;
			compact[1] = (byte) (value & 0xff);
			compact[2] = (byte) ((value >> 8) & 0xff);
		} else if (value <= 0xffffffff) {
			compact = new byte[5];
			compact[0] = (byte) 0xfe;
			compact[1] = (byte) (value & 0xff);
			compact[2] = (byte) ((value >> 8) & 0xff);
			compact[3] = (byte) ((value >> 16) & 0xff);
			compact[4] = (byte) ((value >> 24) & 0xff);
		} else {
			compact = new byte[9];
			compact[0] = (byte) 0xff;
			compact[1] = (byte) (value & 0xff);
			compact[2] = (byte) ((value >> 8) & 0xff);
			compact[3] = (byte) ((value >> 16) & 0xff);
			compact[4] = (byte) ((value >> 24) & 0xff);
			compact[5] = (byte) ((value >> 32) & 0xff);
			compact[6] = (byte) ((value >> 40) & 0xff);
			compact[7] = (byte) ((value >> 48) & 0xff);
			compact[8] = (byte) ((value >> 56) & 0xff);
		}

		return compact;
	}

	/**
	 * @param value
	 *            the value to set in little-endian order
	 */
	public void setCompactValue(byte[] value) throws InvalidParameterException {
		switch (value.length) {
		case 1: {
			this.value = value[0];
			break;
		}
		case 3: {
			if (value[0] != 0xfd) {
				throw new InvalidParameterException("Missing prefix byte 0xfd");
			}

			this.value = value[2] << 8 | value[1];
			break;
		}
		case 5: {
			if (value[0] != 0xfe) {
				throw new InvalidParameterException("Missing prefix byte 0xfe");
			}

			this.value = value[4] << 24 | value[3] << 16 | value[2] << 8
					| value[1];
			break;
		}
		case 9: {
			if (value[0] != 0xff) {
				throw new InvalidParameterException("Missing prefix byte 0xff");
			}

			this.value = value[7] << 56 | value[6] << 48 | value[5] << 40
					| value[4] << 32 | value[3] << 16 | value[2] << 8
					| value[1];
			break;
		}
		default: {
			throw new InvalidParameterException("Invalid compact integer");
		}
		}
	}

}
