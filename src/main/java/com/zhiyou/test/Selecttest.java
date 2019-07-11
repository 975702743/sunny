package com.zhiyou.test;



import java.sql.*;



public class Selecttest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("×¢²áÇý¶¯³É¹¦£¡");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("×¢²áÇý¶¯Ê§°Ü");
			e.printStackTrace();
			return;
		}
		String url="jdbc:mysql:///test";
		Connection cn=null;
		try {
			cn=DriverManager.getConnection(url,"root","123456");
			//
			Statement st=cn.createStatement();
			System.out.println("´´½¨statement³Â¹¬");
			ResultSet rs=st.executeQuery("select bookid,bookname ,price from t_book order by bookid");
			
			
			while(rs.next()) {
				System.out.println("22222222222");
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt("price"));
			}
			
			rs.close();
			st.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(cn!=null) {
					cn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		}
		
		
		
		
		
	}
	

}
