package cn.et.web.dao;

import java.util.List;
import java.util.Map;

import cn.et.web.bean.classFile;

public interface ClassDao {
	/**
	 * ��ѯ��������
	 * @return ���������б�
	 */
    public List<classFile> queryAll();
    
    /**
     * �������� ģ����ѯ
     * @param content ����
     * @return ���������б�
     */
    public List<classFile> queryContent(String file);
    
    /**
     * ������������
     * @param title  ����
     * @param content ����
     * @return
     */
    public void insert(classFile cla);
    
    /**
     * ɾ����������
     * @param id  ���
     * @return
     */
    public void delete(String id);
    
   
    
    
}
