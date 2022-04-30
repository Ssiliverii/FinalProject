package com.portal;

import com.portal.factory.Examination;
import com.portal.factory.ExamPortalFactory;

public class ExamPortal {
	
		public static void main(String[] args) {
		
		UserType userType = new UserType();
		String user = userType.chooseUser();
		Examination es = ExamPortalFactory.chooseGrade(user);
		es.grade();
		
		System.out.println();
		String user1 = userType.chooseUser();
		Examination es1 = ExamPortalFactory.chooseGrade(user1);
		es1.grade();
		
		System.out.println();
		String user2 = userType.chooseUser();
		Examination es2 = ExamPortalFactory.chooseGrade(user2);
		es2.grade();
	}
}
