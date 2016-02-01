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

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author dezelin
 *
 */
public class PeerConnection implements Connection {
	
	private ConnectionPool pool;
	private AsynchronousSocketChannel channel;
	private InetAddress address;
	private int port;

	/**
	 * @throws IOException 
	 * 
	 */
	protected PeerConnection(ConnectionPool pool, InetAddress address, int port) {
		this.pool = pool;
		this.address = address;
		this.port = port;
	}

	@Override
	public InetAddress getAddress() {
		return address;
	}

	@Override
	public int getPort() {
		return port;
	}

	@Override
	public boolean isOpen() {
		if (channel == null) {
			return false;
		}
		
		return channel.isOpen();
	}

	@Override
	public CompletableFuture<Boolean> open() {
		if (channel != null) {
			try {
				channel = AsynchronousSocketChannel.open();
			} catch (IOException e) {
				// TODO Log error message
			}
		}
		
		return CompletableFuture.completedFuture(isOpen());
	}

	@Override
	public CompletableFuture<Boolean> connect() {
		if (channel == null) {
			throw new IOException();
		}

		CompletableFuture<Boolean> future = new CompletableFuture<>();
		channel.connect(new InetSocketAddress(address, port), null, new CompletionHandler<Void, Void>() {

			@Override
			public void completed(Void result, Void attachment) {
				future.complete(true);
			}

			@Override
			public void failed(Throwable exc, Void attachment) {
				future.complete(false);
			}
		});
		
		return future;
	}

	@Override
	public CompletableFuture<Boolean> close() {
		if (pool == null) {
			return CompletableFuture.completedFuture(false);
		}
		
		return pool.returnToPool(this);
	}

	@Override
	public CompletableFuture<Integer> read(ByteBuffer dst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<Integer> write(ByteBuffer src) {
		// TODO Auto-generated method stub
		return null;
	}

}
