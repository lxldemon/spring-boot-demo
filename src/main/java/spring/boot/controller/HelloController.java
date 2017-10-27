package spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.util.R;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public R getList(){
		return R.ok();
	}
}
