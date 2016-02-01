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
package bitcoin4j.network.pools;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dezelin
 *
 */
public class PeerConnectionPool implements ConnectionPool {

	private final Set<Connection> taken = new HashSet<>();
	private final Set<Connection> pool = new HashSet<>();

	/**
	 * 
	 */
	public PeerConnectionPool() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bitcoin4j.network.pools.ConnectionPool#size()
	 */
	@Override
	public int size() {
		return pool.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bitcoin4j.network.pools.ConnectionPool#hasAvailable()
	 */
	@Override
	public boolean hasAvailable() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bitcoin4j.network.pools.ConnectionPool#takeFromPool()
	 */
	@Override
	public Connection takeFromPool() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * bitcoin4j.network.pools.ConnectionPool#returnToPool(bitcoin4j.network.
	 * pools.Connection)
	 */
	@Override
	public void returnToPool(Connection connection) {
		// TODO Auto-generated method stub

	}

}
