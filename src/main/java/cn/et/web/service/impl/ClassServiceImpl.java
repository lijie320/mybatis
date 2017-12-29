package cn.et.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.web.bean.classFile;
import cn.et.web.dao.ClassDao;
import cn.et.web.service.ClassService;
@Service
public class ClassServiceImpl implements ClassService{
	@Autowired
	private ClassDao classDao;
	
	public List<classFile> queryContent(String content){
		if(content == null){
			content = "";
		}
		return classDao.queryContent(content);
	}
	public void insert(classFile cla) {
		classDao.insert(cla);
	}
	public void delete(String id) {
		
		classDao.delete(id);
	}
	public List<classFile> queryAll() {
		
		return classDao.queryAll();
	}
}
