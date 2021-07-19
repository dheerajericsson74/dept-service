package com.star.dept.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Department {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptId;
	
	private String deptName;
	private String deptAddr;
    private String deptCode;
    
    
    
    public Department() {
    	
    	super();
    	
    }
    
    
	public Department(Long deptId, String deptName, String deptAddr, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddr = deptAddr;
		this.deptCode = deptCode;
	}

	/**
	 * @return the deptId
	 */
	public Long getDeptId() {
		return deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the deptAddr
	 */
	public String getDeptAddr() {
		return deptAddr;
	}
	/**
	 * @param deptAddr the deptAddr to set
	 */
	public void setDeptAddr(String deptAddr) {
		this.deptAddr = deptAddr;
	}
	/**
	 * @return the deptCode
	 */
	public String getDeptCode() {
		return deptCode;
	}
	/**
	 * @param deptCode the deptCode to set
	 */
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAddr=" + deptAddr + ", deptCode="
				+ deptCode + "]";
	}
    
    
    
    

}
