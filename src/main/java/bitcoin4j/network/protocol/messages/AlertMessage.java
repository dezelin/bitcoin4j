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

import bitcoin4j.network.protocol.ControlMessage;
import bitcoin4j.network.protocol.structs.CompactInteger;

/**
 * @author dezelin
 *
 */
public class AlertMessage implements ControlMessage {

	private static final String commandName = "alert";

	private CompactInteger alertBytes;
	private byte[] alert;
	private CompactInteger signatureBytes;
	private byte[] signature;

	/**
	 * 
	 */
	public AlertMessage(CompactInteger alertBytes, byte[] alert,
			CompactInteger signatureBytes, byte[] signature) {
		this.setAlertBytes(alertBytes);
		this.setAlert(alert);
		this.setSignatureBytes(signatureBytes);
		this.setSignature(signature);
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

	public CompactInteger getAlertBytes() {
		return alertBytes;
	}

	public void setAlertBytes(CompactInteger alertBytes) {
		this.alertBytes = alertBytes;
	}

	public byte[] getAlert() {
		return alert;
	}

	public void setAlert(byte[] alert) {
		this.alert = alert;
	}

	public CompactInteger getSignatureBytes() {
		return signatureBytes;
	}

	public void setSignatureBytes(CompactInteger signatureBytes) {
		this.signatureBytes = signatureBytes;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

}
