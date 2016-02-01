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
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import bitcoin4j.network.swarm.Peer;
import bitcoin4j.network.swarm.Seed;
import bitcoin4j.pools.WorkPoolSingleton;

public class DnsSeedSwarm implements Seed {

	private final List<String> seeds;

	public DnsSeedSwarm(List<String> seeds) {
		this.seeds = new ArrayList<>(seeds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see network.Seed#retrievePeers()
	 */
	@Override
	public CompletableFuture<List<Peer>> retrievePeers() {
		ExecutorService executor = WorkPoolSingleton.getInstance().getExecutor();
		CompletableFuture<List<Peer>> futurePeers = CompletableFuture.supplyAsync(() -> resolvePeers(seeds), executor);
		return futurePeers;
	}

	private static List<Peer> resolvePeers(List<String> seeds) {
		List<Peer> peers = new ArrayList<Peer>();
		seeds.forEach(host -> {
			try {
				InetAddress[] addresses = InetAddress.getAllByName(host);
				for (InetAddress inetAddress : addresses) {
					// TODO: For now use only testnet
					peers.add(new BitcoinPeer(inetAddress, 18333));
				}
			} catch (UnknownHostException e) {
				// TODO: Log error message
			}
		});

		return peers;
	}

}
