package com.portal.template;

import java.util.ArrayList;
import java.util.Scanner;

import com.portal.command.PostGraduate;
import com.portal.command.QuestionPaperCommand;
import com.portal.command.TenthClass;
import com.portal.command.TwelveClass;
import com.portal.command.UnderGraduate;
import com.portal.iterator.PortalIterator;

public class Student extends ResultTemplate
{
	String examinationName = "";
	String courseName = "";
    @Override
    public String examinationGrades() {
    	System.out.println("**************************");
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("Please Select the examination ");
		int i = 1;
		String[] examList = new String[4];
		examList[0] = "10th";
		examList[1] ="10+2";
		examList[2]="Under Graduation";
		examList[3]="Post Graduation";
		PortalIterator iterator = new PortalIterator(examList);
		while(iterator.hasNext()) {
			String exam = (String) iterator.next();
			System.out.println(i + "  " + exam);
			i = i + 1;
		}
		examinationName = getExaminationList().get(mScanner.nextInt()-1);
		
		return examinationName;
    }
    	
     @Override
    public String courseTypes() {
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("**************************");
    	System.out.println("please select the course type ");
    	int i = 1;
		String[] examList = new String[4];
	
    	if("10th".equals(examinationName)) {
    		examList[0] = "All Subjects";
    		
    	}else if("10+2".equals(examinationName)) {
    		examList[0] = "Science";
    		examList[1] ="Arts";
    		
    	}else if("Under Graduation".equals(examinationName)) {
    		examList[0] = "B.Sc";
    		examList[1] ="B.Com";
    		
  	    }else if("Post Graduation".equals(examinationName)) {
  	    	examList[0] = "MCA";
  			examList[1] ="MBA";
  			
  	    }
    	
    	PortalIterator iterator = new PortalIterator(examList);
		while(iterator.hasNext()) {
			String exam = (String) iterator.next();
			System.out.println(i + ") " + exam);
			i = i + 1;
		}
		courseName = examList[mScanner.nextInt()-1];
		
		return courseName;
 
    }
	
    @Override
	public void results(){
    	System.out.println("please select the Subject");
    	
    	if("All Subjects".equals(courseName)) {
    	  System.out.println("Congratulations you scored 81 percent");
    	}else if("Science".equals(courseName)) {
    		System.out.println("Congratulations you scored 79 percent");
    	}else if("Arts".equals(courseName)) {
    		System.out.println("Congratulations you scored 67 percent");
  	    }else if("B.Sc".equals(courseName)) {
  	    	System.out.println("Congratulations you scored 92 percent");
  	    } else if("B.Com".equals(courseName)) {
  	    	System.out.println("Congratulations you scored 98 percent");
	    }else if("MCA".equals(courseName)) {
	    	System.out.println("Congratulations you scored 71 percent");
	    }else if("MBA".equals(courseName)) {
	    	System.out.println("Congratulations you scored 55 percent");
	    }
    	
    	
    }
    
    public ArrayList<String> getExaminationList() {
		ArrayList<String> examList = new ArrayList<String>();
		examList.add("10th");
		examList.add("10+2");
		examList.add("Under Graduation");
		examList.add("Post Graduation");
		return examList;
	}

}
