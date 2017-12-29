package cn.et.web.dao;

import java.util.List;
import java.util.Map;

import cn.et.web.bean.classFile;

public interface ClassDao {
	/**
	 * 查询所有新闻
	 * @return 返回新闻列表
	 */
    public List<classFile> queryAll();
    
    /**
     * 根据内容 模糊查询
     * @param content 内容
     * @return 返回新闻列表
     */
    public List<classFile> queryContent(String file);
    
    /**
     * 增加新闻内容
     * @param title  标题
     * @param content 内容
     * @return
     */
    public void insert(classFile cla);
    
    /**
     * 删除新闻内容
     * @param id  编号
     * @return
     */
    public void delete(String id);
    
   
    
    
}
