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

package bitcoin4j.network;

import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Future;

public class BitcoinPeer implements Peer, Seed {

	private InetAddress address;
	private int port;

	public BitcoinPeer(InetAddress address, int port) {
		this.address = address;
		this.port = port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see network.Peer#getAddress()
	 */
	@Override
	public InetAddress getAddress() {
		return address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see network.Peer#setAddress(java.net.InetAddress)
	 */
	@Override
	public void setAddress(InetAddress address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see network.Peer#getPort()
	 */
	@Override
	public int getPort() {
		return port;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see network.Peer#setPort(int)
	 */
	@Override
	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public Future<List<Peer>> retrievePeers() {
		// TODO Auto-generated method stub
		return null;
	}
}
