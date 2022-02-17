package com.te.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/parent";

		try {
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			String query = "select * from student";

			ResultSet set = stmt.executeQuery(query);

			while (set.next()) {
				System.out.println(
						set.getInt("studentId") + " "
								+ set.getString("StudName") + " " 
										+ set.getInt("studAge"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
