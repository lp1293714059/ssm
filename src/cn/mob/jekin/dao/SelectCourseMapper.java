package cn.mob.jekin.dao;

import java.util.List;

import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.Info;
import cn.mob.jekin.entity.SelectCourse;
import cn.mob.jekin.entity.StudentScore;

public interface SelectCourseMapper extends BaseMapper<SelectCourse>{
	
	public void addselectcourse(SelectCourse selectcourse);
	public void deleteselectcourse(SelectCourse selectcourse);
	public List<StudentScore> getStudentScore(SelectCourse selectCourse);
	public List<SelectCourse> teachergivescore();
	public SelectCourse getOne(SelectCourse selectcourse);
	public void editscore(SelectCourse selectcourse);
}
