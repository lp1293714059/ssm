package cn.mob.jekin.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Course implements Serializable{

	private String courseid;
	private String coursename;
	private String teacher;
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	

}
