package com.epam.SI_and_CI;
public class SimpleAndCompoundInterest {
	double calSimpleInterest(double principle, double time, double rate_of_interest) {
		double amount=(principle*time*rate_of_interest)/100;
		return amount;
	}
	
	double calCompoundInterest(double principle, double rate_of_interest, int no_of_times_interest_applied, double time_period) {
		double amount=principle*(Math.pow(1+(rate_of_interest/no_of_times_interest_applied),(no_of_times_interest_applied * time_period)));
		return amount;
	}
}
