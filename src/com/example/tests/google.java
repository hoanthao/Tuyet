package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class google {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "https://www.google.com/");
		selenium.start();
	}

	@Test
	public void testGoogle() throws Exception {
		selenium.open("/?gws_rd=ssl");
		selenium.type("id=lst-ib", "hello");
		selenium.click("link=Hello Lionel Richie nghe tải nhạc 320 | txUQIElDIc");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
