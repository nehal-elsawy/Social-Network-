
import java.sql.*;
import java.util.Scanner;

public class UserModel {

    public User myUser;
    private Scanner entry = new Scanner(System.in);
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/socialnetwork"; 
    // -----------------------------
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    //------------------------------
    public static Connection con ;
    public static Statement st ;
    public static PreparedStatement pr ;
    //Create User_________________________________
    

  public void CreateUser(User user)throws SQLException, ClassNotFoundException{
	    con=null;
	    st=null;
	    String n = user.name;
	    int a = user.age;
	    String g = user.gender;
	    String bd = user.birth_date;
	    String pwd = user.password;
	    String em = user.email;
	    String type=user.type;
	    String id= user.ID;
	    Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(DB_URL, USER, PASS);//Open a connection
	    System.out.println("connection opened successfully");
	    st = con.createStatement();// to prepare to Execute a query
	    String insert = "insert into usermodel values(?,?,?,?,?,?,?,?)";
	    pr=con.prepareStatement(insert);
	    pr.setString(1, id);
	    pr.setString(2,type);
	    pr.setString(3, n);
	    pr.setString(4, pwd);
	    pr.setString(5, em);
	    pr.setInt(6, a);
	    pr.setString(7, g);
	    pr.setString(8, bd);
	    st.executeUpdate(insert);//Execute a query
	    
	  System.out.println("Congratulations! Now you are a user");
  }

  public void DeleteUser(User cur_user) throws SQLException, ClassNotFoundException
  {
    String id = cur_user.ID;
    con=null;
    st=null;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(DB_URL, USER, PASS);//Open a connection
    System.out.println("connection opened successfully");
    st = con.createStatement();// to prepare to Execute a query
    String delete = "delete from usermodel where ID=id";
    st.executeUpdate(delete);//Execute a query
      System.out.println("user deleted");
  }

  public void getUser() throws ClassNotFoundException, SQLException 
  {
    System.out.print("Enter name of user you want to search for : ");
    String n=entry.nextLine();
    con=null;
    st=null;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(DB_URL, USER, PASS);//Open a connection
    System.out.println("connection opened successfully");
    st = con.createStatement();// to prepare to Execute a query
    String select ="select name from usermodel where name=n";
    //STEP: Execute a query
    ResultSet rs = st.executeQuery(select);
    //STEP: Extract data from result set
    while(rs.next())
    {
         //Retrieve by column name
        String name = rs.getString("name");
        String type = rs.getString("type");
        int age = rs.getInt("age");
        String gender = rs.getString("gender");
        
         //Display values
         System.out.print("Name: " + name);
         System.out.println(", type: " + type);
         System.out.print(", Age: " + age);
         System.out.print(", Gender: " + gender);
         
      }
  }

  public void updateUser(User user) throws ClassNotFoundException, SQLException
  {
     String id= user.ID;
     System.out.print("enter your new e-mail : ");
     String new_email = entry.nextLine();
    con=null;
    st=null;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(DB_URL, USER, PASS);//Open a connection
    System.out.println("connection opened successfully");
    st = con.createStatement();// to prepare to Execute a query
    String update= "update usermodel set email=new_email where ID=id";
     st.executeUpdate(update);//Execute a query
      System.out.println("user updated");
  }
 public boolean check()
 {
     System.out.println("enter your e-mail");
     String email=entry.nextLine();
     System.out.println("enter your password");
     String pwd=entry.nextLine();   
     return true;
 }
  
  public boolean makeFriendRequst(User myUser)
  {
	return checkRequest();  
  }
  public boolean checkRequest()
  {
	  //If the request is successfully sent
	  return true;
  }
  

}