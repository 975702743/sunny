package com.zhiyou.test;
import java.sql.*;
public class UpdataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executeUpdate("update t_book set price=30 where bookid=1");
		//executeUpdate("insert into t_book(bookid, bookname,price) values(4,'编译原理'90)");
		executeUpdate("delete  from t_book where bookid=1");

	}
	public static void executeUpdate(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("注册驱动成功");
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败");
			e.printStackTrace();
		}
		String url="jdbc:mysql:///test";
		Connection cn=null;
		try {
			//构建Java和数据可之间的桥梁：URL 用户名 密码
			cn=DriverManager.getConnection(url,"root","123456");
			Statement st=cn.createStatement();
			System.out.println("创建Statemebt成功");
			
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
