package com.portal.factory;

import com.portal.template.Admin;
import com.portal.template.ExamTemplate;

public class AdminUser implements Examination {
	public void grade() {
		  ExamTemplate et = new Admin(); 
		  et.examStructure();
    }
}
