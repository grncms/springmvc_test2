package com.junefw.infra.modules.dgmk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DgmkServiceImpl implements DgmkService{

	@Autowired
	DgmkDao dao;
	
	@Override
	public List<Dgmk> selectList() throws Exception {
		return dao.selectList(); 
	}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
