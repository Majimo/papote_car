package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import beans.Trip;
import dao.AdminTrajetDAO;
import dao.AdminTrajetDAOImpl;

public class AdminTripImpl implements AdminTrip {
	
    private static final String CHAMP_HEUREDEPART  = "heureDepart";
    private static final String CHAMP_HEUREARRIVEE   = "heureArrivee";
    private static final String CHAMP_LIEUDEPART   = "lieuDepart";
    private static final String CHAMP_LIEUARRIVEE   = "lieuArrivee";
    private static final String CHAMP_NBPLACES   = "nbPlaces";
	
	private static AdminTrip instance = null;
	
	public static AdminTrip getInstance(){
		if (instance == null){
			instance = new AdminTripImpl();
		}
		return instance;
	}

	@Override
	public Trip createTrip(HttpServletRequest request) {
		String heureDepart = getValeurChamp( request, CHAMP_HEUREDEPART );
		String heureArrivee = getValeurChamp( request, CHAMP_HEUREARRIVEE );
		String lieuDepart = getValeurChamp( request, CHAMP_LIEUDEPART );
		String lieuArrivee = getValeurChamp( request, CHAMP_LIEUARRIVEE );
		String nbPlaces = getValeurChamp( request, CHAMP_NBPLACES );
		
		System.out.println(heureDepart + " " + heureArrivee + " " + lieuDepart + " " + lieuArrivee + " " + nbPlaces);

		AdminTrajetDAO atd = AdminTrajetDAOImpl.getInstance();
		Trip trip = atd.createTrip(heureDepart, heureArrivee, lieuDepart, lieuArrivee, Integer.parseInt(nbPlaces));
		
		System.out.println(trip.toString());
		
		return trip;
	}

	@Override
	public List<Trip> getListTrips() {
		AdminTrajetDAO atd = AdminTrajetDAOImpl.getInstance();
		List<Trip> trips = atd.getListTrips();
		
		System.out.println("Model : " + trips);
		return trips;
	}


	private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }
    }
}
