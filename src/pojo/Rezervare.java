package pojo;

public class Rezervare {

	private int id;
	private String nume;
	private String prenume;
	private String nrTelefon;
	private String infoRezervare;
	


	public Rezervare() {
		super();
	}

	public Rezervare(int id, String nume, String prenume, String nrTelefon, String infoRezervare) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.nrTelefon = nrTelefon;
		this.infoRezervare = infoRezervare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getInfoRezervare() {
		return infoRezervare;
	}

	public void setInfoRezervare(String infoRezervare) {
		this.infoRezervare = infoRezervare;
	}



	
	}

