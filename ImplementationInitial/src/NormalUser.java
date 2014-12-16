import java.util.Scanner;


public class NormalUser extends User {

	private Scanner entry= new Scanner (System.in);
	public int numberOfFriends=0;
	public NormalUser(String nextLine, String nextLine2, String nextLine3,
			String nextLine4, String nextLine5, int nextInt) {
		// TODO Auto-generated constructor stub
	}

	public NormalUser() {
		// TODO Auto-generated constructor stub
	}

	public void NormaUser(String n, String e, String p,String g, String bd, int a)
	{
		name=n;
		email=e;
		password=p;
		gender=g;
		birth_date=bd;
		age=a;
		type="Normal";
		ID=ID+1;
	}
	
    public void checkCurrentFriendsCount() {
    	
    }
  

  
    public User makeInstance ()
    {
    	User object;
    	
    	System.out.println("You chose Normal User Type");
    	System.out.println("Enter these data in the same order");
    	System.out.println("-Name(String). -Email(String). -Password(String). -Gender(String). -Birth Date(String). -Age(int).");
    	
    	object=new NormalUser(entry.nextLine(),entry.nextLine(), entry.nextLine(), entry.nextLine(), entry.nextLine(), entry.nextInt() );
    	
    	return object;
    }
   
	
  
  
  
@Override
public void sendFriendRequest(User u) {
	
	// TODO Auto-generated method stub
	
}

@Override
public void addFriend() {
	// TODO Auto-generated method stub
	
}

}