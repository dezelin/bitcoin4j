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

import java.nio.ByteBuffer;

/**
 * @author dezelin
 *
 */
public class BitcoinMessageHeader implements MessageHeader {
	
	private String startString;
	private String commandName;
	private int payloadSize = 0;
	private String checksum;
	
	public BitcoinMessageHeader(String commandName) {
		this.setCommandName(commandName);
		this.setStartString(ByteBuffer.allocate(4).putInt(TestnetMagic).toString());
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#getStartString()
	 */
	@Override
	public String getStartString() {
		return startString;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#setStartString(java.lang.String)
	 */
	@Override
	public void setStartString(String startString) {
		this.startString = startString;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#getCommandName()
	 */
	@Override
	public String getCommandName() {
		return commandName;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#setCommandName(java.lang.String)
	 */
	@Override
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#getPayloadSize()
	 */
	@Override
	public int getPayloadSize() {
		return payloadSize;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#setPayloadSize(int)
	 */
	@Override
	public void setPayloadSize(int payloadSize) {
		this.payloadSize = payloadSize;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#getChecksum()
	 */
	@Override
	public String getChecksum() {
		return checksum;
	}

	/* (non-Javadoc)
	 * @see bitcoin4j.network.protocol.MessageHeader#setChecksum(java.lang.String)
	 */
	@Override
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
}
