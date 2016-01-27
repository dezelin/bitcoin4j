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

import bitcoin4j.network.protocol.ControlMessage;

/**
 * @author dezelin
 *
 */
public class FilterLoadMessage implements ControlMessage {

	private static final String commandName = "filterload";

	private byte filterBytes;
	private byte[] filter;
	private int nHashFunc;
	private int nTweak;
	private byte nFlags;

	/**
	 * 
	 */
	public FilterLoadMessage(byte filterBytes, byte[] filter, int nHashFunc,
			int nTweak, byte nFlags) {
		this.setFilterBytes(filterBytes);
		this.setFilter(filter);
		this.setnHashFunc(nHashFunc);
		this.setnTweak(nTweak);
		this.setnFlags(nFlags);
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

	public byte getFilterBytes() {
		return filterBytes;
	}

	public void setFilterBytes(byte filterBytes) {
		this.filterBytes = filterBytes;
	}

	public byte[] getFilter() {
		return filter;
	}

	public void setFilter(byte[] filter) {
		this.filter = filter;
	}

	public int getnHashFunc() {
		return nHashFunc;
	}

	public void setnHashFunc(int nHashFunc) {
		this.nHashFunc = nHashFunc;
	}

	public int getnTweak() {
		return nTweak;
	}

	public void setnTweak(int nTweak) {
		this.nTweak = nTweak;
	}

	public byte getnFlags() {
		return nFlags;
	}

	public void setnFlags(byte nFlags) {
		this.nFlags = nFlags;
	}

}
