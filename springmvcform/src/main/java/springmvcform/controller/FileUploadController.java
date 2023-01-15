package springmvcform.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/upload")
	public String fileUpload() {
		return "fileform";
		}
@RequestMapping(path="/uploadimage",method=RequestMethod.POST )	
public String HandleUploadFile(@RequestParam("image")CommonsMultipartFile file, HttpSession s, Model m) throws IOException{
	System.out.println("file upload handuler");
	System.out.println(file.getSize());
	System.out.println(file.getContentType());
	System.out.println(file.getName());
	System.out.println(file.getOriginalFilename());
	System.out.println(file.getStorageDescription());
	
	byte[] data = file.getBytes();
	//we have to save this file to server-->>>
	
   String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+
   File.separator+"image"+File.separator+file.getOriginalFilename();
   System.out.println(path);
   FileOutputStream fos=new FileOutputStream("path");
   fos.write(data);
   fos.close();
   System.out.println("file upload");
   m.addAttribute("fi",file.getOriginalFilename());
	return "filesuccess";
	
}
}
