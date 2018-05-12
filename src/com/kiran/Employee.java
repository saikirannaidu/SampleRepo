package com.kiran;

public class Employee {
private int empId;
private String empName;
private String loc;
public Employee() {
	super();
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", loc=" + loc
			+ "]";
}

}
