package org.codezarvis.artifactory.tests;

import org.junit.Test;

import static org.junit.Assert.*;

import org.codezarvis.artifactory.controller.HomeController;

public class HomeControllerTest {

	
	@Test
	public void testHomeName() {
		HomeController controller = new HomeController();
		assertEquals("Home", controller.homeName());
	}
}
