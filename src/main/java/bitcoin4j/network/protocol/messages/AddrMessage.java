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

import java.util.ArrayList;
import java.util.Arrays;

import bitcoin4j.network.protocol.structs.IPAddress;

/**
 * @author dezelin
 *
 */
public class AddrMessage implements ControlMessage {

	private static final String commandName = "addr";

	private ArrayList<IPAddress> addresses;

	/**
	 * 
	 */
	public AddrMessage(ArrayList<IPAddress> addresses) {
		this.setAddresses(addresses);
	}
	
	public AddrMessage(AddrMessage message) {
		this.setAddresses(message.addresses);
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
	 * @return the addrCount
	 */
	public int getAddrCount() {
		return addresses.size();
	}

	/**
	 * @return the addresses
	 */
	public ArrayList<IPAddress> getAddresses() {
		return new ArrayList<IPAddress>(addresses);
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(ArrayList<IPAddress> addresses) {
		this.addresses = new ArrayList<IPAddress>(addresses);
	}

}
