package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import beans.Trip;

public class AdminTrajetDAOImplTest {

	@Test
	public void testCreateTrip() {

		AdminTrajetDAOImpl dao = new AdminTrajetDAOImpl();
		
		String heureDepart = "09:00";
		String heureArrivee = "10:00";
		String lieuDepart = "Rennes";
		String lieuArrivee = "Redon";
		int nbPlaces = 2;
		
		Trip trip = new Trip("09:00", "10:00", "Rennes", "Redon", 2);
		trip = dao.createTrip(heureDepart, heureArrivee, lieuDepart, lieuArrivee, nbPlaces);
		
		assertTrue(trip.getId() > 0);
	}

}
