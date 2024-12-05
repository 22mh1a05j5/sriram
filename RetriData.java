import java.sql.*;
class DBConn
{
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int res = 0;


	
	public DBConn();
	{
		try{
			clsss.forName("com.mysql.cj.jdbc.Driver");
		}catch(classNotFoundException ce){
		ce.printStackTrace();
		}
		try{
			con=DriverManager.getconnection("jdbc:mysql://localhost:3306/vijay","root","");
		}catch(SQLExecption se){
		se.printStackTrace();
			
	}
	
	 public ResultSet retData(String query)
	
	{
		try{
			stmt=con.createstatement();
			rs=stmt.executeQuery(query);
		}catch(SQLExecption se){
		se.printStackTrace();
		}
		return rs;
		
	}
}



class RetriData
{
	public static void main(String[] args) throws SQLException
	{
		DBConn dbc = new DBConn();

		String query = "select * from marble";

		ResultSet rs = dbc.retData(query);

		while(rs.next())
		{
			System.out.println(rs.getString(1) + "\t" + rs.getString("spass"));
		}
	}
}

