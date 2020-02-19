package com.epam.CleanCode;

public class House_Construction_Cost {
	
	public double House_Construction_Cost1(int area_of_land, String material_standard) {
		if(material_standard=="Standard") {
			double cost=area_of_land*1200;
			return cost;
		}
		else{
			double cost=area_of_land*1500;
			return cost;
		}
	}
	
	public double House_Construction_Cost2(int area_of_land, String material_standard, String fully_Automated) {
		double cost=0;
		if(material_standard=="High Standard" && fully_Automated=="yes") {
			cost=area_of_land*2500;
		}
		else if(material_standard=="High Standard" && fully_Automated=="no"){
			cost=area_of_land*1800;
		}
		return cost;
	}
	
}
