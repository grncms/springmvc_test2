package com.junefw.infra.modules.code;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {

//	paging
	private int thisPage = 1;									// 현재 페이지
	private int rowNumToShow = 1;								// 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow = 5;								// 화면에 보여줄 페이징 번호 갯수

	private int totalRows;										// 전체 데이터 갯수
	private int totalPages;										// 전체 페이지 번호
	private int startPage;										// 시작 페이지 번호
	private int endPage;										// 마지막 페이지 번호
	
	private int startRnumForOracle = 1;							// 쿼리 시작 row
	private int endRnumForOracle;								// 쿼리 끝 row
	private Integer RNUM;
	
	private int startRnumForMysql = 0;							// 쿼리 시작 row
	
//	infrCodeGroup
	
	@RequestMapping(value = "/code/codeGroupList", method = RequestMethod.GET)
	public String codeGroupList(/* @ModelAttribute("vo") */ Code vo, Model model) throws Exception {
		
		// count 가져올 것
		int count = service.selectOneCount(vo);
		
		setParamsPaging(count);
		
		if(count != 0) {
			List<Code> list = service.selectList(vo);
			model.addAttribute("list", list);
		} else {
			// by pass
		}
		return "code/codeGroupList";
	}
	
//	@RequestMapping(value = "/code/codeGroupList")
//	public String codeGroupList(Model model) throws Exception {
//
//		// count 가져올것
//		int count = service.selectOneCount(vo);
//		
//		if(count != 0) {
//			List<Code> list = service.selectList(vo);
//			model.addAttribute("list",list);
//		} else {
//			//by pass
//		}
//		// count 가 0이 아니면 list 가져오는 부분 수행 후 model 개체에 담기
//
//		List<Code> list = service.selectList();
//		model.addAttribute("list", list);
//
//		return "code/codeGroupList";
//
//	}
	
	
	
	public void setParamsPaging(int totalRowsParam) {
		
		totalRows = totalRowsParam;

		totalPages = totalRows / rowNumToShow;

		if (totalRows % rowNumToShow > 0) {
			totalPages = totalPages+ 1;
		}

		if (totalPages < thisPage) {
			thisPage = totalPages;
		}
		
		startPage = (((thisPage - 1) / pageNumToShow) * pageNumToShow + 1);

		endPage = (startPage + pageNumToShow - 1);

		if (endPage > totalPages) {
			endPage = (totalPages);
		}
		
		endRnumForOracle = ((rowNumToShow * thisPage));
		startRnumForOracle = ((endRnumForOracle - rowNumToShow) + 1);
		if (startRnumForOracle < 1) startRnumForOracle = 1;
		
		
		if (thisPage == 1) {
			startRnumForMysql = 0;
		} else {
			startRnumForMysql = ((rowNumToShow * (thisPage-1)));
		}
		
		System.out.println("getThisPage():" + thisPage);
		System.out.println("getTotalRows():" + totalRows);
		System.out.println("getRowNumToShow():" + rowNumToShow);
		System.out.println("getTotalPages():" + totalPages);
		System.out.println("getStartPage():" + startPage);
		System.out.println("getEndPage():" + endPage);		
		System.out.println("getStartRnumForOracle():" + startRnumForOracle);
		System.out.println("getEndRnumForOracle():" + endRnumForOracle);
		System.out.println("getStartRnumForMysql(): " + startRnumForMysql);
		
	}
	
	
	
	@Autowired
	CodeServiceImpl service;
	private Code vo;



	@RequestMapping(value = "/code/codeGroupForm")
	public String codeGroupForm(@ModelAttribute("vo") CodeVo vo) throws Exception {

//		List<Code> list = service.selectList();
//		model.addAttribute("list", list);

		return "code/codeGroupForm";

	}
	
	@RequestMapping(value = "/code/codeGroupForm2")
	public String codeGroupForm(Code dto) throws Exception {
		
//		List<Code> list = service.selectList();
//		model.addAttribute("list", list);
		
		return "code/codeGroupForm2";
		
	}

	@RequestMapping(value = "/code/codeGroupInst")
	public String codeGroupInst(Code dto, CodeVo vo, RedirectAttributes redirectAttributes) throws Exception{

		MultipartFile multipartFile = dto.getFile();
		
		String fileName = multipartFile.getOriginalFilename();
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		String uuid = UUID.randomUUID().toString();
		String uuidFileName = uuid + "." + ext;
		
//		multipartFile.transferTo(new File("C:/fatory/ws_sts_4130/springmvc_test2/src/main/webapp/resources/uploaded/" + multipartFile.getOriginalFilename()));
		multipartFile.transferTo(new File("C:/fatory/ws_sts_4130/springmvc_test2/src/main/webapp/resources/uploaded/" + uuidFileName));
		
		
		System.out.println("dto.getIfcgSeq(): " + dto.getIfcgSeq());	// null
		
		service.insert(dto);
		
		System.out.println("dto.getIfcgSeq(): " + dto.getIfcgSeq());	// 26
		
		redirectAttributes.addAttribute("ifcgSeq", dto.getIfcgSeq());
		redirectAttributes.addAttribute("thisPage", dto.getIfcgSeq());
		redirectAttributes.addAttribute("shOption", dto.getIfcgSeq());
		redirectAttributes.addAttribute("shValue", dto.getIfcgSeq());
		
		return "redirect:/code/codeGroupView";

//		return "redirect:/code/codeGroupView?ifcgSeq=" + dto.getIfcgSeq() + makeQueryString(vo);
	}

	public String makeQueryString(CodeVo vo) {
		String tmp = "&thisPage=" + vo.getThisPage()
						+ "&shOption=" + vo.getShOption()
						+ "&shValue=" + vo.getShValue();
		return tmp;
	}
	
	@RequestMapping(value = "/code/codeGroupView")
	public String codeGroupView(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
		// System.out.println("테스트입니다 " + dto.getIfcgSeq());
//		Code detail = service.selectOne(dto);
		// System.out.println("받아왔습니다 : " + dto.getIfcgName());

		
		System.out.println("vo.getShOption() : " + vo.getShOption());
		System.out.println("vo.getShValue() : " + vo.getShVaule());
		System.out.println("vo.getThisPage() : " + vo.getThisPage());
		
		
//		db까지 가서 한 건의 데이터값을 가져온다. VO
		Code rt = service.selectOne(vo);
		
		// 가지고 온 값을 jsp로 넘겨준다
		model.addAttribute("item", rt);
		
		return "code/codeGroupView";
	}
	
	
	@RequestMapping(value = "/code/codeView")
	public String codeViewx(Model model) throws Exception {
		// 디비까지 가서 한 건의 데이터 값을 가지고 온다. VO
		List<Code> list = service.selectList();
		
		// 가지고 온 값을 jsp로 넘겨준다.
		model.addAttribute("list", list);

		return "code/codeGroupForm";

	}

	@RequestMapping(value = "/code/codeGroupUpdt")
	public String codeGroupUpdt(Code dto) throws Exception {

		service.update(dto);

		return "code/codeGroupUpdt";
	}


	@RequestMapping(value = "/code/codeGroupDele")
	public String codeGroupDele(CodeVo vo, RedirectAttributes redirectAttributes) throws Exception {
		
		service.delete(vo);
		
		redirectAttributes.addAttribute("thisPage", vo.getThisPage());	
		redirectAttributes.addAttribute("shOption", vo.getShOption());	
		redirectAttributes.addAttribute("shValue", vo.getShValue());	
		
		return "redirect:/code/codeGroupList";
		}

}


	