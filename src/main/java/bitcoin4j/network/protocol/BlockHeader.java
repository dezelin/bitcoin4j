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
public class BlockHeader {
	private int version;
	private byte[] prevBlockHeaderHash;
	private byte[] merkleRootHash;
	private int time;
	private int nBits;
	private int nonce;

	public BlockHeader(int version, byte[] prevBlockHash, byte[] merkleRootHash,
			int time, int nBits, int nonce) {
		this.setVersion(version);
		this.setPrevBlockHeaderHash(prevBlockHash);
		this.setMerkleRootHash(merkleRootHash);
		this.setTime(time);
		this.setnBits(nBits);
		this.setNonce(nonce);
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
		return prevBlockHeaderHash;
	}

	/**
	 * @param prevBlockHeaderHash
	 *            the prevBlockHeaderHash to set
	 */
	public void setPrevBlockHeaderHash(byte[] prevBlockHeaderHash) {
		this.prevBlockHeaderHash = prevBlockHeaderHash;
	}

	/**
	 * @return the merkleRootHash
	 */
	public byte[] getMerkleRootHash() {
		return merkleRootHash;
	}

	/**
	 * @param merkleRootHash
	 *            the merkleRootHash to set
	 */
	public void setMerkleRootHash(byte[] merkleRootHash) {
		this.merkleRootHash = merkleRootHash;
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

}
