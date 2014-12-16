package socialnetworkfci;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class User {

  //**********Attributes**********
  public String name;
  public String email;
  public String type;
  public String password;
  public String gender;
  public String birth_date;
  public int age;
  public String ID;

  
  public int numberOfRequests;
  private static User user;
  public Message message;

//  public User myUser1;
//  public User Instance;
  
  public UserModel myUserModel;
  private Scanner entry;
  private String[] requests=null;

  //***********Functions***********
  
  //Constructor 
  protected User() {
	  name="";
	  email="";
	  password="";
	  gender="";
	  birth_date="";
	  age=0;
  }

  // 2 Functions used to send a friend request (sendFriendRequest + Check number of friends)
  public void sendFriendRequest(User u)
  {
	  System.out.println("Entered");
	  int number;
	  number=u.checkNumberOfFriends(u);
	  
	  if (u.type=="Normal")
	  {
		  if (number>=4000)
		  {
			  System.out.println("You are a user of type normal, and it is not allowed to add more than 4000 user");
		  }
		  else
		  {   //Send the request to the user .. //In case of acceptance .. add this new friend to User u friends list
			  System.out.print("You are allowed to send a friend request as a Normal User");
			  if (myUserModel.makeFriendRequst(u)==true)
			  {
				  System.out.println("Friend Request Successfully sent");
			  }
			   
		  }
	  }
	  else if (u.type=="Premium")
	  { 
		//Send the request to the user .. //In case of acceptance .. add this new friend to User u friends list  
		  if (myUserModel.makeFriendRequst(u)==true)
		  {
			  System.out.println("Friend Request Successfully sent");
		  }
		
	  }
  }
  
  public int checkNumberOfFriends(User u)
  {
	  int numOfFriends = 0;
	  //Get the number of Friends of user u from the database
	  return numOfFriends;
  }
  
  //If a user has friend requests .. this is a function to perform accept or deny operations
  public void addFriend()
  {
	  //We may here also call the function getCurrentActiveUser()
	  if (requests.length>0)
	  {
		  for (int i=0; i<requests.length; i++ )
		  {
			  System.out.println(requests[i] + " sent you a friend request ");
			  System.out.println("1- Accept.  2-Deny");
			  entry = new Scanner (System.in);
			  int choice = entry.nextInt();
			  
			  if (choice==1){
				  System.out.println(" You have successfully added "+ requests[i]);
			  }
			  
			  else if (choice==2)
			  {
				  System.out.println(" You have deined the friend request of "+ requests[i]);
			  }
			  
		  }
	  }
  }
//Sign Up
  NormalUser user1 = null;
  PremiumUser user2=null;
  
  public void signUp (Map <String,String> data) throws ClassNotFoundException, SQLException {
	  
	  System.out.println("sign up function entered");
	  data =new HashMap<String, String>();
	  Iterator<Map.Entry<String,String>> entries=data.entrySet().iterator();
	  
	  while (entries.hasNext())
	  {
		  Map.Entry<String,String> entry=entries.next();
		  
		  if(entry.getValue() == "Normal")
		    {
		    	
		    	user1.makeInstance();
		    	user=user1.makeInstance();
		    }
		    
		    else if (entry.getValue()=="Premium")
		    {
		    	
		    	user2.makeInstance();
		    	user=user2.makeInstance();
		    }
		    
		    myUserModel.CreateUser(user);
		    //Save user object in the database
	  }
	  
	  }
	  
//Get Current user
  public User getCurrentActiveUser() {
	  if (user==null)
	  
	  {
		  System.out.println("There is no instance of the user object");
		  System.out.println("Now new instance will be created for you");
		  System.out.println("Choose 1-NormalUser.  2-PremiumUser");
		  
		  entry = new Scanner (System.in);
		  int choice=entry.nextInt();	
		  
		  if (choice==1)	
		  { System.out.println("Login to create new instance for you");
			  user.login();
		      return new NormalUser();}
		  
		  else if (choice==2)
		  {  
			  System.out.println("Login to create new instance for you");
			  user.login();
		      return new PremiumUser();}
		  
		  else
			  System.out.println("Wrong entry");
	  }
	  
	  return user;
	
  }

  public void login() {
  }

  public void logout() {
  }


}