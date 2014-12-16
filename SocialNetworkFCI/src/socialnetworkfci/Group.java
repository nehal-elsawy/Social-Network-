package socialnetworkfci;

import java.util.Map;
import java.util.Scanner;

public class Group extends IGroup {

  public String title;
  public String coverPicture;
  public String Role;
  public Map<User,Role> users;
  public int counter;
  
  Role role=new Role();
  GroupPrivacy grp_privacy; 
  GroupModel group_model=new GroupModel();
  Scanner scan=new Scanner(System.in);
  
  public Group()
  {
      title="";
      coverPicture="";
      Role="";
      counter=0;
}
 public void addMember(User user)
  {
    
      user=user.getCurrentActiveUser();
      if(group_model.is_member(user)==0)
      {
         grp_privacy.setAllowedMembers(user);
      }
      else
          System.out.println("User already exist");
  }

  public void removeMember(User user)
  {
    
  }

  public void setRole(User user) 
  {
      System.out.println("enter your ROLE");
      Role=scan.next();
      role.set_role(Role);
      users.put(user, role);
  }

}