package com.cg.jpa;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_hib2")

public class Manager extends Employee {
	private String deptName;
	@Override
	public String toString() {
		return super.toString()+" Manager :deptName=" + deptName + "]";
	}

	public Manager() {
	}

	public Manager(int id, String name, long mobile) {
		super(id, name, mobile);
	}

	public Manager(String name, long mobile, String deptName) {
		super(name, mobile);
		this.deptName=deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}

