package com.portal.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.portal.command.TwelveClass;

public class TwelveClassTest {

	@Test
	public void testExecute_english() {
		TwelveClass pg = new TwelveClass();
		pg.prepareQuestionPaper("English");
		assertNotNull(pg);
	}

	@Test
	public void testExecute_telugu() {
		TwelveClass pg = new TwelveClass();
		pg.prepareQuestionPaper("Telugu");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_physics() {
		TwelveClass pg = new TwelveClass();
		pg.prepareQuestionPaper("Physics");
		assertNotNull(pg);
	}
	
	
	@Test
	public void testExecute_civics() {
		TwelveClass pg = new TwelveClass();
		pg.prepareQuestionPaper("Civis");
		assertNotNull(pg);
	}
	
	
	}
