package cn.mob.jekin.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SelectCourse implements Serializable{

	private String stuid;
	private String courseid;
	private String score;
	private String id;
	
	@Override
	public String toString() {
		return "SelectCourse [stuid=" + stuid + ", courseid=" + courseid
				+ ", score=" + score + ", id=" + id + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	

}
