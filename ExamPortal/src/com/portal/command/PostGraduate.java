package com.portal.command;

public class PostGraduate implements QuestionPaperCommand {

	public void prepareQuestionPaper(String subject) {
		System.out.println("The following are the questions for Final exams. Each question carries 10 marks");
		if ("English".equalsIgnoreCase(subject)) {
			 getEnglishPaper();
		} else if ("Telugu".equalsIgnoreCase(subject)) {
			  getTeluguPaper();
		}else if ("Networking".equalsIgnoreCase(subject)) {
			  getNetworkingPaper();
		}else if ("PSQT".equalsIgnoreCase(subject)) {
			 getPSQTPaper();
		}else if ("Java".equalsIgnoreCase(subject)) {
			 getJavaPaper();
		}else if ("Finance".equalsIgnoreCase(subject)) {
			 getFinancePaper();
		}else if ("Operations".equalsIgnoreCase(subject)) {
			 getOperationsPaper();
		}else if ("Strategy & Leadership".equalsIgnoreCase(subject)) {
			 getStrategyPaper();
		}

	}
	
	private void getEnglishPaper() {
		
		System.out.println("1) List one reason as to why we should give 'due consideration to ventilation'?");
		System.out.println("2) Why are the children of smoking parents more prone to 'hospital admissions'?");
		System.out.println("3) How does the writer justify emphasising ventilation over eliminating the source of pollutant?");
		System.out.println("4) State a reason for air being contaminated with noxious substances.");
	}
	
	public void getTeluguPaper() {
		System.out.println("1) Explain about Jhansi Laxmi bai");
		System.out.println("2) Why Durgacharan struggle to go to school");
		System.out.println("3) Explain difference between hallulu and deergallu");
	}

	public void getNetworkingPaper() {
		System.out.println("1) What are Rational Numbers. Example with 2 examples");
		System.out.println("2) Evaluate 15/4*16/5");
		System.out.println("3) Explain Pythogorus Theorem");
	}

	public void getPSQTPaper() {
		System.out.println("1) Draw the magnetic field lines around a straight current carrying conductor. ");
		System.out.println("2) Veins are thin walled and have valves. Justify. ");
		System.out.println("3) Explain how ozone being a deadly poison can still perform an essential function for our environment.  ");
		System.out.println("4) Give reason why a food chain cannot have more than four trophic levels. ");
		
	}

	public void getFinancePaper() {
		System.out.println("1) Suggest and explain any three ways to protect land from degradation in various states of India.  ");
		System.out.println("2) Describe any three federal features of Indian democracy. ");
		System.out.println("3) The issue of sustainability is important for development. Examine the statement. ");
		System.out.println("4) Describe any three steps taken by the government towards decentralization in the year 1992. ");
		System.out.println("5) Like Germany, Italy too had a long history of political fragmentation. Explain. ");
	}
	
	public void getJavaPaper() {
		System.out.println("1) Difference between break and continue statements  ");
		System.out.println("2) Explain about switch statement ");
		System.out.println("3) Difference between HashMap and Hashtable with an example ");
		System.out.println("4) Explain about Try with resource ");
		System.out.println("5) Write an example to display reverse of a number ");
	}
	
	public void getOperationsPaper() {
		System.out.println("1) What are Rational Numbers. Example with 2 examples");
		System.out.println("2) Evaluate 15/4*16/5");
		System.out.println("3) Explain Pythogorus Theorem");
	}
	
	public void getStrategyPaper() {
		System.out.println("1) What are Rational Numbers. Example with 2 examples");
		System.out.println("2) Evaluate 15/4*16/5");
		System.out.println("3) Explain Pythogorus Theorem");
	}
	
	
}
