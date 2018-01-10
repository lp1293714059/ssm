package cn.mob.jekin.modal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mob.jekin.dao.CourseMapper;
import cn.mob.jekin.dao.InfoMapper;
import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.User;
import cn.mob.jekin.modal.CourseService;
@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseMapper.getAll();
	}

	@Override
	public void addcourse(Course course) {
		// TODO Auto-generated method stub
		courseMapper.addcourse(course);
	}

	@Override
	public Course getOne(String courseid) {
		// TODO Auto-generated method stub
		return courseMapper.getOne(courseid);
	}

	@Override
	public void edit(Course course) {
		// TODO Auto-generated method stub
		courseMapper.edit(course);
	}

	@Override
	public void deleteCourse(String courseid) {
		// TODO Auto-generated method stub
		courseMapper.deleteCourse(courseid);
	}

	@Override
	public List<Course> getAllSelect(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getuser_name()+"啦啦啦啦");
		return courseMapper.getAllSelect(user);
	}

}
