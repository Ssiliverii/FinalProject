package com.portal.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.portal.command.PostGraduate;

public class PostGraduateTest {

	@Test
	public void testExecute_english() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("English");
		assertNotNull(pg);
	}

	@Test
	public void testExecute_telugu() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("Telugu");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_networking() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("Networking");
		assertNotNull(pg);
	}
	
	
	@Test
	public void testExecute_finance() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("Finance");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_operations() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("Operations");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_psqt() {
		PostGraduate pg = new PostGraduate();
		pg.prepareQuestionPaper("PSQT");
		assertNotNull(pg);
	}
	
	}
