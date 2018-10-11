package com.yidu.bean;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	private Integer tid;
	private String tname;
	private String sex;
	private Set<Student> studentSet=new HashSet<Student>();
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Teacher() {
	}
	public Teacher(Integer tid, String tname, String sex) {
		this.tid = tid;
		this.tname = tname;
		this.sex = sex;
	}
	
}
