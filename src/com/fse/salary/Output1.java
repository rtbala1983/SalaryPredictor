package com.fse.salary;

public class Output1 {
	
	int year;
	double startingSal;
	int noIncrement;

	int percentIncreament;
	double increamentAmt;
	double dedtAMt;
	int dedtPct;
	int noDedt;
	double salGrowth;
	public Output1(int year, double startingSal, int noIncrement, int percentIncreament , double dedtAmt, int noDedt) {
		super();
		this.year = year;
		this.startingSal = startingSal;
		this.noIncrement = noIncrement;
		this.percentIncreament = percentIncreament;
		this.dedtAMt = dedtAmt;
		this.noDedt = noDedt;

		this.increamentAmt = (noIncrement*percentIncreament*startingSal)/100;
		this.dedtPct =((int) dedtAmt*100*noDedt)/(int)startingSal;
		this.salGrowth = (100 *(increamentAmt -dedtAmt))/startingSal;

		
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
	public double getIncreamentAmt() {
		return increamentAmt;
	}
	public void setIncreamentAmt(double increamentAmt) {
		this.increamentAmt = increamentAmt;
	}

	public double getDedtAMt() {
		return dedtAMt;
	}
	public double getAnnualDedtAMt() {
		return dedtAMt*noDedt;
	}

	public void setDedtAMt(double dedtAMt) {
		this.dedtAMt = dedtAMt;
	}

	public int getDedtPct() {
		return dedtPct;
	}

	public void setDedtPct(int dedtPct) {
		this.dedtPct = dedtPct;
	}

	public int getNoDedt() {
		return noDedt;
	}

	public void setNoDedt(int noDedt) {
		this.noDedt = noDedt;
	}

	public double getSalGrowth() {
		return salGrowth;
	}

	public void setSalGrowth(double salGrowth) {
		this.salGrowth = salGrowth;
	}

}
