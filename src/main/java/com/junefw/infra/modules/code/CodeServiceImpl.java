package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	CodeDao dao;
	
	@Override
	public List<Code> selectList() throws Exception {
		return dao.selectList(); 
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(Code dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Code selectOne(Code dto) {
		// TODO Auto-generated method stub
		return dao.selectOne(dto);
	}

	public int selectOneCount(Code vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Code> selectList(Code vo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
