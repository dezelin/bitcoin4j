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
package bitcoin4j.network.protocol.messages;

import bitcoin4j.network.protocol.structs.BlockHeader;
import bitcoin4j.network.protocol.structs.CompactInteger;

/**
 * @author dezelin
 *
 */
public class HeadersMessage implements DataMessage {

	private static final String commandName = "headers";

	private CompactInteger count;
	private BlockHeader[] blockHeaders;

	/**
	 * 
	 */
	public HeadersMessage(CompactInteger count, BlockHeader[] headers) {
		this.setCount(count);
		this.setBlockHeaders(headers);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bitcoin4j.network.protocol.Message#getCommandName()
	 */
	@Override
	public String getCommandName() {
		return commandName;
	}

	/**
	 * @return the count
	 */
	public CompactInteger getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(CompactInteger count) {
		this.count = count;
	}

	/**
	 * @return the blockHeaders
	 */
	public BlockHeader[] getBlockHeaders() {
		return blockHeaders;
	}

	/**
	 * @param blockHeaders
	 *            the blockHeaders to set
	 */
	public void setBlockHeaders(BlockHeader[] blockHeaders) {
		this.blockHeaders = blockHeaders;
	}

}
