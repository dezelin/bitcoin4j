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

/**
 * @author dezelin
 *
 */
public class GetBlocksMessage implements DataMessage {

	private static final String commandName = "getblocks";

	private int version;
	private CompactInteger hashCount;
	private byte[][] blockHeaderHashes;
	private byte[] stopHash;

	public GetBlocksMessage(int version, CompactInteger hashCount,
			byte[][] blockHeaderHashes, byte[] stopHash) {
		this.setVersion(version);
		this.setHashCount(hashCount);
		this.setBlockHeaderHashes(blockHeaderHashes);
		this.setStopHash(stopHash);
	}

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the hashCount
	 */
	public CompactInteger getHashCount() {
		return hashCount;
	}

	/**
	 * @param hashCount
	 *            the hashCount to set
	 */
	public void setHashCount(CompactInteger hashCount) {
		this.hashCount = hashCount;
	}

	/**
	 * @return the blockHeaderHashes
	 */
	public byte[][] getBlockHeaderHashes() {
		return blockHeaderHashes;
	}

	/**
	 * @param blockHeaderHashes
	 *            the blockHeaderHashes to set
	 */
	public void setBlockHeaderHashes(byte[][] blockHeaderHashes) {
		this.blockHeaderHashes = blockHeaderHashes;
	}

	/**
	 * @return the stopHash
	 */
	public byte[] getStopHash() {
		return stopHash;
	}

	/**
	 * @param stopHash
	 *            the stopHash to set
	 */
	public void setStopHash(byte[] stopHash) {
		this.stopHash = stopHash;
	}

	@Override
	public String getCommandName() {
		return commandName;
	}

}
