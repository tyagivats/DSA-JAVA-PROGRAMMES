package JDBCMYSQL;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentDB {

//	public static void main(String[] args) throws SQLException {
//		String host="jdbc:mysql://localhost:3306/StudentDB";
//		String username="root";
//		String password="";
//		String create_table="""
//				CREATE TABLE IF NOT EXISTS student(
//				id INT PRIMARY KEY AUTO_INCREMENT,
//				name VARCHAR(50) NOT NULL,
//				course VARCHAR(50),
//				marks DECIMAL(10,2)
//				)
//				""";
//		// TODO Auto-generated method stub
//		try {
//			//LOAD DRIVER
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver ready");
//		//CONNECT
//		Connection con=	DriverManager.getConnection(host,username,password);
//		System.out.println("Host ready");
//		//CREATE STATEMENT 
//		Statement smt =con.createStatement(
//				ResultSet.TYPE_SCROLL_INSENSITIVE,//no update ye backward jaega 
//				ResultSet.CONCUR_UPDATABLE
//
//);
//		smt.execute(create_table);
//        System.out.println("Table ready");
//	
//        smt.executeUpdate("""
//                INSERT INTO student(name,course,marks) VALUES
//                ('Student1','MCA',96.4),
//                ('Student2','MBA',60.4),
//                ('Student3','MA',66.8)
//            """);
//		ResultSet rs=smt.executeQuery("Select*from student");
//		
//		while (rs.next()) {
//            double marks = rs.getDouble("marks");
//
//            if (marks <= 70) {
//                rs.updateDouble("marks", marks + 5);
//                rs.updateRow();
//            }
//		}
//		 rs.afterLast();
//         while (rs.previous()) {
//             System.out.println(
//                     rs.getInt("id") + "\t" +
//                     rs.getString("name") + "\t" +
//                     rs.getString("course") + "\t" +
//                     rs.getDouble("marks")
//             );
//         }
//		//CREATE TABLE
//		smt.execute(create_table);
//		System.out.println("table ready");
//		while(rs.next()) {
//			long marks=rs.getLong("marks");
//			if(marks<=70) {
//rs.updateLong("marks",marks+5);
//rs.updateRow();
//				
//			}
//		}
//		//PRINT REVERSE
//		rs.afterLast();
//		while(rs.previous()){
//			int id=rs.getInt("id");
//			String name =rs.getString("name");
//			String course=rs.getString("course");
//			long marks=rs.getLong("marks");
//			System.out.println(
//					String.format("%d\t%s\t%s\t\t%d",id,name,course,marks)
//					);
//		
//					
//			
//			System.out.println();
//		}
//int rowAffected=smt.executeUpdate("""
//		insert into student(name,course,marks) values
//		('Student1','MCA',96.4),('Student2','MBA',6.4),('Student3','MA',96.8)
//		
//			""");
//			
//		if(rowAffected>0) {
//			System.out.println("record insert");
//			
//		}
//		else {
//			System.out.println("not inserted");
//		}
//	
//		smt.execute(create_table);//execute use DDL 
//		System.out.println("show table");
//		//CONNECTION CLOSE
//		con.close();
//		} catch(Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		//	System.out.println(e.getMessage());	 	
//		}
//	} 
//}
	

//ublic class StudentDB {

	    public static void main(String[] args) {

	        String host = "jdbc:mysql://localhost:3306/studentdb";
	        String username = "root";
	        String password = "";

	        String create_table = """
	            CREATE TABLE IF NOT EXISTS student(
	                id INT PRIMARY KEY AUTO_INCREMENT,
	                name VARCHAR(50) NOT NULL,
	                course VARCHAR(50),
	                marks DECIMAL(10,2)
	            )
	        """;

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver ready");

	            Connection con = DriverManager.getConnection(host, username, password);
	            System.out.println("Connected");

	            Statement smt = con.createStatement(
	                    ResultSet.TYPE_SCROLL_INSENSITIVE,
	                    ResultSet.CONCUR_UPDATABLE
	            );

	            // ✅ CREATE TABLE
	            smt.execute(create_table);
	            

	            // ✅ INSERT
	            smt.executeUpdate("""
	                INSERT INTO student(name,course,marks) VALUES
	                ('Student1','MCA',96.4),
	                ('Student2','MBA',60.4),
	                ('Student3','MA',66.8)
	            """);

	            // ✅ SELECT
	            ResultSet rs = smt.executeQuery("SELECT * FROM student");
	         // ResultSet rs = smt.executeQuery("SELECT * FROM student");

	            rs.moveToInsertRow();
	            rs.updateString("name", "Student4");
	            rs.updateString("course", "BTech");
	            rs.updateDouble("marks", 78.5);
	            rs.insertRow();
	            rs.moveToCurrentRow();

	            System.out.println("Inserted using ResultSet");

	            // ✅ UPDATE
	            while (rs.next()) {
	                double marks = rs.getDouble("marks");

	                if (marks <= 70) {
	                    rs.updateDouble("marks", marks + 5);
	                    rs.updateRow();
	                }
	            }

	            // ✅ PRINT
	            rs.afterLast();
	            while (rs.previous()) {
	                System.out.println(
	                        rs.getInt("id") + "\t" +
	                        rs.getString("name") + "\t" +
	                        rs.getString("course") + "\t" +
	                        rs.getDouble("marks")
	                );
	            }

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}