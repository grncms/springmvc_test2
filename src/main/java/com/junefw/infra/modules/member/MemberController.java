package com.junefw.infra.modules.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl service;
	
	@RequestMapping(value = "/member/memberList")
//	public String memberList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
	public String memberList(Model model) throws Exception {

		List<Member> list = service.selectList();
		model.addAttribute("test", list);
		
		/*
		 * for(int i=0; i<list.size(); i++) {
		 * System.out.println(list.get(i).toString()); }
		 */
		
		/*
		 * for(Member item : list) { System.out.println(item.getIfmmId() + " " +
		 * item.getIfmmName()); }
		 */
		
		return "member/memberList";
	}
	
	

	@RequestMapping(value = "/member/memberForm")
	public String memberForm(Model model) throws Exception {

		return "member/memberForm";
	}
	
	@RequestMapping(value = "/member/memberInst")
	public String memberInst(Model model, Member dto) throws Exception {
		
		System.out.println("dto.getIfmmId(): " + dto.getIfmmId());
		System.out.println("dto.getIfmmName(): " + dto.getIfmmName());

		// 입력을 작동시킨다.
		int result = service.insert(dto);
		
		System.out.println("result: " + result);

		return "";
	}
	
	
	// DESC : 멤버 삭제를 위한 함수 생성
	@RequestMapping(value = "/member/memberDel")
	@ResponseBody
	public Map<String, Object> memberDel(Member dto) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		int result = service.delete(dto);
		
		map.put("code", "0000");
		map.put("result", result);
		
		return map; 
	}	
}
