package JDBCMYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentPre {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String host="jdbc:mysql://localhost:3306/StudentDB";
		String username="root";
		String password="";
		String query="select*from student where course=?";
		String insert="insert INTO student(name,course,marks) values(?,?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver ready");
		Connection con=DriverManager.getConnection(host,username,password);
	//	String update;
		//prepared statement
//		PreparedStatement inpsv=con.prepareStatement(update);
//		inpsv.setString(1, "Student7");
//		inpsv.setString(2,"MBA");
//		inpsv.setLong(3,77);
//		inpsv.executeUpdate();
		
		PreparedStatement ps = con.prepareStatement(
			    "UPDATE student SET name=? WHERE id=?"
			);

			ps.setString(1, "Student 8"); // new marks
			ps.setInt(2,1);  // id

			ps.executeUpdate();
		
		PreparedStatement inpst=con.prepareStatement(insert);
		inpst.setString(1,"Student7");
		inpst.setString(2,"MCA");
		inpst.setLong(3,88);

		inpst.executeUpdate();
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, "MCA");
	//	pst.setString(2,"MBA");
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			int id=rs.getInt("id");
			String name =rs.getString("name");
			String course=rs.getString("course");
			long marks=rs.getLong("marks");
			System.out.println(
					String.format("%d\t%s\t%s\t\t%d",id,name,course,marks)
					);
	//CONNECT
	}

}
}