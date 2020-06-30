package com.hyh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hyh.mapper.FilesMapper;
import com.hyh.pojo.Files;
import com.hyh.pojo.Users;
import com.hyh.service.FilesService;

@Service
public class FilesServiceImpl implements FilesService{
	@Resource
	private FilesMapper filesMapper;

	@Override
	public List<Files> show() {
		return filesMapper.selAll();
	}

	@Override
	public int updCount(int id, Users users, String name) {
		Logger logger = Logger.getLogger(FilesServiceImpl.class);
		logger.info(users.getUsername()+"下载了"+name);
		return filesMapper.updCountById(id);
	}
}
