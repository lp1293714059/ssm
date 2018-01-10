package cn.mob.jekin.modal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mob.jekin.dao.CourseMapper;
import cn.mob.jekin.dao.TecherMapper;
import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.Techer;
import cn.mob.jekin.modal.CourseService;
import cn.mob.jekin.modal.TecherService;
@Service("techerService")
public class TecherServiceImpl implements TecherService {

	@Autowired
	private TecherMapper techerMapper;

	@Override
	public List<Techer> getAll() {
		// TODO Auto-generated method stub
		return techerMapper.getAll();
	}

	@Override
	public void addtecher(Techer techer) {
		// TODO Auto-generated method stub
		techerMapper.addtecher(techer);
		techerMapper.addtecheruser(techer);
	}

	@Override
	public Techer getOne(String techid) {
		// TODO Auto-generated method stub
		return techerMapper.getOne(techid);
	}

	@Override
	public void edit(Techer techer) {
		// TODO Auto-generated method stub
		techerMapper.edit(techer);
	}

	@Override
	public void deleteTecher(String techid) {
		// TODO Auto-generated method stub
		techerMapper.deleteTecher(techid);
	}

}
