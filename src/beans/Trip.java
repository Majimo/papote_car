package beans;

public class Trip {
	
	private int id;
	private String heureDepart;
	private String heureArrivee;
	private String lieuDepart;
	private String lieuArrivee;
	private int nbPlaces;
	
	public Trip() {
		
	}

	public Trip(String heureDepart, String heureArrivee, String lieuDepart, String lieuArrivee, int nbPlaces) {
		super();
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.lieuDepart = lieuDepart;
		this.lieuArrivee = lieuArrivee;
		this.nbPlaces = nbPlaces;
	}

	public Trip(int id, String heureDepart, String heureArrivee, String lieuDepart, String lieuArrivee, int nbPlaces) {
		super();
		this.id = id;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.lieuDepart = lieuDepart;
		this.lieuArrivee = lieuArrivee;
		this.nbPlaces = nbPlaces;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public String getLieuDepart() {
		return lieuDepart;
	}

	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}

	public String getLieuArrivee() {
		return lieuArrivee;
	}

	public void setLieuArrivee(String lieuArrivee) {
		this.lieuArrivee = lieuArrivee;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + ", lieuDepart=" + lieuDepart
				+ ", lieuArrivee=" + lieuArrivee + ", nbPlaces=" + nbPlaces + "]";
	}
	
}
