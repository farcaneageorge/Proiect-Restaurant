package pojo;

public class Meniu {

	private int id;
	private String denumire;
	private String gramaj;
	private String informati;
	private int pret;
	private String imagePath;
	
	public Meniu() {
	super();
		}
	
	
	public Meniu(int id, String denumire, String gramaj, String informati, int pret, String imagePath) {
		super();

		this.id = id;
		this.denumire = denumire;
		this.gramaj = gramaj;
		this.informati = informati;
		this.pret = pret;
		this.setImagePath(imagePath);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getGramaj() {
		return gramaj;
	}
	public void setGramaj(String gramaj) {
		this.gramaj = gramaj;
	}
	public String getInformati() {
		return informati;
	}
	public void setInformati(String informati) {
		this.informati = informati;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
	
	
