package dao;

import java.sql.*;
import java.util.ArrayList;

import helper.DBHelper;
import pojo.Rezervare;

public class RezervareDAO {

	public void createRezervare(Rezervare r) throws SQLException {
		Connection con =  DBHelper.getConnection();

		String insertString = "INSERT INTO rezervare (id, nume, prenume, nrTelefon, infoRezervare ) VALUES (?, ?, ?, ?, ?);";
		PreparedStatement stmt = con.prepareStatement(insertString);

		stmt.setInt(1, r.getId());
		stmt.setString(2, r.getNume());
		stmt.setString(3, r.getPrenume());
		stmt.setString(4, r.getNrTelefon());
		stmt.setString(5, r.getInfoRezervare());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public ArrayList<Rezervare> getRezervari() throws SQLException {
		Connection con =  DBHelper.getConnection();
		String selectString = "select * from rezervare";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Rezervare> result = new ArrayList<Rezervare>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String nrTelefon = rs.getString("nrTelefon");
			String infoRezervare = rs.getString("infoRezervare");

			Rezervare r = new Rezervare(id, nume, prenume, nrTelefon, infoRezervare);
			result.add(r);
		}
		DBHelper.closeConnection(con);
		return result;
	}

	public Rezervare getRezervareById(String rezervareId) throws SQLException {
		Connection con =  DBHelper.getConnection();
		String selectString = "select * from rezervare where id=?";
		PreparedStatement stmt = con.prepareStatement(selectString);
		stmt.setString(1,rezervareId);
		ResultSet rs = stmt.executeQuery();
		Rezervare result = null;
		if (rs.next()) {
			int id = rs.getInt("id");
			String nume = rs.getString("nume");
			String prenume = rs.getString("prenume");
			String nrTelefon = rs.getString("nrTelefon");
			String infoRezervare = rs.getString("infoRezervare");

			result = new Rezervare(id, nume, prenume, nrTelefon, infoRezervare);
		}
		DBHelper.closeConnection(con);
		return result;

	}

	public void updateRezervare(Rezervare rezervare) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String updateString = "UPDATE rezervare SET nume=?, prenume= ?, nrTelefon=?, infoRezervare=? WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(updateString);
		stmt.setString(1, rezervare.getNume());
		stmt.setString(2, rezervare.getPrenume());
		stmt.setString(3, rezervare.getNrTelefon());
		stmt.setString(4, rezervare.getInfoRezervare());
		stmt.setInt(5, rezervare.getId());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public void delete(Rezervare rezervare) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String deleteString = "DELETE FROM rezervare WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(deleteString);
		stmt.setInt(1, rezervare.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	
	}


