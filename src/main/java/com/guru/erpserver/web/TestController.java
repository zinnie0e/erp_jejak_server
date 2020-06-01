package com.guru.erpserver.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.TestService;
import com.guru.erpserver.vo.TestVO;

@RestController
public class TestController {
	@Resource
	private TestService testSVC;

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public List<TestVO> index(Model model) throws Exception {
		List<TestVO> testList = new ArrayList<>();
		testList = testSVC.getTestList();
		
		model.addAttribute("testList", testList);
		
		return testList;
	}
}
