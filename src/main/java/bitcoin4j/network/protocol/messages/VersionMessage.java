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

import bitcoin4j.network.protocol.enums.ServiceIdentifiersEnum;

/**
 * @author dezelin
 *
 */
public class VersionMessage implements ControlMessage {

	private static final String commandName = "version";

	private int version;
	private ServiceIdentifiersEnum services;
	private long timestamp;
	private ServiceIdentifiersEnum addrRecvServices;
	private byte[] addrRecvAddress;
	private short addrRcvPort;
	private ServiceIdentifiersEnum addrTransServices;
	private byte[] addrTransAddress;
	private short addrTransPort;
	private long nonce;
	private String userAgent;
	private int startHeight;
	private boolean realy;

	/**
	 * 
	 */
	public VersionMessage(int version, ServiceIdentifiersEnum services,
			long timestamp, ServiceIdentifiersEnum addrRecvServices,
			byte[] addrRecvAddress, short addrRcvPort,
			ServiceIdentifiersEnum addrTransServices, byte[] addrTransAddress,
			short addrTransPort, long nonce, String userAgent, int startHeight,
			boolean relay) {
		this.setVersion(version);
		this.setServices(services);
		this.setTimestamp(timestamp);
		this.setAddrRecvServices(addrRecvServices);
		this.setAddrRecvAddress(addrRecvAddress);
		this.setAddrRcvPort(addrRcvPort);
		this.setAddrTransServices(addrTransServices);
		this.setAddrTransAddress(addrTransAddress);
		this.setAddrTransPort(addrTransPort);
		this.setNonce(nonce);
		this.setUserAgent(userAgent);
		this.setStartHeight(startHeight);
		this.setRelay(relay);
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ServiceIdentifiersEnum getServices() {
		return services;
	}

	public void setServices(ServiceIdentifiersEnum services) {
		this.services = services;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public ServiceIdentifiersEnum getAddrRecvServices() {
		return addrRecvServices;
	}

	public void setAddrRecvServices(ServiceIdentifiersEnum addrRecvServices) {
		this.addrRecvServices = addrRecvServices;
	}

	public byte[] getAddrRecvAddress() {
		return addrRecvAddress;
	}

	public void setAddrRecvAddress(byte[] addrRecvAddress) {
		this.addrRecvAddress = addrRecvAddress;
	}

	public short getAddrRcvPort() {
		return addrRcvPort;
	}

	public void setAddrRcvPort(short addrRcvPort) {
		this.addrRcvPort = addrRcvPort;
	}

	public ServiceIdentifiersEnum getAddrTransServices() {
		return addrTransServices;
	}

	public void setAddrTransServices(ServiceIdentifiersEnum addrTransServices) {
		this.addrTransServices = addrTransServices;
	}

	public byte[] getAddrTransAddress() {
		return addrTransAddress;
	}

	public void setAddrTransAddress(byte[] addrTransAddress) {
		this.addrTransAddress = addrTransAddress;
	}

	public short getAddrTransPort() {
		return addrTransPort;
	}

	public void setAddrTransPort(short addrTransPort) {
		this.addrTransPort = addrTransPort;
	}

	public long getNonce() {
		return nonce;
	}

	public void setNonce(long nonce) {
		this.nonce = nonce;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public int getStartHeight() {
		return startHeight;
	}

	public void setStartHeight(int startHeight) {
		this.startHeight = startHeight;
	}

	public boolean isRelay() {
		return realy;
	}

	public void setRelay(boolean realy) {
		this.realy = realy;
	}

}
