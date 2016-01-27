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

import java.security.InvalidParameterException;

import bitcoin4j.network.protocol.enums.InventoryTypeEnum;

/**
 * @author dezelin
 *
 */
public class Inventory {

	private InventoryTypeEnum typeIdentifier;
	private byte[] hash;

	/**
	 * 
	 */
	public Inventory(InventoryTypeEnum typeIdentifier, byte[] hash) {
		this.setTypeIdentifier(typeIdentifier);
		this.setHash(hash);
	}

	/**
	 * @return the typeIdentifier
	 */
	public InventoryTypeEnum getTypeIdentifier() {
		return typeIdentifier;
	}

	/**
	 * @param typeIdentifier
	 *            the typeIdentifier to set
	 */
	public void setTypeIdentifier(InventoryTypeEnum typeIdentifier) {
		this.typeIdentifier = typeIdentifier;
	}

	/**
	 * @return the hash
	 */
	public byte[] getHash() {
		return hash;
	}

	/**
	 * @param hash
	 *            the hash to set
	 */
	public void setHash(byte[] hash) {
		if (hash == null || hash.length != 32) {
			throw new InvalidParameterException();
		}

		this.hash = hash;
	}
}
