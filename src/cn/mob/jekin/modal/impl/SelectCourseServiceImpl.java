package cn.mob.jekin.modal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mob.jekin.dao.CourseMapper;
import cn.mob.jekin.dao.SelectCourseMapper;
import cn.mob.jekin.entity.SelectCourse;
import cn.mob.jekin.entity.StudentScore;
import cn.mob.jekin.modal.SelectCourseService;
@Service("selectcourseService")
public class SelectCourseServiceImpl implements SelectCourseService {
	@Autowired
	private SelectCourseMapper selectcourseMapper;
	@Override
	public void addselectcourse(SelectCourse selectcourse) {
		// TODO Auto-generated method stub
		selectcourseMapper.addselectcourse(selectcourse);
	}
	@Override
	public void deleteselectcourse(SelectCourse selectcourse) {
		// TODO Auto-generated method stub
		selectcourseMapper.deleteselectcourse(selectcourse);
	}
	@Override
	public List<StudentScore> getStudentScore(SelectCourse selectCourse) {
		// TODO Auto-generated method stub
		return selectcourseMapper.getStudentScore(selectCourse);
	}
	@Override
	public List<SelectCourse> getAll() {
		// TODO Auto-generated method stub
		return selectcourseMapper.teachergivescore();
	}
	@Override
	public SelectCourse getOne(SelectCourse selectCourse) {
		// TODO Auto-generated method stub
		return selectcourseMapper.getOne(selectCourse);
	}
	@Override
	public void edit(SelectCourse selectcourse) {
		// TODO Auto-generated method stub
		selectcourseMapper.editscore(selectcourse);
	}

	

	
}
