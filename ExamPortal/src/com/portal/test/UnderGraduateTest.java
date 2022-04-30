package com.portal.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.portal.command.UnderGraduate;

public class UnderGraduateTest {

	@Test
	public void testExecute_english() {
		UnderGraduate pg = new UnderGraduate();
		pg.prepareQuestionPaper("English");
		assertNotNull(pg);
	}

	@Test
	public void testExecute_telugu() {
		UnderGraduate pg = new UnderGraduate();
		pg.prepareQuestionPaper("Telugu");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_electronics() {
		UnderGraduate pg = new UnderGraduate();
		pg.prepareQuestionPaper("Electronics");
		assertNotNull(pg);
	}
	
	
	@Test
	public void testExecute_civics() {
		UnderGraduate pg = new UnderGraduate();
		pg.prepareQuestionPaper("Civis");
		assertNotNull(pg);
	}
	
	
	}
