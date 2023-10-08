package msc.dbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataBaseConnection {
	private static String DBDRIVER="com.mysql.cj.jdbc.Driver" ;
	private static String DBURL="jdbc:mysql://localhost:3306/msc?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true&allowPublicKeyRetrieval=true" ;
	private static String DBUSER="root" ;
	private static String DBPASSWORD="root" ;
	private static Connection conn=null ;

//	static{
//		try {
//			Class.forName(DBDRIVER) ;
//			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
//		} catch (Exception e) {
//			System.out.println("vv"+e.getMessage());
//		}
//	}

	
	public Connection getConnection() {
		try {
			Class.forName(DBDRIVER) ;
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
		} catch (Exception e) {
			System.out.println("vv"+e.getMessage());
		}
		return conn ;
	}

	public void close() {
		try {
			this.conn.close() ;
		}
		catch (Exception e) {
		}
	}
	
//	public static void main(String[] args) {
//		DataBaseConnection dbc=new DataBaseConnection();
//		Connection conn=dbc.getConnection();
//		try {
//			Statement stmt=conn.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from user where id='1' and kind='admin'");
//		    while(rs.next()){
//			System.out.println(rs.getString(2));}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
