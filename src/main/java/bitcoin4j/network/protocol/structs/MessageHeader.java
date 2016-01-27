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
package bitcoin4j.network.protocol.structs;

/**
 * Message Header
 * <p>
 * All messages in the network protocol use the same container format, which
 * provides a required multi-field message header and an optional payload.
 */
public interface MessageHeader {
	/* Mainnet magic string */
	public final int MainnetMagic = 0xf9beb4d9;

	/* Testnet magic string */
	public final int TestnetMagic = 0x0b110907;

	/* Regtest magic string */
	public final int RegtestMagic = 0xfabfb5da;

	public String getStartString();

	public void setStartString(String startString);

	public String getCommandName();

	public void setCommandName(String commandName);

	public int getPayloadSize();

	public void setPayloadSize(int payloadSize);

	public String getChecksum();

	public void setChecksum(String checksum);
}
