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
import bitcoin4j.network.protocol.structs.RawTransaction;

/**
 * Block
 * <p>
 * The block message transmits a single serialized block in the format described
 * in the serialized blocks section.
 * <p>
 * See <a href="https://bitcoin.org/en/developer-reference#serialized-blocks">
 * Serialized Blocks</a> for an example hexdump.
 * <p>
 * It can be sent for two different reasons:
 * <p>
 * GetData Response: Nodes will always send it in response to a getdata message
 * that requests the block with an inventory type of MSG_BLOCK (provided the
 * node has that block available for relay).
 * <p>
 * Unsolicited: Some miners will send unsolicited block messages broadcasting
 * their newly-mined blocks to all of their peers. Many mining pools do the same
 * thing, although some may be misconfigured to send the block from multiple
 * nodes, possibly sending the same block to some peers more than once.
 * 
 */
public class BlockMessage implements DataMessage {

	private static final String commandName = "block";
	
	private BlockHeader blockHeader;
	private RawTransaction[] txns;

	public BlockMessage(BlockHeader header, RawTransaction[] txns) {
		this.setBlockHeader(header);
		this.setTxns(txns);
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
	 * @return the txnCount
	 */
	public int getTxnCount() {
		return txns.length;
	}

	/**
	 * @return the txns
	 */
	public RawTransaction[] getTxns() {
		return txns;
	}

	/**
	 * @param txns
	 *            the txns to set
	 */
	public void setTxns(RawTransaction[] txns) {
		this.txns = txns;
	}

	@Override
	public String getCommandName() {
		return commandName;
	}
}
