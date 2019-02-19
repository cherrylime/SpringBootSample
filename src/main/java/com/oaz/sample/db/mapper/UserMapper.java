package com.oaz.sample.db.mapper;

import java.util.List;

import com.oaz.sample.domain.security.MemberVO;

public interface UserMapper {
	
	public MemberVO readUser(String username);
    public List<String> readAuthority(String username);

}
