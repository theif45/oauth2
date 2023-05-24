package com.study.oauth2.repository;

import org.apache.ibatis.annotations.Mapper;

import com.study.oauth2.entity.Authority;
import com.study.oauth2.entity.User;

@Mapper
public interface UserRepository {

	public User findUserByEmail(String email);
	public int saveUser(User user);
	public int saveAuthorities(Authority authoriy);
	public int updateProvider(User user);
	public int updateProfileImg(User user);
}
