package com.hyh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hyh.mapper.UsersMapper;
import com.hyh.pojo.Users;
import com.hyh.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public int insReg(Users users) {
		return usersMapper.insUsers(users);
	}

}
