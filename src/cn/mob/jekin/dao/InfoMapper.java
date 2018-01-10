package cn.mob.jekin.dao;

import java.util.List;

import cn.mob.jekin.entity.Info;

public interface InfoMapper extends BaseMapper<Info>{
	public List<Info> getAll();
	public void add(Info info);
	public Info getOne(String stuid);
	public void edit(Info info);
	public void deleteInfo(String stuid);
	public void adduser(Info info);
}
