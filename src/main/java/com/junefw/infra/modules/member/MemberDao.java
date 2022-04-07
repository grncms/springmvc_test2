package com.junefw.infra.modules.member;



import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.member.MemberMpp";

	public List<Member> selectList(MemberVo vo){ 
		return sqlSession.selectList(namespace + ".selectList", vo);
	}
	
	public Member selectOne(MemberVo vo){
		return sqlSession.selectOne(namespace + ".selectView", vo);
	}
	
	public int insert(Member dto){ 
		return sqlSession.insert(namespace + ".insert", dto);
	}
	
	public int delete(Member dto) {
		return sqlSession.insert(namespace + ".delete", dto);
	}
	

}