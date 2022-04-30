package com.portal.template;


public abstract class ResultTemplate {
    
	public abstract String examinationGrades();
	public abstract String courseTypes();
	public abstract void results();
	
	public final String resultStructure()
    {
		String gradeName = examinationGrades();
		courseTypes();
		results();
		return gradeName;
    }
}