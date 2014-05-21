/**
 * Copyright 2014 Fernando Rincon Martin <frm.rincon@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openeos.erp.core.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openeos.erp.core.INameValue;
import org.openeos.erp.core.model.Client;
import org.openeos.erp.core.model.Organization;
import org.openeos.services.dictionary.IIdentificationCapable;

public class TestInterfaces {

	@Test
	public void test() {
		Organization org = new Organization();
		assertTrue(org instanceof INameValue);
		assertTrue(org instanceof IIdentificationCapable);
		org.setName("Name");
		org.setValue("Value");
		assertEquals("Value - Name", ((IIdentificationCapable) org).getIdentifier());
		
		Client cli = new Client();
		assertTrue(cli instanceof INameValue);
		assertTrue(cli instanceof IIdentificationCapable);
		cli.setName("Name");
		cli.setValue("Value");
		assertEquals("Value - Name", ((IIdentificationCapable) cli).getIdentifier());
	}

}