package com.junefw.infra.modules.dgmk;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class DgmkDao {
	
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.dgmk.DgmkMpp";

	public  List<Dgmk> selectList(){
		return sqlSession.selectList(namespace + ".selectList");
	}
	
	public int insert() {
		return sqlSession.insert(namespace + ".insert", "");
	}
	
}