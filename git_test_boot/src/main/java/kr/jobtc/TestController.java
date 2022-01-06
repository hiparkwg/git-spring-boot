package kr.jobtc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/hi")
	public String hi() {
		return "controller hi...";
	}
	@RequestMapping(value="/hi2")
	public String hi2() {
		return "controller hi...2";
	}
}
