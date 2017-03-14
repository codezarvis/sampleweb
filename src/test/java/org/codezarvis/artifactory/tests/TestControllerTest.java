package org.codezarvis.artifactory.tests;

import org.junit.Test;

import static org.junit.Assert.*;

import org.codezarvis.artifactory.controller.TestController;
public class TestControllerTest {

	@Test
	public void testHome() {
		
		TestController controller = new TestController();
		assertEquals("TestHome", controller.testHome());
	}
}
