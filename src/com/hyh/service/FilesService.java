package com.hyh.service;

import java.util.List;

import com.hyh.pojo.Files;
import com.hyh.pojo.Users;

public interface FilesService {
	/**
	 * 显示全部
	 * @return
	 */
	List<Files> show();
	/**
	 * 根据id修改下载次数
	 * @param id
	 * @param users
	 * @param name
	 * @return
	 */
	int updCount(int id, Users users, String name);
}
