package cn.mob.jekin.entity;

import java.io.Serializable;

public class StudentScore implements Serializable{
	private String courseid;
	private String coursename;
	private String score;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}
