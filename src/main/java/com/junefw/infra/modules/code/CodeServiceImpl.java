package com.junefw.infra.modules.code;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService{

	@Override
	public int selectOneCount(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Code> selectList(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Code selectOne(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDelete(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Code> selectListCode(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCode(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Code selectOneCode(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCode(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<Code> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public int selectOneCount(Code vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Code> selectList(Code vo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * @PostConstruct public void selectListForCache() { List<Code> codeListFromDb =
	 * (ArrayList<Code>) dao.selectListForCache();
	 * 
	 * Code.cachedCodeArrayList.clear();
	 * Code.cachedCodeArrayList.addAll(codeListFromDb);
	 * System.out.println("cachedCodeArrayList: " + Code.cachedCodeArrayList.size()
	 * + "chached !"); }
	 */
	
	
	/*
	 * @Autowired CodeDao dao;
	 * 
	 * @Override public List<Code> selectList() throws Exception { return
	 * dao.selectList(); }
	 * 
	 * @Override public int insert() { // TODO Auto-generated method stub return 0;
	 * }
	 * 
	 * public void update(Code dto) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public Code selectOne(Code dto) { // TODO Auto-generated method
	 * stub return dao.selectOne(dto); }
	 * 
	 * public int selectOneCount(Code vo) { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * public List<Code> selectList(Code vo) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * public void insert(Code dto) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * public Code selectOne(CodeVo vo) { // TODO Auto-generated method stub return
	 * null; }
	 * 
	 * public void delete(CodeVo vo) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	
	
	
}
