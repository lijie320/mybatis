package cn.et.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.et.web.bean.classFile;
import cn.et.web.service.ClassService;

/**
 * Servlet implementation class classController
 */
public class classController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public classController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		classFile cla = new classFile();
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		ClassService cs = (ClassService)ac.getBean("classServiceImpl");
		String title = request.getParameter("title");
		String content = request.getParameter("file1");
		if(title !=null || content != null){
			cla.setCfile(content);
			cla.setName(title);
			cs.insert(cla);
		}
		String id = request.getParameter("id");
		if(id !=null){
			cs.delete(id);
		}
		
		List<classFile> queryContent = cs.queryAll();
		request.setAttribute("classList", queryContent);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
