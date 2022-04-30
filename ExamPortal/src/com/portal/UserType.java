package com.portal;

import java.util.Scanner;

import com.portal.iterator.PortalIterator;

public class UserType {
	
	String selUser = "";
	
	public String chooseUser() {
		Scanner s = new Scanner(System.in); 
        System.out.println("please select the user");
			int i =1;
			String[] aList = new String[10];
			aList[0] ="Admin";
			aList[1] = "Student";
			
			PortalIterator ite = new PortalIterator(aList);
			while(ite.hasNext()) {
				String userType = (String)ite.next();
				System.out.println(i+" "+userType);
				i = i+1;
			}
			
						
			switch(s.nextInt()) {
			case 1: selUser = "admin";
			        break;
			case 2: selUser = "student";
	        		break;
					
			}
		return selUser;
	}
}
