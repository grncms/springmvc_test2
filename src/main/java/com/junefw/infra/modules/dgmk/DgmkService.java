package com.junefw.infra.modules.dgmk;

import java.util.List;

public interface DgmkService {
	
	public List<Dgmk> selectList() throws Exception; 
	public int insert(); 
}