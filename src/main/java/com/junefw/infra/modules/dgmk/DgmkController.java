package com.junefw.infra.modules.dgmk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DgmkController {

	@Autowired
	DgmkServiceImpl service;
	
	@RequestMapping(value = "/dgmk/dgmkProductList")
	public String dgmkProductList(Model model) throws Exception{
		List<Dgmk> list = service.selectList();
		System.out.println("리스트사이즈에욧! : " + list.size());
		model.addAttribute("list", list);
		
		return "dgmk/dgmkProductList";
	}
}
