package com.portal.factory;

import com.portal.template.ResultTemplate;
import com.portal.template.Student;

public class StudentUser implements Examination {

	public void grade() {
		  ResultTemplate et = new Student(); 
		  et.resultStructure();
		}
}
