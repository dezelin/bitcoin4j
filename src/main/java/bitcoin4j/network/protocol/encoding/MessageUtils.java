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

package bitcoin4j.network.protocol.encoding;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import bitcoin4j.network.protocol.structs.CompactInteger;

class MessageUtils {

	public MessageUtils() {
	}

	public static byte[] encodeHeaderCommandName(String commandName) {
		byte[] buff = null;
		
		try {
			byte[] command = commandName.getBytes("UTF8");
			buff = new byte[12];
			System.arraycopy(command, 0, buff, 0, Math.min(command.length, buff.length));
		} catch (UnsupportedEncodingException e) {
			// TODO Log error message
		}
		
		return buff;
	}

	public static byte[] encodeHeaderChecksum(byte[] payload) {
		byte[] headerChecksum = null;
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] checksum = digest.digest(payload);
			checksum = digest.digest(checksum);
			headerChecksum = new byte[4];
			// Last for bytes in internal Bitcoin order
			headerChecksum[3] = checksum[checksum.length - 4];
			headerChecksum[2] = checksum[checksum.length - 3];
			headerChecksum[1] = checksum[checksum.length - 2];
			headerChecksum[0] = checksum[checksum.length - 1];
		} catch (NoSuchAlgorithmException e) {
			// TODO Log error message
		}
		
		return headerChecksum;
	}
	
	public static byte[] encodeCompactInteger(long x) {
		return new CompactInteger(x).toByteArray();
	}
}
