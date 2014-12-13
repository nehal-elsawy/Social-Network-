import java.util.Scanner;


public class PremiumUser extends User {

  private Scanner entry= new Scanner (System.in);
  public String creditCardNumber;
  
  
  public PremiumUser(String n, String e, String p,String g, String bd, int a, String ccn)
	{
		name=n;
		email=e;
		password=p;
		gender=g;
		birth_date=bd;
		age=a;
		type="Premium";
		ID=ID+1;
		creditCardNumber=ccn;
	}

  public PremiumUser() {
	// TODO Auto-generated constructor stub
}

public void payByCredit() {
	  System.out.println("Using your credit card Number, Pay Operation:");
	  System.out.println("Enter expiration date:");
	  String edate=entry.nextLine();
	  System.out.println("Enter Billing Address:");
	  String bAddress=entry.nextLine();
	  System.out.println("Payment Operation is done");
	  
  }

  
  
  public User makeInstance ()
  {
	User object;
  	
  	System.out.println("You chose Premium User Type");
  	System.out.println("Enter these data in the same order");
  	System.out.println("-Name(String). -Email(String). -Password(String). -Gender(String). -Birth Date(String). -Age(int). -Credit Card Number");
  	
  	object=new PremiumUser(entry.nextLine(),entry.nextLine(), entry.nextLine(), entry.nextLine(), entry.nextLine(), entry.nextInt(), entry.nextLine() );
  	payByCredit();
  	
  	return object;
  	
  }
  
  public void Pay()
  {
	  
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