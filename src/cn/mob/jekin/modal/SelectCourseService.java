package cn.mob.jekin.modal;

import java.util.List;

import cn.mob.jekin.entity.Info;
import cn.mob.jekin.entity.SelectCourse;
import cn.mob.jekin.entity.StudentScore;

public interface SelectCourseService {
	public void addselectcourse(SelectCourse selectcourse);
	public void deleteselectcourse(SelectCourse selectcourse);
	public List<StudentScore> getStudentScore(SelectCourse selectCourse);
	public List<SelectCourse> getAll();
	public SelectCourse getOne(SelectCourse selectCourse);
	public void edit(SelectCourse selectcourse);
}
