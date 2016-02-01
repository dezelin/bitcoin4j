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
package bitcoin4j.network.protocol.structs;

import java.util.Arrays;

/**
 * @author dezelin
 *
 */
public class BlockHeader {
	private int version;
	private byte[] prevBlockHeaderHash;
	private byte[] merkleRootHash;
	private int time;
	private int nBits;
	private int nonce;
	private CompactInteger txnCount;

	public BlockHeader(int version, byte[] prevBlockHash, byte[] merkleRootHash,
			int time, int nBits, int nonce) {
		this.setVersion(version);
		this.setPrevBlockHeaderHash(prevBlockHash);
		this.setMerkleRootHash(merkleRootHash);
		this.setTime(time);
		this.setnBits(nBits);
		this.setNonce(nonce);
		this.setTxnCount(new CompactInteger(0));
	}

	public BlockHeader(BlockHeader blockHeader) {
		this.setVersion(blockHeader.getVersion());
		this.setPrevBlockHeaderHash(blockHeader.getPrevBlockHeaderHash());
		this.setMerkleRootHash(blockHeader.getMerkleRootHash());
		this.setTime(blockHeader.getTime());
		this.setnBits(blockHeader.getnBits());
		this.setNonce(blockHeader.getNonce());
		this.setTxnCount(blockHeader.getTxnCount());
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
	 * @return the prevBlockHeaderHash
	 */
	public byte[] getPrevBlockHeaderHash() {
		return Arrays.copyOf(prevBlockHeaderHash, prevBlockHeaderHash.length);
	}

	/**
	 * @param prevBlockHeaderHash
	 *            the prevBlockHeaderHash to set
	 */
	public void setPrevBlockHeaderHash(byte[] prevBlockHeaderHash) {
		this.prevBlockHeaderHash = Arrays.copyOf(prevBlockHeaderHash, prevBlockHeaderHash.length);
	}

	/**
	 * @return the merkleRootHash
	 */
	public byte[] getMerkleRootHash() {
		return Arrays.copyOf(merkleRootHash, merkleRootHash.length);
	}

	/**
	 * @param merkleRootHash
	 *            the merkleRootHash to set
	 */
	public void setMerkleRootHash(byte[] merkleRootHash) {
		this.merkleRootHash = Arrays.copyOf(merkleRootHash, merkleRootHash.length);
	}

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * @return the nBits
	 */
	public int getnBits() {
		return nBits;
	}

	/**
	 * @param nBits
	 *            the nBits to set
	 */
	public void setnBits(int nBits) {
		this.nBits = nBits;
	}

	/**
	 * @return the nonce
	 */
	public int getNonce() {
		return nonce;
	}

	/**
	 * @param nonce
	 *            the nonce to set
	 */
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

	/**
	 * @return the txnCount
	 */
	public CompactInteger getTxnCount() {
		return new CompactInteger(txnCount);
	}

	/**
	 * @param txnCount the txnCount to set
	 */
	public void setTxnCount(CompactInteger txnCount) {
		this.txnCount = new CompactInteger(txnCount);
	}

}
