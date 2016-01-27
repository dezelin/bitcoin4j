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
package bitcoin4j.network.protocol.enums;

/**
 * @author dezelin
 *
 */
public enum RejectEnum {
	
	MSG_DECODEERROR (0x01),
	MSG_INVALID (0x10),
	MSG_UNSUPPORTED (0x11),
	MSG_DUPLICATE (0x12),
	MSG_UNKNOWN (0x40),
	MSG_TRESHOLD (0x41),
	MSG_FEE (0x42),
	MSG_WRONGBLOCKCHAIN (0x43);
	
	private int code;
	private byte[] extraType;
	
	RejectEnum(int code) {
		this.setCode(code);
	}
	
	RejectEnum(int code, byte[] extraType) {
		this.setCode(code);
		this.setExtraType(extraType);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public byte[] getExtraType() {
		return extraType;
	}

	public void setExtraType(byte[] extraType) {
		this.extraType = extraType;
	}
}
