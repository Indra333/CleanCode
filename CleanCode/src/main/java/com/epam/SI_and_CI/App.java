package com.epam.SI_and_CI;
import java.util.*;
public class App 
{
    private static Scanner sc;

	public static void main( String[] args )
    {
    	sc = new Scanner(System.in);
    	System.out.println("1. Simple Interest");
    	System.out.println("2. Compound Interest\n");
    	System.out.println("Enter your choice: ");
    	int choice=sc.nextInt();
    	
    	if(choice==1) {    	
        SimpleAndCompoundInterest sici=new SimpleAndCompoundInterest();
        double amount=sici.calSimpleInterest(2500.00, 3.5, 10.35);// principle, no.of times time periods, rate of interest.
        System.out.println("simple interest: "+amount);
    	}
    	else if(choice == 2) {
        SimpleAndCompoundInterest sici=new SimpleAndCompoundInterest();
        double amount=sici.calCompoundInterest(2500.00, 10.35, 10, 1.5);// principle, rate of interest, no.of times interest applied, no.of times time periods.
        System.out.println("Compound interest: "+amount);
    	}
    	
    	else {
    		System.out.println("Invalid choice\n");
    	}
    }
}
