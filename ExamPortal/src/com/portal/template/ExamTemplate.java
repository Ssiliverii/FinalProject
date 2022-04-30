package com.portal.template;


public abstract class ExamTemplate {
    
	public abstract String examinationGrades();
	public abstract String courseTypes();
	public abstract void examSchedule();
	public abstract void subjects();

	public final String examStructure()
    {
		String gradeName = examinationGrades();
		examSchedule();
		courseTypes();
		subjects();
		return gradeName;
    }
}