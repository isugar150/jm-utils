package com.namejm.utils.controller;

import com.namejm.utils.dto.SamplePageDto;
import com.namejm.utils.service.SamplePageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	private final SamplePageService samplePageService;

	public PageController(SamplePageService samplePageService) {
		this.samplePageService = samplePageService;
	}

	@GetMapping("/")
	public String examplePage(Model model) {
		SamplePageDto pageData = samplePageService.getSamplePageData();
		model.addAttribute("page", pageData);
		return "pages/example";
	}
}
