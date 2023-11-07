package com.fr.function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fr.file.DatasourceManager;
import com.fr.script.AbstractFunction;

public class F4102Trim extends AbstractFunction {
	public Object run(Object[] args) {
		int itm = (int) args[0];
		String mcu = (String) args[1];

		try {
			com.fr.data.impl.Connection conn = DatasourceManager.getInstance().getConnection("Finreport");
			Connection con = conn.createConnection();

			String sql = "update proddta.f4102 set ibitm = ibitm where ibitm = '" + itm + "' and trim(ibmcu) = '" + mcu
					+ "' ";
			PreparedStatement preState = con.prepareStatement(sql);

			ResultSet rs = preState.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
