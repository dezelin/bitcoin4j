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
public class TxIn {
	private Outpoint outpoint;
	private CompactInteger scriptBytes;
	private byte[] signatureScript;
	private int sequence;

	public TxIn(Outpoint outpoint, CompactInteger scriptBytes,
			byte[] signatureScript, int sequence) {
		this.setOutpoint(outpoint);
		this.setScriptBytes(scriptBytes);
		this.setSignatureScript(signatureScript);
		this.setSequence(sequence);
	}

	/**
	 * @return the outpoint
	 */
	public Outpoint getOutpoint() {
		return outpoint;
	}

	/**
	 * @param outpoint
	 *            the outpoint to set
	 */
	public void setOutpoint(Outpoint outpoint) {
		this.outpoint = outpoint;
	}

	/**
	 * @return the scriptBytes
	 */
	public CompactInteger getScriptBytes() {
		return scriptBytes;
	}

	/**
	 * @param scriptBytes
	 *            the scriptBytes to set
	 */
	public void setScriptBytes(CompactInteger scriptBytes) {
		this.scriptBytes = scriptBytes;
	}

	/**
	 * @return the signatureScript
	 */
	public byte[] getSignatureScript() {
		return signatureScript;
	}

	/**
	 * @param signatureScript
	 *            the signatureScript to set
	 */
	public void setSignatureScript(byte[] signatureScript) {
		this.signatureScript = signatureScript;
	}

	/**
	 * @return the sequence
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * @param sequence
	 *            the sequence to set
	 */
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
}
