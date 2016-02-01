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

/**
 * @author dezelin
 *
 */
public class RawTransaction {
	private int version;
	private TxIn[] txIn;
	private TxOut[] txOut;
	private int lockTime;

	public RawTransaction(int version, TxIn[] txIn, TxOut[] txOut,
			int lockTime) {
		this.setVersion(version);
		this.setTxIn(txIn);
		this.setTxOut(txOut);
		this.setLockTime(lockTime);
	}

	public RawTransaction(RawTransaction tx) {
		this.setVersion(tx.version);
		this.setTxIn(tx.txIn);
		this.setTxOut(tx.txOut);
		this.setLockTime(tx.lockTime);
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
	 * @return the txInCount
	 */
	public int getTxInCount() {
		return txIn.length;
	}

	/**
	 * @return the txIn
	 */
	public TxIn[] getTxIn() {
		return txIn;
	}

	/**
	 * @param txIn
	 *            the txIn to set
	 */
	public void setTxIn(TxIn[] txIn) {
		this.txIn = txIn;
	}

	/**
	 * @return the txOutCount
	 */
	public int getTxOutCount() {
		return txOut.length;
	}

	/**
	 * @return the txOut
	 */
	public TxOut[] getTxOut() {
		return txOut;
	}

	/**
	 * @param txOut
	 *            the txOut to set
	 */
	public void setTxOut(TxOut[] txOut) {
		this.txOut = txOut;
	}

	/**
	 * @return the lockTime
	 */
	public int getLockTime() {
		return lockTime;
	}

	/**
	 * @param lockTime
	 *            the lockTime to set
	 */
	public void setLockTime(int lockTime) {
		this.lockTime = lockTime;
	}
}
