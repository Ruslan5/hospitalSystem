package ua.nure.mirzoiev.hospitalSystem.controller;

import org.apache.log4j.Logger;

import ua.nure.mirzoiev.hospitalSystem.db.UtilServlet;
import ua.nure.mirzoiev.hospitalSystem.entity.Person;
import ua.nure.mirzoiev.hospitalSystem.entity.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/languageServlet")
public class LanguageServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(LanguageServlet.class);
	private UtilServlet utilServlet = new UtilServlet();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("action", "/languageServlet");
		String url = req.getParameter("url");
		String lang = req.getParameter("language");
		

		req.setAttribute("lang", lang);
		try {
			utilServlet.setRequestListForPatientCard(req);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		resp.sendRedirect(getServletContext().getContextPath() + url);
	}
}
