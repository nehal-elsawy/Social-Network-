package socialnetworkfci;

import java.util.Map;
import java.util.Scanner;

public class GroupModel 
{
    
    Group grp=new Group();
    IGroup igrp;
    User user;
    private Scanner entry = new Scanner (System.in);
    
    
  public void createGroup() 
  {
      user=user.getCurrentActiveUser();
      igrp.MakeGroup(Map<title,String> data, user);
      
  }
  public boolean is_member(User u)
  {
      //search fl database
      return true;
  }

  public void updateGroup() {
	  System.out.println("1- Add Member");
	  System.out.println("2- Remove Member");
	  int choice =entry.nextInt();
	  
	  if (choice==1)
	  {
		  grp.addMember(user.getCurrentActiveUser());  
	  }
	  else if (choice==2)
	  {
		  grp.removeMember();
	  }
  }

  public void getGroup() {
  }

  public void deleteGroup() {
  }

}