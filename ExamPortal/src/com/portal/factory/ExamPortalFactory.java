package com.portal.factory;

public class ExamPortalFactory {

	public static Examination chooseGrade(String user) {

		if ("admin".equalsIgnoreCase(user)) {
			return new AdminUser();
		} else if ("student".equalsIgnoreCase(user)) {
			return new StudentUser();
		}
		return null;
	}
}
