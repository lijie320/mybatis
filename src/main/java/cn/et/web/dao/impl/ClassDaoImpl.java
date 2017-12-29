package cn.et.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.web.bean.classFile;
import cn.et.web.dao.ClassDao;
@Repository
public class ClassDaoImpl implements ClassDao{
	@Autowired
	private JdbcTemplate jdbc;
	public List<classFile> queryAll() {
		String sql = "select * from class";
		return jdbc.query(sql, new BeanPropertyRowMapper<classFile>(classFile.class));
	}

	public List<classFile> queryContent(String content) {
		String sql = "select * from class where file like '%"+content+"%'";
		return jdbc.query(sql, new BeanPropertyRowMapper<classFile>(classFile.class));
		
	}

	public void insert(classFile cla) {
		String sql = "insert into class(claname,file) values(?,?)";
	    jdbc.update(sql, cla.getName(),cla.getCfile());
	}

	public void delete(String id) {
		String sql = "delete from class where id=?";
		jdbc.update(sql, id);
	}
}
