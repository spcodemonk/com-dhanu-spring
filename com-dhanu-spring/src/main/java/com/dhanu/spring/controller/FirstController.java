package com.dhanu.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dhanu.spring.dao.FirstDao;
import com.dhanu.spring.entity.CommonFun;

@Controller
@RequestMapping("/firstCntrl/*")
public class FirstController {

	@Autowired
	private CommonFun comFun;

	@Autowired
	private FirstDao firstDaoObj;

	@RequestMapping("/showName.do")
	public ModelAndView showMessage(@RequestParam(value = "project", required = false) String name) {
		System.out.println("in controller");

		String data = firstDaoObj.getData();
		ModelAndView mv = new ModelAndView("sample");
		mv.addObject("data", data);
		return mv;
	}
}
