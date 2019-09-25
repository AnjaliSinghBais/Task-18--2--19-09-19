package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

@Entity
public class Student {
	@Id
	@Digits(integer=2,message="only numbers allowed", fraction = 0)
	private int rno;
	@Pattern(regexp="[a-z  A-Z]*",message="only alphabetes allowed")
	private String name;
	private String branch;
	private int sem;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", branch=" + branch
				+ ", sem=" + sem + "]";
	}
	
}
