package lab14;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	int num = 0;
	String grades = ""; //add a double[] array instance variable
	public double[] gradeArray;
	
	public Grades(int a, String b){
		num = a;
		grades = b;
	}

	public void setArray(){
		gradeArray = new double[num];
		int count =0;
		Scanner scan2 = new Scanner(grades);
		while(scan2.hasNext()){
			gradeArray[count]=  scan2.nextInt();	
		count++;}
		
	}
	private double getSum(){
		double sum = 0.0;
			Scanner scan = new Scanner(grades);
			while(scan.hasNext()){
				sum +=  scan.nextDouble();	
			}
			return sum;
	}
	public double getAverage(){
		double average = 0.0;
			average = (getSum()/num);
		
		return average;
	}

	public String toString(){
		String output = ""; 
		int count = 0;
		for(int i = 0; i<gradeArray.length-1; i++){
			output += ("grade " + count + " ::  " + gradeArray[i] + "\n");
		}
		output += "\n" + getAverage(); 
		return output; 
	}
	

}