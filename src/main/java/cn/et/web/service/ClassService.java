package cn.et.web.service;

import java.util.List;
import java.util.Map;

import cn.et.web.bean.classFile;

public interface ClassService {
	public List<classFile> queryAll();
	
	public List<classFile> queryContent(String content);
	
	 public void insert(classFile cla);
	 
	 public void delete(String id);
}
