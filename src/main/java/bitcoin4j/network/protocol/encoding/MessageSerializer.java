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
package bitcoin4j.network.protocol.encoding;

import bitcoin4j.network.protocol.messages.AddrMessage;
import bitcoin4j.network.protocol.messages.AlertMessage;
import bitcoin4j.network.protocol.messages.BlockMessage;
import bitcoin4j.network.protocol.messages.FilterAddMessage;
import bitcoin4j.network.protocol.messages.FilterClearMessage;
import bitcoin4j.network.protocol.messages.FilterLoadMessage;
import bitcoin4j.network.protocol.messages.GetAddrMessage;
import bitcoin4j.network.protocol.messages.GetBlocksMessage;
import bitcoin4j.network.protocol.messages.GetDataMessage;
import bitcoin4j.network.protocol.messages.GetHeadersMessage;
import bitcoin4j.network.protocol.messages.HeadersMessage;
import bitcoin4j.network.protocol.messages.InvMessage;
import bitcoin4j.network.protocol.messages.MemPoolMessage;
import bitcoin4j.network.protocol.messages.MerkleBlockMessage;
import bitcoin4j.network.protocol.messages.Message;
import bitcoin4j.network.protocol.messages.NotFoundMessage;
import bitcoin4j.network.protocol.messages.PingMessage;
import bitcoin4j.network.protocol.messages.PongMessage;
import bitcoin4j.network.protocol.messages.RejectMessage;
import bitcoin4j.network.protocol.messages.SendHeadersMessage;
import bitcoin4j.network.protocol.messages.TxMessage;
import bitcoin4j.network.protocol.messages.VerAckMessage;
import bitcoin4j.network.protocol.messages.VersionMessage;
import bitcoin4j.network.protocol.misc.MessageUtils;
import bitcoin4j.network.protocol.structs.MessageHeader;

import java.io.InvalidClassException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author dezelin
 *
 */
public class MessageSerializer implements MessageEncoder {

	private static final int EMPTY_PAYLOAD_CHECKSUM = 0x5df6e0e2;

	private static Map<Class<? extends Message>, Function<Message, byte[]>> encoders = new HashMap<>();

	static {
		encoders.put(AddrMessage.class, (message) -> encodeAddrMessage((AddrMessage) message));
		encoders.put(AlertMessage.class, (message) -> encodeAlertMessage((AlertMessage) message));
		encoders.put(BlockMessage.class, (message) -> encodeBlockMessage((BlockMessage) message));
		encoders.put(FilterAddMessage.class, (message) -> encodeFilterAddMessage((FilterAddMessage) message));
		encoders.put(FilterClearMessage.class, (message) -> encodeFilterClearMessage((FilterClearMessage) message));
		encoders.put(FilterLoadMessage.class, (message) -> encodeFilterLoadMessage((FilterLoadMessage) message));
		encoders.put(GetAddrMessage.class, (message) -> encodeGetAddrMessage((GetAddrMessage) message));
		encoders.put(GetBlocksMessage.class, (message) -> encodeGetBlocksMessage((GetBlocksMessage) message));
		encoders.put(GetDataMessage.class, (message) -> encodeGetDataMessage((GetDataMessage) message));
		encoders.put(GetHeadersMessage.class, (message) -> encodeGetHeadersMessage((GetHeadersMessage) message));
		encoders.put(HeadersMessage.class, (message) -> encodeHeadersMessage((HeadersMessage) message));
		encoders.put(InvMessage.class, (message) -> encodeInvMessage((InvMessage) message));
		encoders.put(MemPoolMessage.class, (message) -> encodeMemPoolMessage((MemPoolMessage) message));
		encoders.put(MerkleBlockMessage.class, (message) -> encodeMerkleBlockMessage((MerkleBlockMessage) message));
		encoders.put(NotFoundMessage.class, (message) -> encodeNotFoundMessage((NotFoundMessage) message));
		encoders.put(PingMessage.class, (message) -> encodePingMessage((PingMessage) message));
		encoders.put(PongMessage.class, (message) -> encodePongMessage((PongMessage) message));
		encoders.put(RejectMessage.class, (message) -> encodeRejectMessage((RejectMessage) message));
		encoders.put(SendHeadersMessage.class, (message) -> encodeSendHeadersMessage((SendHeadersMessage) message));
		encoders.put(TxMessage.class, (message) -> encodeTxMessage((TxMessage) message));
		encoders.put(VerAckMessage.class, (message) -> encodeVerAckMessage((VerAckMessage) message));
		encoders.put(VersionMessage.class, (message) -> encodeVersionMessage((VersionMessage) message));
	}

