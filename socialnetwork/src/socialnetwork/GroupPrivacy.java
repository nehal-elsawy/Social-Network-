import java.util.List;
import java.util.Scanner;

public abstract class GroupPrivacy {

  public List<User> allowedUsers;
  Scanner scan=new Scanner(System.in);

  public void getAllowedMembers(IGroup group,User user){
      //System.out.println("enter the user name");
      allowedUsers.add(user);  
  }

}