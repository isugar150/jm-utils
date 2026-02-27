package com.namejm.utils.service;

import com.namejm.utils.dto.SamplePageDto;
import com.namejm.utils.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;

@Service
public class SamplePageService {

	public SamplePageDto getSamplePageData() {
		return new SamplePageDto(
				"Thymeleaf Decorator Example",
				"Thymeleaf Layout Dialect가 적용된 예제 페이지입니다.",
				DateTimeFormatUtil.formatNow()
		);
	}
}
