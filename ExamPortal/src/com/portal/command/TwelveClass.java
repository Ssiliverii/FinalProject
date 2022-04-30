package com.portal.command;

public class TwelveClass implements QuestionPaperCommand {

	public void prepareQuestionPaper(String subject) {
		System.out.println("The following are the questions for Final exams. Each question carries 10 marks");
		if ("English".equalsIgnoreCase(subject)) {
			 getEnglishPaper();
		} else if ("Telugu".equalsIgnoreCase(subject)) {
			  getTeluguPaper();
		}else if ("Maths".equalsIgnoreCase(subject)) {
			  getMathsPaper();
		}else if ("Physics".equalsIgnoreCase(subject)) {
			 getSciencePaper();
		}else if ("Chemistry".equalsIgnoreCase(subject)) {
			getSciencePaper();
		}else if ("Civis".equalsIgnoreCase(subject)) {
			 getSocialPaper();
		}else if ("Commerce".equalsIgnoreCase(subject)) {
			 getSocialPaper();
		}else if ("Economics".equalsIgnoreCase(subject)) {
			 getSocialPaper();
		}

	}
	
	public void getEnglishPaper() {
		
		System.out.println("1) List one reason as to why we should give 'due consideration to ventilation'?");
		System.out.println("2) Why are the children of smoking parents more prone to 'hospital admissions'?");
		System.out.println("3) How does the writer justify emphasising ventilation over eliminating the source of pollutant?");
		System.out.println("4) State a reason for air being contaminated with noxious substances.");
	}
	
	public void getTeluguPaper() {
		System.out.println("1) Explain about Namavachakam");
		System.out.println("2) Write 3 examples for guna sandhi");
		System.out.println("3) Briefly explain about Ramapa Temple");
	}

	public void getMathsPaper() {
		System.out.println("1) What are Rational Numbers. Example with 2 examples");
		System.out.println("2) Evaluate 15/4*16/5");
		System.out.println("3) Explain Pythogorus Theorem");
	}

	public void getSciencePaper() {
		System.out.println("1) Draw the magnetic field lines around a straight current carrying conductor. ");
		System.out.println("2) Veins are thin walled and have valves. Justify. ");
		System.out.println("3) Explain how ozone being a deadly poison can still perform an essential function for our environment.  ");
		System.out.println("4) Give reason why a food chain cannot have more than four trophic levels. ");
		
	}

	public void getSocialPaper() {
		System.out.println("1) Suggest and explain any three ways to protect land from degradation in various states of India.  ");
		System.out.println("2) Describe any three federal features of Indian democracy. ");
		System.out.println("3) The issue of sustainability is important for development. Examine the statement. ");
		System.out.println("4) Describe any three steps taken by the government towards decentralization in the year 1992. ");
		System.out.println("5) Like Germany, Italy too had a long history of political fragmentation. Explain. ");
	}

}
