package cn.mob.jekin.modal;

import java.util.List;

import cn.mob.jekin.entity.Info;

public interface InfoService extends BaseService<Info>{
	public List<Info> getAll();
	public void add(Info info);
	public Info getOne(String stuid);
	public void edit(Info info);
	public void deleteInfo(String stuid);
}
