package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

//	paging
	private int thisPage = 1;									// 현재 페이지
	private int rowNumToShow = 10;								// 화면에 보여줄 데이터 줄 갯수
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
	
	@RequestMapping(value = "/code/codeGroupList")
	public String codeGroupList(Code vo, Model model) throws Exception {
		
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

	@RequestMapping(value = "/code/codeGroupList")
	public String codeGroupList(Model model) throws Exception {

		// count 가져올것
		int count = service.selectOneCount(vo);
		
		if(count != 0) {
			List<Code> list = service.selectList(vo);
			model.addAttribute("list",list);
		} else {
			//by pass
		}
		// count 가 0이 아니면 list 가져오는 부분 수행 후 model 개체에 담기

		List<Code> list = service.selectList();
		model.addAttribute("list", list);

		return "code/codeGroupList";

	}

	@RequestMapping(value = "/code/codeGroupForm")
	public String codeGroupForm(Model model) throws Exception {

		List<Code> list = service.selectList();
		model.addAttribute("list", list);

		return "code/codeGroupForm";

	}

//	@RequestMapping(value = "/code/codeInst")
//	public String codeInst(Model model) throws Exception{
//		
//		service.insertCode(dto);
//		
//		return "";
//		
//	}

	@RequestMapping(value = "/code/codeView")
	public String codeViewx(Model model) throws Exception {

		List<Code> list = service.selectList();
		model.addAttribute("list", list);

		return "code/codeGroupForm";

	}

	@RequestMapping(value = "/code/codeGroupUpdt")
	public String codeGroupUpdt(Code dto) throws Exception {

		service.update(dto);

		return "code/codeGroupUpdt";
	}

	@RequestMapping(value = "/code/codeGroupView")
	public String codeGroupView(Code dto, Model model) throws Exception {
		// System.out.println("테스트입니다 " + dto.getIfcgSeq());
		Code detail = service.selectOne(dto);
		// System.out.println("받아왔습니다 : " + dto.getIfcgName());

		model.addAttribute("memberDetail", detail);
		return "code/codeGroupView";
	}
	
	

}
