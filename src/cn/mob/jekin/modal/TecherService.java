package cn.mob.jekin.modal;

import java.util.List;

import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.Techer;

public interface TecherService {
	public List<Techer> getAll();
	public void addtecher(Techer techer);
	public Techer getOne(String techid);
	public void edit(Techer techer);
	public void deleteTecher(String techid);
}