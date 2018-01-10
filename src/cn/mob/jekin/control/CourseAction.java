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
import cn.mob.jekin.entity.User;
import cn.mob.jekin.modal.CourseService;

@Controller
@RequestMapping("/course")
public class CourseAction extends BaseAction{
	
	@Resource
	private CourseService courseService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("courseid"));
		List<Course> courseList = courseService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courseList", courseList);
		modelAndView.setViewName("/coursemain.jsp");
        return modelAndView;
	}
	@RequestMapping(value="/getAllSelect")
	public ModelAndView getAllSelect(HttpServletRequest request,User user) throws Exception {
		System.out.println(request.getParameter("user_name"));
		user.setuser_name(request.getParameter("user_name"));
		System.out.println(user.getuser_name()+"哈哈啊哈哈");
		List<Course> courseList = courseService.getAllSelect(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courseList1", courseList);
		modelAndView.setViewName("/coursemain1_2.jsp");
        return modelAndView;
	}
	@RequestMapping(value="/getAll1")
	public ModelAndView getAll1(HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("courseid"));
		List<Course> courseList = courseService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courseList", courseList);
		modelAndView.setViewName("/coursemain1.jsp");
        return modelAndView;
	}
	
	@RequestMapping(value="/addCourse")
	public String addInfo() throws Exception{
		return "forward:/addcourse.jsp";
	}
	
	@RequestMapping(value="/addcourse")
	public String addcourse(Course course) throws Exception{
		 courseService.addcourse(course);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/deleteCourse")
	public String deleteInfo(@RequestParam(value = "courseid", required = true) String courseid) throws Exception{
		courseService.deleteCourse(courseid);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/editCourse")
	public ModelAndView editCourse(@RequestParam(value = "courseid", required = true) String courseid) throws Exception{
		Course course=courseService.getOne(courseid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("course", course);
		modelAndView.setViewName("/editcourse.jsp");
        return modelAndView;
	}
	
	@RequestMapping(value="/edit")
	public String edit(Course course) throws Exception{
		courseService.edit(course);
		return "redirect:/index.jsp";		
	}
}
