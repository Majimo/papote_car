package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Trip;
import model.AdminTrip;
import model.AdminTripImpl;

public class GetHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String ACCUEIL = "/creertrajet.jsp";
	public static final String RESULTAT = "/resultat.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( ACCUEIL ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		HttpSession session = request.getSession();
		
		AdminTrip at = AdminTripImpl.getInstance();
		
		at.createTrip(request);
		
		List<Trip> trips = at.getListTrips();
		
		System.out.println("Servlet : " + trips);
		
		session.setAttribute("trips", trips);
		
		response.sendRedirect(request.getContextPath() + RESULTAT);
	}

}
