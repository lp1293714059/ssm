package cn.mob.jekin.dao;

import java.util.List;

import cn.mob.jekin.entity.Techer;

public interface TecherMapper extends BaseMapper<Techer>{
	
	public List<Techer> getAll();
	public void addtecher(Techer techer);
	public Techer getOne(String techid);
	public void edit(Techer techer);
	public void deleteTecher(String techid);
	public void addtecheruser(Techer techer);
}
