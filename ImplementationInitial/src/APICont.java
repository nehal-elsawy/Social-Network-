import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class APICont {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	User user1= new User();	
	UserModel myUserModel=new UserModel();
	
	Map<String,String> data =new HashMap<String, String>();

	System.out.println("Choose point list:");
	System.out.println("1- Sign up.");
	System.out.println("2- Send Friend Request");
	System.out.println("3- Add Friend");
	System.out.println("4- Login");
	System.out.println("5- Logout");
	System.out.println("6- Search User");
	System.out.println("7- Update User");
	System.out.println("8- Delete Account");
	System.out.println("");
	System.out.println("Enter your choice");
	System.out.println("");
	
	
	Scanner entry= new Scanner (System.in);
	int choice=entry.nextInt();	
	

	if (choice==2)
	{
		User instance=user1.getCurrentActiveUser();
	
		user1.sendFriendRequest(instance);
	}
	
	else if (choice ==1 )
	{
		String ID = null;
		System.out.println ("Create new Account");
		System.out.println ("Choose 1-Normal User.  2-Premium User.");
		int c=entry.nextInt();	
		
		if (c==1)
		{
			data.put(ID+"1", "Normal");
		}
		else if (c==2)
		{
			data.put(ID+"1", "Premium");
		}
		
		user1.signUp(data);
		
	}
		
	else if (choice==3)
	{
		user1.addFriend();
	}
	
	else if (choice==4)
	{
		user1.login();
	}
	else if (choice==5)
	{
		user1.logout();
	}
	
	else if (choice==6)
	{
		myUserModel.getUser();
	}
	else if (choice==7)
	{
		myUserModel.updateUser(user1);
	}
	else if (choice==8)
	{
		myUserModel.DeleteUser(user1);
	}
	
	else 
	{
		System.err.println("Wrong number entry");
	}
	
	entry.close();
	}

}
