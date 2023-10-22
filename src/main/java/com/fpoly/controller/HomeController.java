package com.fpoly.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class HomeController {
	

	@GetMapping("/index")
	public String homePage() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String signup() {
		return "register";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/product")
	public String product() {
		return "product";
	}
	
	@GetMapping("/productNew")
	public String productNew() {
		return "productNew";
	}
	
	@GetMapping("/productHot")
	public String productHot() {
		return "productHot";
	}
	
	@GetMapping("/spKhuyenMai")
	public String spKhuyenMai() {
		return "spKhuyenMai";
	}
	
	@GetMapping("/thuongHieu")
	public String thuongHieu() {
		return "thuongHieu";
	}
	
	@GetMapping("/kienThucNuocHoa")
	public String kienThucNuocHoa() {
		return "kienThucNuocHoa";
	}
	
	@GetMapping("/reviewNuocHoa")
	public String reviewNuocHoa() {
		return "reviewNuocHoa";
	}
	
	@GetMapping("/tinTucNuocHoa")
	public String tinTucNuocHoa() {
		return "tinTucNuocHoa";
	}
	
	@GetMapping("/phanBietNuocHoa")
	public String phanBietNuocHoa() {
		return "phanBietNuocHoa";
	}
	
	@GetMapping("/uaChuong")
	public String uaChuong() {
		return "uaChuong";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
