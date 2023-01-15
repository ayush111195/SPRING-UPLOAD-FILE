package springmvcform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	@RequestMapping("/file")
	public String staticFile() {
		return "file";
		
	}
}
