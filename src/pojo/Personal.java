package pojo;

public class Personal {
    private int id;
    private String nume;
    private String prenume;
    private String functia;
    private String specializare;
    
    public Personal() {
    	
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

    public String getFunctia() {
        return functia;
    }

    public void setFunctia(String functia) {
        this.functia = functia;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public Personal(int id, String nume, String prenume, String functia, String specializare) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.functia = functia;
        this.specializare = specializare;
        
    }

}
