package com.beans;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import common.D;

public class ConnectionDAO {
	private static Connection conn;
	
	private ConnectionDAO(){}
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(D.DRIVER);
				conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
				System.out.println("DB연결 성공");
			}catch(Exception e) {
				System.out.println("DB 연결실패");			
				e.printStackTrace();
			}
		}
		return conn;
	}
}
