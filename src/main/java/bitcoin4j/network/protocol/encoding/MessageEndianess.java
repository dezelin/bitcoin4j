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
package bitcoin4j.network.protocol.encoding;

/**
 * @author dezelin
 *
 */
class MessageEndianess {

	/**
	 * 
	 */
	public MessageEndianess() {
	}

	public static byte[] encodeLittleEndian(short x) {
		byte[] buff = new byte[2];
		buff[1] = (byte) ((x >> 8) & 0xff);
		buff[0] = (byte) (x & 0xff);
		return buff;
	}
	
	public static byte[] encodeLittleEndian(int x) {
		byte[] buff = new byte[4];
		buff[3] = (byte) ((x >> 24) & 0xff);
		buff[2] = (byte) ((x >> 16) & 0xff);
		buff[1] = (byte) ((x >> 8) & 0xff);
		buff[0] = (byte) (x & 0xff);
		return buff;
	}
	
	public static byte[] encodeLittleEndian(long x) {
		byte[] buff = new byte[8];
		buff[7] = (byte) ((x >> 56) & 0xff);
		buff[6] = (byte) ((x >> 48) & 0xff);
		buff[5] = (byte) ((x >> 40) & 0xff);
		buff[4] = (byte) ((x >> 32) & 0xff);
		buff[3] = (byte) ((x >> 24) & 0xff);
		buff[2] = (byte) ((x >> 16) & 0xff);
		buff[1] = (byte) ((x >> 8) & 0xff);
		buff[0] = (byte) (x & 0xff);
		return buff;
	}
	
	public static byte[] encodeLittleEndian(boolean x) {
		byte[] buff = new byte[1];
		buff[0] = (byte) (x ? 1 : 0);
		return buff;
	}
}
