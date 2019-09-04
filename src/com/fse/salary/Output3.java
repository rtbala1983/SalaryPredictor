package com.fse.salary;

public class Output3 {
	
	int year;
	double startingSal;
	int noIncrement;

	int percentIncreament;
	int increamentAmt;
	public Output3(int year, double startingSal, int noIncrement, int percentIncreament ) {
		super();
		this.year = year;
		this.startingSal = startingSal;
		this.noIncrement = noIncrement;
		this.percentIncreament = percentIncreament;
		System.out.println("noIncrement"+noIncrement);
		System.out.println("percentIncreament"+percentIncreament);
		System.out.println("startingSal"+startingSal);
		
		this.increamentAmt = (noIncrement*percentIncreament*(int) startingSal)/100;
		System.out.println("increamentAmt"+increamentAmt);
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getStartingSal() {
		return startingSal;
	}
	public void setStartingSal(double startingSal) {
		this.startingSal = startingSal;
	}
	public int getNoIncrement() {
		return noIncrement;
	}
	public void setNoIncrement(int noIncrement) {
		this.noIncrement = noIncrement;
	}
	public int getPercentIncreament() {
		return percentIncreament;
	}
	public void setPercentIncreament(int percentIncreament) {
		this.percentIncreament = percentIncreament;
	}
	public int getIncreamentAmt() {
		return increamentAmt;
	}
	public void setIncreamentAmt(int increamentAmt) {
		this.increamentAmt = increamentAmt;
	}

}
