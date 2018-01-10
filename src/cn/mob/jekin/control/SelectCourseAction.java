package cn.mob.jekin.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.mob.jekin.entity.Course;
import cn.mob.jekin.entity.Info;
import cn.mob.jekin.entity.SelectCourse;
import cn.mob.jekin.entity.StudentScore;
import cn.mob.jekin.entity.User;
import cn.mob.jekin.modal.CourseService;
import cn.mob.jekin.modal.SelectCourseService;

@Controller
@RequestMapping("/selectcourse")
public class SelectCourseAction extends BaseAction{
	
	@Resource
	private SelectCourseService selectcourseService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		//System.out.println(request.getParameter("courseid"));
		List<SelectCourse> courseList = selectcourseService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("give", courseList);
		modelAndView.setViewName("/givescore.jsp");
        return modelAndView;
	}
	@RequestMapping(value="/addselectcourse")
	public String addselectcourse(SelectCourse selectcourse){
		try {
			selectcourseService.addselectcourse(selectcourse);
			
		} catch (Exception e) {
			// TODO: handle exception
			return "redirect:/index1_1.jsp";
		}
		return "redirect:/index1.jsp";		
	}
	@RequestMapping(value="/deleteselectcourse")
	public String deleteInfo(SelectCourse selectCourse) throws Exception{
		System.out.println(selectCourse.getStuid()+selectCourse.getCourseid()+"这个这个");
		selectcourseService.deleteselectcourse(selectCourse);
		return "redirect:/index1.jsp";		
	}
	@RequestMapping(value="/showscore")
	public ModelAndView getAllSelect(HttpServletRequest request,SelectCourse selectCourse) throws Exception {
//		System.out.println(request.getParameter("user_name"));
//		user.setuser_name(request.getParameter("user_name"));
//		System.out.println(user.getuser_name()+"哈哈啊哈哈");
		List<StudentScore> scoreList = selectcourseService.getStudentScore(selectCourse);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("score", scoreList);
		modelAndView.setViewName("/score.jsp");
        return modelAndView;
	}
	
	@RequestMapping(value="/editscore")
	public ModelAndView editInfo(HttpServletRequest request,SelectCourse selectCourse) throws Exception{
//		System.out.println(stuid);
//		Info info=infoService.getOne(stuid);
//		System.out.println(info);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("info", info);
//		modelAndView.setViewName("/editinfo.jsp");
//        return modelAndView;
		System.out.println(selectCourse.getStuid()+selectCourse.getCourseid()+selectCourse.getScore());
		System.out.println("*****"+selectcourseService.getOne(selectCourse).getScore());
		SelectCourse selectCourse2 =selectcourseService.getOne(selectCourse);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("selectCourse2", selectCourse2);
		modelAndView.setViewName("/editscore.jsp");
		return modelAndView;
	}
	@RequestMapping(value="/editscore1")
	public String edit(SelectCourse selectcourse) throws Exception{
		System.out.println("Choosl!!!"+selectcourse.toString());
		selectcourseService.edit(selectcourse);
		return "redirect:/index2.jsp";		
	}
}
