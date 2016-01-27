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

/**
 * @author dezelin
 *
 */
public class MerkleBlockMessage implements DataMessage {

	private static final String commandName = "merkleblock";

	private BlockHeader blockHeader;
	private int transactionCount;
	private byte[][] hashes;
	private byte[] flags;

	/**
	 * 
	 */
	public MerkleBlockMessage(BlockHeader blockHeader, int transactionCount,
			byte[][] hashes, byte[] flags) {
		this.setBlockHeader(blockHeader);
		this.setTransactionCount(transactionCount);
		this.setHashes(hashes);
		this.setFlags(flags);
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
	 * @return the blockHeader
	 */
	public BlockHeader getBlockHeader() {
		return blockHeader;
	}

	/**
	 * @param blockHeader
	 *            the blockHeader to set
	 */
	public void setBlockHeader(BlockHeader blockHeader) {
		this.blockHeader = blockHeader;
	}

	/**
	 * @return the transactionCount
	 */
	public int getTransactionCount() {
		return transactionCount;
	}

	/**
	 * @param transactionCount
	 *            the transactionCount to set
	 */
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	/**
	 * @return the hashCount
	 */
	public int getHashCount() {
		return hashes.length;
	}

	/**
	 * @return the hashes
	 */
	public byte[][] getHashes() {
		return hashes;
	}

	/**
	 * @param hashes
	 *            the hashes to set
	 */
	public void setHashes(byte[][] hashes) {
		this.hashes = hashes;
	}

	/**
	 * @return the flagByteCount
	 */
	public int getFlagByteCount() {
		return flags.length;
	}

	/**
	 * @return the flags
	 */
	public byte[] getFlags() {
		return flags;
	}

	/**
	 * @param flags
	 *            the flags to set
	 */
	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

}