	/**
	 * 
	 */
	public MessageSerializer() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bitcoin4j.network.encoding.MessageEncoder#encode(bitcoin4j.network.
	 * protocol.messages.Message)
	 */
	@Override
	public byte[] encode(Message message) throws InvalidClassException {
		Function<Message, byte[]> encoder = encoders.get(message.getClass());
		if (encoder == null) {
			throw new InvalidClassException(message.getClass().getName());
		}

		return encoder.apply(message);
	}

	private static byte[] encodeAddrMessage(AddrMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeAlertMessage(AlertMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeBlockMessage(BlockMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeFilterAddMessage(FilterAddMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeFilterClearMessage(FilterClearMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeFilterLoadMessage(FilterLoadMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeGetAddrMessage(GetAddrMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeGetBlocksMessage(GetBlocksMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeGetDataMessage(GetDataMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeGetHeadersMessage(GetHeadersMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeHeadersMessage(HeadersMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeInvMessage(InvMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeMemPoolMessage(MemPoolMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeMerkleBlockMessage(MerkleBlockMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeNotFoundMessage(NotFoundMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodePingMessage(PingMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodePongMessage(PongMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeRejectMessage(RejectMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeSendHeadersMessage(SendHeadersMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeTxMessage(TxMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeVerAckMessage(VerAckMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	private static byte[] encodeVersionMessage(VersionMessage message) {
		byte[] version = encodeLittleEndian(message.getVersion());
		byte[] services = encodeLittleEndian(message.getServices().getServiceIdentifier());
		byte[] timestamp = encodeLittleEndian(message.getTimestamp());
		byte[] addrRecvServices = encodeLittleEndian(message.getAddrRecvServices().getServiceIdentifier());
		byte[] addrRecvAddress = message.getAddrRecvAddress();
		byte[] addrRecvPort = encodeLittleEndian(message.getAddrRcvPort());
		byte[] addrTransServices = encodeLittleEndian(message.getAddrTransServices().getServiceIdentifier());
		byte[] addrTransAddress = message.getAddrTransAddress();
		byte[] addrTransPort = encodeLittleEndian(message.getAddrTransPort());
		byte[] nonce = encodeLittleEndian(message.getNonce());
		byte[] userAgentSize = encodeCompactInteger(message.getUserAgent().length());
		byte[] userAgent = message.getUserAgent().getBytes();
		byte[] startHeight = encodeLittleEndian(message.getStartHeight());
		byte[] relay = encodeLittleEndian(message.isRelay());

		byte[][] payload = new byte[14][];
		payload[0] = version;
		payload[1] = services;
		payload[2] = timestamp;
		payload[3] = addrRecvServices;
		payload[4] = addrRecvAddress;
		payload[5] = addrRecvPort;
		payload[6] = addrTransServices;
		payload[7] = addrTransAddress;
		payload[8] = addrTransPort;
		payload[9] = nonce;
		payload[10] = userAgentSize;
		payload[11] = userAgent;
		payload[12] = startHeight;
		payload[13] = relay;

		return encodePayloadWithHeader(message.getCommandName(), payload);
	}

	private static byte[] encodePayloadWithHeader(String commandName, byte[][] payload) {

		byte[] payloadBuff = flatArray(payload);
		int payloadSize = (payloadBuff) == null ? 0 : payloadBuff.length;

		byte[][] header = new byte[4][];
		header[0] = encodeLittleEndian(MessageHeader.TestnetMagic);
		header[1] = encodeHeaderCommandName(commandName);
		header[2] = encodeLittleEndian(payloadSize);
		header[3] = (payloadSize == 0) ? encodeLittleEndian(EMPTY_PAYLOAD_CHECKSUM) : encodeHeaderChecksum(payloadBuff);

		byte[] headerBuff = flatArray(header);
		if (headerBuff == null || headerBuff.length == 0) {
			return null;
		}

		byte[] encoded = new byte[headerBuff.length + payloadSize];
		System.arraycopy(headerBuff, 0, encoded, 0, headerBuff.length);

		if (payloadSize > 0) {
			System.arraycopy(payloadBuff, 0, encoded, headerBuff.length, payloadSize);
		}

		return encoded;
	}

	private static byte[] flatArray(byte[][] arr) {
		int l = 0;
		for (byte[] a : arr) {
			l += a.length;
		}

		if (l == 0) {
			return null;
		}

		byte[] flatten = new byte[l];
		l = 0;
		for (byte[] a : arr) {
			System.arraycopy(a, 0, flatten, l, a.length);
			l += a.length;
		}

		return flatten;
	}

	private static byte[] encodeLittleEndian(short x) {
		return MessageEndianess.encodeLittleEndian(x);
	}

	private static byte[] encodeLittleEndian(int x) {
		return MessageEndianess.encodeLittleEndian(x);
	}

	private static byte[] encodeLittleEndian(long x) {
		return MessageEndianess.encodeLittleEndian(x);
	}

	private static byte[] encodeLittleEndian(boolean x) {
		return MessageEndianess.encodeLittleEndian(x);
	}

	private static byte[] encodeHeaderCommandName(String commandName) {
		return MessageUtils.encodeHeaderCommandName(commandName);
	}

	private static byte[] encodeHeaderChecksum(byte[] payload) {
		return MessageUtils.encodeHeaderChecksum(payload);
	}

	private static byte[] encodeCompactInteger(long x) {
		return MessageUtils.encodeCompactInteger(x);
	}
}
