package pojo;

public class Recenzie {

private int id;
private String data;
private String nume;
private String detalii;
private int punctaj;



public Recenzie() {
	super();
}

public Recenzie(int id, String data, String nume, String detalii, int punctaj) {
	super();
	this.id = id;
	this.data = data;
	this.nume = nume;
	this.detalii = detalii;
	this.punctaj = punctaj;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getData() {
    return data;
}

public void setData(String data) {
    this.data = data;
}

public String getNume() {
    return nume;
}

public void setNume(String nume) {
    this.nume = nume;
}

public String getDetalii() {
    return detalii;
}

public void setDetalii(String detalii) {
    this.detalii = detalii;
}

public int getPunctaj() {
    return punctaj;
}

public void setPunctaj(int punctaj) {
    this.punctaj = punctaj;
}



}
