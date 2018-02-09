package dao;

import java.util.List;

import beans.Trip;

public interface AdminTrajetDAO {
	
	public Trip createTrip(String heureDepart, String heureArrivee, String lieuDepart, String lieuArrivee, int nbPlaces);

	public List<Trip> getListTrips();
}
