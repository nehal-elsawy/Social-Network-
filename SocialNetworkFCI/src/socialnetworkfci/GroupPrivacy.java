package socialnetworkfci;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GroupPrivacy {

  public ArrayList<User> allowedUsers;
  Scanner scan=new Scanner(System.in);
  public void setAllowedMembers(User user)
  {
       
      
  }
  public void getAllowedMembers(IGroup group,User user){
      //System.out.println("enter the user name");
      allowedUsers.add(user);  
  }

}