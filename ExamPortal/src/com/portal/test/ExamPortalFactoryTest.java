package com.portal.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.portal.factory.AdminUser;
import com.portal.factory.ExamPortalFactory;
import com.portal.factory.Examination;
import com.portal.factory.StudentUser;

public class ExamPortalFactoryTest {

	@Test
	public void adminTest() {
		ExamPortalFactory epf = new ExamPortalFactory();
		Examination co = ExamPortalFactory.chooseGrade("admin");
		assertNotNull(co);
		assertTrue(co instanceof AdminUser);
	}

	@Test
	public void studentTest() {
		ExamPortalFactory epf = new ExamPortalFactory();
		Examination co = ExamPortalFactory.chooseGrade("student");
		assertNotNull(co);
		assertTrue(co instanceof StudentUser);
	}

	}
