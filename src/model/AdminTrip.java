package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import beans.Trip;

public interface AdminTrip {

	public Trip createTrip(HttpServletRequest request);

	public List<Trip> getListTrips();

}
