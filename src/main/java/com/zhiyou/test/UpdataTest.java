package com.zhiyou.test;
import java.sql.*;
public class UpdataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executeUpdate("update t_book set price=30 where bookid=1");
		//executeUpdate("insert into t_book(bookid, bookname,price) values(4,'����ԭ��'90)");
		executeUpdate("delete  from t_book where bookid=1");

	}
	public static void executeUpdate(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ע�������ɹ�");
		} catch (ClassNotFoundException e) {
			System.out.println("ע������ʧ��");
			e.printStackTrace();
		}
		String url="jdbc:mysql:///test";
		Connection cn=null;
		try {
			//����Java�����ݿ�֮���������URL �û��� ����
			cn=DriverManager.getConnection(url,"root","123456");
			Statement st=cn.createStatement();
			System.out.println("����Statemebt�ɹ�");
			
			int result=st.executeUpdate(sql);
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
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
