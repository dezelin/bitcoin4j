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
package bitcoin4j.network.encoding.test;

import static org.junit.Assert.*;

import java.io.InvalidClassException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import bitcoin4j.network.protocol.encoding.MessageSerializer;
import bitcoin4j.network.protocol.enums.ServiceIdentifiersEnum;
import bitcoin4j.network.protocol.messages.VersionMessage;

/**
 * @author dezelin
 *
 */
public class MessageSerializerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for
	 * {@link bitcoin4j.network.protocol.encoding.MessageSerializer#encode(bitcoin4j.network.protocol.messages.Message)}
	 * .
	 */
	@Test
	public final void testEncode() {
		byte[] buffer = null;
		try {
			MessageSerializer serializer = new MessageSerializer();
			VersionMessage message = new VersionMessage(
					1234, 
					ServiceIdentifiersEnum.NODE_NETWORK, 
					6789, 
					ServiceIdentifiersEnum.UNNAMED, 
					new byte[]{0, 1, 2, 3, 4}, 
					(short)8333, 
					ServiceIdentifiersEnum.NODE_NETWORK, 
					new byte[]{5, 6, 7, 8, 9}, 
					(short)7777, 
					123456789L, 
					"Vanilla", 
					1, 
					true);
			buffer = serializer.encode(message);
		} catch (InvalidClassException ex) {
			// TODO: Log error message
		}
		
		assertNotNull(buffer);
	}

}
