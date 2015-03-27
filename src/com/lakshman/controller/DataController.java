package com.lakshman.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lakshman.domain.Calendar;
import com.lakshman.domain.ForecastUserDetails;
import com.lakshman.domain.Members;
import com.lakshman.domain.Projects;
import com.lakshman.domain.UpdateForecast;
import com.lakshman.service.UserService;

@Controller
public class DataController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/membersList")
	@ResponseBody
	public List<Members> getMembersList(HttpServletResponse response) {
		List<Members> membersList = userService.getMembersList();
		return membersList;
	}
	
	@RequestMapping(value = "/projectsList")
	@ResponseBody
	public List<Projects> getProjectsList(HttpServletResponse response) {
		List<Projects> projectsList = userService.getProjectsList();
		return projectsList;
	}

	@RequestMapping(value = "/addMember")
	@ResponseBody
	public String addMember(@RequestBody Members member, BindingResult result) {
		System.out.println(member.getCgiDoj());
		System.out.println(member.getFsgDoj());
		member.setPassword("password");
		userService.addMember(member);
		return "success";
	}

	@RequestMapping(value = "/updateMember", method = RequestMethod.PUT)
	@ResponseBody
	public Members updateUserData(@RequestBody Members member,
			BindingResult result) {
		userService.updateMember(member);
		return member;
	}
	
	@RequestMapping(value = "/updateProject", method = RequestMethod.PUT)
	@ResponseBody
	public Projects updateProject(@RequestBody Projects projects,
			BindingResult result) {
		userService.updateProject(projects);
		return projects;
	}


	@RequestMapping(value = "/deleteUser/{studentId}", method = RequestMethod.PUT)
	@ResponseBody
	public String deleteUserData(@PathVariable int studentId) {
		userService.deleteUser(studentId);
		return "success";
	}
	
	@RequestMapping(value = "/deleteProject/{projectId}", method = RequestMethod.PUT)
	@ResponseBody
	public String deleteProject(@PathVariable int projectId) {
		userService.deleteProject(projectId);
		return "success";
	}

	@RequestMapping(value = "/getAllQtrData", method = RequestMethod.PUT)
	@ResponseBody
	public Calendar getAllQuatarData(@RequestBody String year) {
		return userService.getAllQuatarData(year);
	}

	@RequestMapping(value = "/addCalendar")
	@ResponseBody
	public String addCalendar(@RequestBody Calendar calendar,
			BindingResult result) {
		userService.saveCalendar(calendar);
		return "success";
	}
	
	@RequestMapping(value = "/addProjects")
	@ResponseBody
	public String addProjects(@RequestBody Projects projects,
			BindingResult result) {
		userService.addProject(projects);
		return "success";
	}

	@RequestMapping(value = "/getMemeberForecastData", method = RequestMethod.PUT)
	@ResponseBody
	public ForecastUserDetails getMemeberForecastData(HttpServletRequest req,
			@RequestBody String year) {
		HttpSession session = req.getSession(true);
		String psaID = (String) session.getAttribute("psaId");
		return userService.getMemberForecastData(year, Integer.parseInt(psaID));
	}

	@RequestMapping(value = "/updateForecastCalendar")
	@ResponseBody
	public String addCalendar(HttpServletRequest req,
			@RequestBody UpdateForecast updateForecast) {
		StringBuilder str = new StringBuilder(updateForecast.getYear());
		int position = updateForecast.getYear().indexOf("-");
		str.deleteCharAt(position);
		updateForecast.setYear(str.toString());
		HttpSession session = req.getSession(true);
		updateForecast.setPsaId(Integer.parseInt((String) session
				.getAttribute("psaId")));
		userService.updateForecastCalendarforUser(updateForecast);
		return "success";
	}

	@RequestMapping(value = "/loginValidate")
	@ResponseBody
	public boolean loginValidate(HttpServletRequest req,
			@RequestBody String userDetails) {
		String memberNameAndPwd[] = userDetails.split(",");
		boolean returnType = userService.validateMemberLoginDetails(memberNameAndPwd[0], memberNameAndPwd[1]);
		if (returnType) {
			HttpSession session = req.getSession(true);
			session.setAttribute("psaId", memberNameAndPwd[0]);
		}
		return returnType;
	}


}
