package cn.mob.jekin.control;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.mob.jekin.entity.Info;
import cn.mob.jekin.entity.User;
import cn.mob.jekin.modal.InfoService;
import cn.mob.jekin.modal.UserService;

@Controller
@RequestMapping("/user")
public class UserAction extends BaseAction {
	
	@Resource
	private UserService userService;
	@RequestMapping(value="/login")
	public String login(User user,HttpServletRequest request,HttpSession session){
		System.out.println("---action.user:"+user);
		User acc= userService.login(user);
		if(acc!=null){
			session.setAttribute("user", acc);
			if(acc.getStatus() == 2)
				return "redirect:/index2.jsp";
			if(acc.getStatus() == 0){
			return "redirect:/index.jsp";}else {
				return "redirect:/index1.jsp";
			}
		}else{
			request.setAttribute("msg", "用户名或密码错误！");
			return "forward:/login.jsp";
		}
	}
	
	@Resource
	private InfoService infoService;
	@RequestMapping(value="/getAll")
	public ModelAndView getAll(HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("stuid"));
		List<Info> infoList = infoService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("infoList", infoList);
		modelAndView.setViewName("/main.jsp");
        return modelAndView;
	}
	
	@RequestMapping(value="/addInfo")
	public String addInfo() throws Exception{
		return "forward:/addinfo.jsp";
	}
	
	@RequestMapping(value="/add")
	public String add(Info info) throws Exception{
		 System.out.println("用户注册："+info.getStuname()+info.getAcademe()); 
		 infoService.add(info);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/editInfo")
	public ModelAndView editInfo(@RequestParam(value = "stuid", required = true) String stuid) throws Exception{
		System.out.println(stuid);
		Info info=infoService.getOne(stuid);
		System.out.println(info);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("info", info);
		modelAndView.setViewName("/editinfo.jsp");
        return modelAndView;
	}
	
	@RequestMapping(value="/edit")
	public String edit(Info info) throws Exception{
		infoService.edit(info);
		return "redirect:/index.jsp";		
	}
	
	@RequestMapping(value="/deleteInfo")
	public String deleteInfo(@RequestParam(value = "stuid", required = true) String stuid) throws Exception{
		System.out.println(stuid);
		infoService.deleteInfo(stuid);
		return "redirect:/index.jsp";		
	}
}
