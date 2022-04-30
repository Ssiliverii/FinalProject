package com.portal.template;

import java.util.ArrayList;
import java.util.Scanner;

import com.portal.command.PostGraduate;
import com.portal.command.QuestionPaperCommand;
import com.portal.command.TenthClass;
import com.portal.command.TwelveClass;
import com.portal.command.UnderGraduate;
import com.portal.iterator.PortalIterator;

public class Admin extends ExamTemplate
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
    public void examSchedule() {
    	System.out.println("**************************");
    	if("10th".equals(examinationName)) {
		  System.out.println ("The 10th class examinations are scheduled from 23 March 2022 to 3rd April 2022");
		  System.out.println("23-March-2022  English");
		  System.out.println("26-March-2022  Telugu");
		  System.out.println("29-March-2022  Maths");
		  System.out.println("31-March-2022  Science");
		  System.out.println("3-April-2022   Social Studies");
		  
	    }else if("10+2".equals(examinationName)) {
	    	System.out.println ("The 10+2 class examinations are scheduled from 28 March 2022 to 7 April 2022");
	    	System.out.println("***** Examination Schedule for Science Group ****");
	    	  System.out.println("28-March-2022  English");
			  System.out.println("30-March-2022  Telugu");
			  System.out.println("02-April-2022  Maths");
			  System.out.println("04-April-2022  Physics");
			  System.out.println("07-April-2022  Chemistry");
			System.out.println("***** Examination Schedule for Arts Group ****");  
			  System.out.println("28-March-2022  English");
			  System.out.println("30-March-2022  Telugu");
			  System.out.println("02-April-2022  Commerce");
			  System.out.println("04-April-2022  Economics");
			  System.out.println("07-April-2022  Civics");
			 
	    }else if("Under Graduation".equals(examinationName)) {
	    	System.out.println ("The Under Graduation examinations are scheduled from 18 April 2022 to 30 APril 2022");
	    	System.out.println("***** Examination Schedule for B.Sc Group ****");
	    	  System.out.println("18-April-2022  English");
			  System.out.println("21-April-2022  Telugu");
			  System.out.println("24-April-2022  Maths");
			  System.out.println("27-April-2022  Physics");
			  System.out.println("30-April-2022  Electronics");
			System.out.println("***** Examination Schedule for B.com Group ****");  
			  System.out.println("28-April-2022  English");
			  System.out.println("21-April-2022  Telugu");
			  System.out.println("24-April-2022  Commerce");
			  System.out.println("27-April-2022  Economics");
			  System.out.println("30-April-2022  Civics");
			
	    }else if("Post Graduation".equals(examinationName)) {
	    	System.out.println ("The Post Graduation examinations are scheduled from 27 April 2022 to 19 May 2022");
	    	System.out.println("***** Examination Schedule for MCA Group ****");
	    	  System.out.println("27-April-2022  English");
			  System.out.println("30-April-2022  Telugu");
			  System.out.println("07-May-2022    Networking");
			  System.out.println("13-May-2022    PSQT");
			  System.out.println("19-May-2022    Java");
			System.out.println("***** Examination Schedule for MBA Group ****");  
			  System.out.println("27-April-2022  English");
			  System.out.println("30-April-2022  Telugu");
			  System.out.println("07-May-2022    Finance");
			  System.out.println("13-May-2022    Operations");
			  System.out.println("19-May-2022    Strategy & Leadership");
			
	    }
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
	public void subjects(){
    	Scanner mScanner = new Scanner(System.in);
    	System.out.println("**************************");
    	System.out.println("please select the Subject");
    	int i = 1;
		String[] examList = new String[6];
	
    	if("All Subjects".equals(courseName)) {
    		examList[0] = "English";
    		examList[1] ="Telugu";
    		examList[2] = "Maths";
    		examList[3] = "Science";
    		examList[4] ="Social";
    	}else if("Science".equals(courseName)) {
    		examList[0] = "English";
    		examList[1] ="Telugu";
    		examList[2] = "Maths";
    		examList[3] ="Physics";
    		examList[4] ="Chemistry";
    		
    	}else if("Arts".equals(courseName)) {
    		examList[0] = "English";
    		examList[1] ="Telugu";
    		examList[2] = "Civis";
    		examList[3] ="Commerce";
    		examList[4] ="Economics";
    		
  	    }else if("B.Sc".equals(courseName)) {
    		examList[0] = "English";
    		examList[1] ="Telugu";
    		examList[2] = "Maths";
    		examList[3] ="Physics";
    		examList[4] ="Electronics";

  	    } else if("B.Com".equals(courseName)) {
  		examList[0] = "English";
		examList[1] ="Telugu";
		examList[2] = "Civis";
		examList[3] ="Commerce";
		examList[4] ="Economics";
			
	    }else if("MCA".equals(courseName)) {
	  		examList[0] = "English";
			examList[1] ="Telugu";
			examList[2] = "Networking";
			examList[3] ="PSQT";
			examList[4] ="Java";
			
	    }else if("MBA".equals(courseName)) {
	  		examList[0] = "English";
			examList[1] ="Telugu";
			examList[2] = "Finance";
			examList[3] ="Operations";
			examList[4] ="Strategy & Leadership";
			
	    }
    	
    	PortalIterator iterator = new PortalIterator(examList);
		while(iterator.hasNext()) {
			String exam = (String) iterator.next();
			System.out.println(i + "  " + exam);
			i = i + 1;
		}
		String selectedSubject = examList[mScanner.nextInt()-1];
		
		if("All Subjects".equals(courseName)) {
			QuestionPaperCommand qpc = new TenthClass();
			qpc.prepareQuestionPaper(selectedSubject);
		}else if("Science".equals(courseName)) {
			QuestionPaperCommand qpc = new TwelveClass();
			qpc.prepareQuestionPaper(selectedSubject);
		}else if("Arts".equals(courseName)) {
			QuestionPaperCommand qpc = new TwelveClass();
			qpc.prepareQuestionPaper(selectedSubject);
		}else if("B.Sc".equals(courseName)) {
			QuestionPaperCommand qpc = new UnderGraduate();
			qpc.prepareQuestionPaper(selectedSubject);
		} else if("B.Com".equals(courseName)) {
			QuestionPaperCommand qpc = new UnderGraduate();
			qpc.prepareQuestionPaper(selectedSubject);
		}else if("MCA".equals(courseName)) {
			QuestionPaperCommand qpc = new PostGraduate();
			qpc.prepareQuestionPaper(selectedSubject);
		}else if("MBA".equals(courseName)) {
			QuestionPaperCommand qpc = new PostGraduate();
			qpc.prepareQuestionPaper(selectedSubject);
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
