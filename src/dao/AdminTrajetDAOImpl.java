package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Trip;

public class AdminTrajetDAOImpl implements AdminTrajetDAO {

private static AdminTrajetDAO instance = null;
	
	public static AdminTrajetDAO getInstance(){
		if (instance == null){
			instance = new AdminTrajetDAOImpl();
		}
		return instance;
	}
	
	@Override
	public Trip createTrip(String heureDepart, String heureArrivee, String lieuDepart, String lieuArrivee,
			int nbPlaces) {
		Trip trip = new Trip(heureDepart, heureArrivee, lieuDepart, lieuArrivee, nbPlaces);
		
		try {
			Connection cnx = null;
			PreparedStatement pstmt = null;
			String sql = "INSERT INTO trip (heureDepart, heureArrivee, lieuDepart, lieuArrivee, nbPlaces) VALUES (?, ?, ?, ?, ?)";
			
			cnx = PoolConnection.getConnection();
			pstmt = cnx.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, trip.getHeureDepart());
			pstmt.setString(2, trip.getHeureArrivee());
			pstmt.setString(3, trip.getLieuDepart());
			pstmt.setString(4, trip.getLieuArrivee());
			pstmt.setInt(5, trip.getNbPlaces());
			
			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();

			int id = -1;
			if (rs.next()) {
				id = rs.getInt(1);
			}
			trip.setId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return trip;
	}

	@Override
	public List<Trip> getListTrips() {

		List<Trip> trips = new ArrayList<Trip>();
		try {
			Connection cnx = null;
			PreparedStatement pstmt = null;
			String sql = "SELECT * FROM trip";
			
			cnx = PoolConnection.getConnection();
			pstmt = cnx.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Trip trip = new Trip();
				trip.setHeureDepart(rs.getString("heureDepart"));
				trip.setHeureArrivee(rs.getString("heureArrivee"));
				trip.setLieuDepart(rs.getString("lieuDepart"));
				trip.setLieuArrivee(rs.getString("lieuArrivee"));
				trip.setNbPlaces(rs.getInt("nbPlaces"));
				
				trips.add(trip);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("DAO : " + trips);
		return trips;
	}

}
