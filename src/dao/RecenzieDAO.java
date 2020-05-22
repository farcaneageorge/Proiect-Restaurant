package dao;

import java.sql.*;
import java.util.ArrayList;

import helper.DBHelper;
import pojo.Recenzie;

public class RecenzieDAO {

	public void createRecenzie(Recenzie re) throws SQLException {
		Connection con = DBHelper.getConnection();

		String insertString = "INSERT INTO recenzie (id, data, nume, detalii, punctaj ) VALUES (?, ?, ?, ?, ?);";
		PreparedStatement stmt = con.prepareStatement(insertString);

		stmt.setInt(1, re.getId());
		stmt.setString(2, re.getData());
		stmt.setString(3, re.getNume());
		stmt.setString(4, re.getDetalii());
		stmt.setInt(5, re.getPunctaj());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public ArrayList<Recenzie> getRecenzi() throws SQLException {
		Connection con = DBHelper.getConnection();
		String selectString = "select * from recenzie";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectString);

		ArrayList<Recenzie> result = new ArrayList<Recenzie>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String data = rs.getString("data");
			String nume = rs.getString("nume");
			String detalii = rs.getString("detalii");
			int punctaj = rs.getInt("punctaj");

			Recenzie re = new Recenzie(id, data, nume, detalii, punctaj);
			result.add(re);
		}
		DBHelper.closeConnection(con);
		return result;
	}

	public Recenzie getRecenzieById(String recenzieId) throws SQLException {
		Connection con = DBHelper.getConnection();
		String selectString = "select * from recenzie where id=?";
		PreparedStatement stmt = con.prepareStatement(selectString);
		stmt.setString(1, recenzieId);
		ResultSet rs = stmt.executeQuery();
		Recenzie result = null;
		if (rs.next()) {
			int id = rs.getInt("id");
			String data = rs.getString("data");
			String nume = rs.getString("nume");
			String detalii = rs.getString("detalii");
			int punctaj = rs.getInt("punctaj");

			result = new Recenzie(id, data, nume, detalii, punctaj);
		}
		DBHelper.closeConnection(con);
		return result;

	}

	public void updateRecenzie(Recenzie recenzie) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String updateString = "UPDATE recenzie SET data=?, nume= ?, detalii=?, punctaj=? WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(updateString);
		stmt.setString(1, recenzie.getData());
		stmt.setString(2, recenzie.getNume());
		stmt.setString(3, recenzie.getDetalii());
		stmt.setInt(4, recenzie.getPunctaj());
		stmt.setInt(5, recenzie.getId());

		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

	public void delete(Recenzie recenzie) throws SQLException {
		Connection con = (Connection) DBHelper.getConnection();
		String deleteString = "DELETE FROM recenzie WHERE id=?";
		PreparedStatement stmt = con.prepareStatement(deleteString);
		stmt.setInt(1, recenzie.getId());
		stmt.executeUpdate();

		DBHelper.closeConnection(con);
	}

}
