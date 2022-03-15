package com.junefw.infra.modules.code;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDao {
	
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.code.CodeMpp";

//	infrCodeGroup
	
	public List<Code> selecList() { List<Code> list = sqlSession.selectList(namespace);
	return list; }
	public  List<Code> selectList(){return sqlSession.selectList(namespace + ".selectList", ""); }
	public int insert() {return sqlSession.insert(namespace + ".insert", ""); }
	public Code selectOne(Code dto) {
		return sqlSession.selectOne(namespace + ".selectOne", dto);
	}
}