package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.TouristPlace;
import service.ListOperations;
import service.MapOperations;


@WebServlet(urlPatterns= {"/map"})
public class MapServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");
		
		String sortRandom = request.getParameter("sortrandomly");
		String sortInEntryOrder = request.getParameter("sortinentryorder");
		String sortAlphabetically = request.getParameter("sortalphabetically");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");
		MapOperations MO=new MapOperations();
		System.out.println("Entering into Map");
		TouristPlace tp = new TouristPlace(name,destination,rank);
			
		if(add!=null) {
			// call the add method and store the return value in a map variable
			System.out.println("Calling add equals method");
			Map<Integer, TouristPlace> map = MO.add(tp);
			request.setAttribute("bucketList", map);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

		if(remove!=null) {
			// call the remove method and store the return value in a map variable
			HashMap<Integer, TouristPlace> map = MO.remove(tp);
			request.setAttribute("bucketList", map);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

		
		if(sortRandom!=null) {
			// call the sortRandomly method and store the return value in a map variable
			Map<Integer, TouristPlace> map = MO.sortRandomly(tp);
			request.setAttribute("bucketList",map);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

		if(sortInEntryOrder!=null) {
			// call the sortInEntryOrder and store the return value in a map variable
			HashMap<Integer, TouristPlace> map = MO.sortInEntryOrder(tp);
			request.setAttribute("bucketList",map);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}
		if(sortAlphabetically!=null) {
			
			// call the sort Alphabetically and store the return value in a map variable
			HashMap<Integer, TouristPlace> map = MO.sortAlphabetically(tp);
			request.setAttribute("bucketList",map);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

		if(reset!=null) {	
			// call the reset method and store the return value in a map variable
			Object map = MO.reset(tp);
			request.setAttribute("bucketList",map);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp");
			rd.forward(request, response);
		}

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

