package com.javalec.ex;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	
	public void bmiCalculation() {
		bmiCalculator.bmicalculation(weight, height);
	}
	
	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("height" + height);
		System.out.println("weight" + weight);
		System.out.println("hobbys" + hobbys);
		bmiCalculation();
	}
	
}
