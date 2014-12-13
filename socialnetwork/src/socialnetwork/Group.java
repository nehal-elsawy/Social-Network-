import java.util.Map;
import java.util.Scanner;

public class Group extends IGroup {

  public String title;
  public String coverPicture;
  public String Role;
  public Map<User,Role> users;
  public int counter;
  
  Role r=new Role();
  GroupModel g=new GroupModel();
  Scanner scan=new Scanner(System.in);
  
  public Group(){
      title="";
      coverPicture="";
      Role="";
      counter=0;
}
  public void input_Group()
   { 
      System.out.println("enter group name");
      title=scan.next();
      g.createGroup();
   }
  public String get_Group()
   {
       return title;
   }

  public void addMember(User user) {
      if(counter<=1000)
      {
          //add user to db
        System.out.println("you can be added"); 
        counter++; 
      }   
  }

  public void removeMember() {
      //remove user from db
      counter--;
  }

  public void setRole(User user) {
      System.out.println("enter your ROLE");
      Role=scan.next();
      r.set_role(Role);
      users.put(user, r);
      
      
  }

}