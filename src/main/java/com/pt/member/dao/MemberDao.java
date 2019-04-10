package com.pt.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pt.member.entity.Member;

import cn.tedu.pojo.Door;

public interface MemberDao {
	List<Map<String, Object>> findMembers();
	
	List<Member> findPageObjects(
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	
	List<Door> findDoor();

}
