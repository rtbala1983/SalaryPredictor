package com.fse.salary;

public class Output2 {
	
	int year;
	double startingSal;
	int noDed;

	int percentDedt;
	int dedtAmt;
	public Output2(int year, double startingSal, int noDed, int dedtAmt ) {
		super();
		this.year = year;
		this.startingSal = startingSal;
		this.noDed = noDed;
		this.dedtAmt = dedtAmt;
		
		this.percentDedt = (noDed*dedtAmt*(int) startingSal)/100;
//		System.out.println("increamentAmt"+increamentAmt);
		
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
//	public int getNoIncrement() {
//		return noIncrement;
//	}
//	public void setNoIncrement(int noIncrement) {
//		this.noIncrement = noIncrement;
//	}
//	public int getPercentIncreament() {
//		return percentIncreament;
//	}
//	public void setPercentIncreament(int percentIncreament) {
//		this.percentIncreament = percentIncreament;
//	}
//	public int getIncreamentAmt() {
//		return increamentAmt;
//	}
//	public void setIncreamentAmt(int increamentAmt) {
//		this.increamentAmt = increamentAmt;
//	}

}
