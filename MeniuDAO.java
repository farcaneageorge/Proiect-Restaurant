package dao;

import java.sql.*;
import java.util.ArrayList;

import helper.DBHelper;
import pojo.Meniu;

public class MeniuDAO {

	public void createMeniu(Meniu m) throws SQLException {
		Connection con = DBHelper.getConnection();

		String insertString = "INSERT INTO meniu (id, denumire, gramaj, informati, pret, image_path ) VALUES (?, ?, ?, ?, ?, ?);";
		PreparedStatement stmt = con.prepareStatement(insertString);

		stmt.setInt(1, m.getId());
		stmt.setString(2, m.getDenumire());
		stmt.setString(3, m.getGramaj());
		stmt.setString(4, m.getInformati());
		stmt.setInt(5, m.getPret());
		stmt.setString(6, m.getImagePath());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public ArrayList<Meniu> getMeniuri() throws SQLException {
		Connection con = DBHelper.getConnection();
		String selectString = "select * from meniu";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Meniu> result = new ArrayList<Meniu>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String denumire = rs.getString("denumire");
			String gramaj = rs.getString("gramaj");
			String informati = rs.getString("informati");
			int pret = rs.getInt("pret");
			String imagePath= rs.getString("image_path");

			Meniu m = new Meniu(id, denumire, gramaj, informati, pret,imagePath);
			result.add(m);
		}
		DBHelper.closeConnection(con);
		return result;
	}

	public Meniu getMeniuById(String meniuId) throws SQLException {
		Connection con = DBHelper.getConnection();
		String selectString = "select * from meniu where id=?";
		PreparedStatement stmt = con.prepareStatement(selectString);
		stmt.setString(1, meniuId);
		ResultSet rs = stmt.executeQuery();
		Meniu result = null;
		if (rs.next()) {
			int id = rs.getInt("id");
			String denumire = rs.getString("denumire");
			String gramaj = rs.getString("gramaj");
			String informati = rs.getString("informati");
			int pret = rs.getInt("pret");
			String imagePath= rs.getString("image_path");

			result = new Meniu(id, denumire, gramaj, informati, pret,imagePath);
		}
		DBHelper.closeConnection(con);
		return result;

	}

	public void updateMeniu(Meniu meniu) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String updateString = "UPDATE meniu SET denumire=?, gramaj= ?, informati=?, pret=?,image_path=? WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(updateString);
		stmt.setString(1, meniu.getDenumire());
		stmt.setString(2, meniu.getGramaj());
		stmt.setString(3, meniu.getInformati());
		stmt.setInt(4, meniu.getPret());
		stmt.setString(5, meniu.getImagePath());
		stmt.setInt(6, meniu.getId());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public void delete(Meniu meniu) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String deleteString = "DELETE FROM meniu WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(deleteString);
		stmt.setInt(1, meniu.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

}
