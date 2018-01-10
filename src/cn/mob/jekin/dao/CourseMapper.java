package cn.mob.jekin.dao;

import java.util.List;

import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.User;

public interface CourseMapper extends BaseMapper<Course>{
	
	public List<Course> getAll();
	public List<Course> getAllSelect(User user);
	public void addcourse(Course course);
	public Course getOne(String courseid);
	public void edit(Course course);
	public void deleteCourse(String courseid);
}
