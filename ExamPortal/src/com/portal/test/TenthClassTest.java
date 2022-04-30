package com.portal.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.portal.command.TenthClass;

public class TenthClassTest {

	@Test
	public void testExecute_english() {
		TenthClass pg = new TenthClass();
		pg.prepareQuestionPaper("English");
		assertNotNull(pg);
	}

	@Test
	public void testExecute_telugu() {
		TenthClass pg = new TenthClass();
		pg.prepareQuestionPaper("Telugu");
		assertNotNull(pg);
	}
	
	@Test
	public void testExecute_social() {
		TenthClass pg = new TenthClass();
		pg.prepareQuestionPaper("Social");
		assertNotNull(pg);
	}
	
	
	@Test
	public void testExecute_science() {
		TenthClass pg = new TenthClass();
		pg.prepareQuestionPaper("Science");
		assertNotNull(pg);
	}
	
	
	}
