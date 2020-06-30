package com.hyh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hyh.pojo.Files;

public interface FilesMapper {
	@Select("select * from files")
	List<Files> selAll();
	@Update("update files set count=count+1 where id=#{0}")
	int updCountById(int id);	
}
