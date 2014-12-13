import java.util.Scanner;

public class GroupModel {

    public Group myGroup;
    Group g=new Group();
    User user1;
    private Scanner entry = new Scanner (System.in);
  public void createGroup() {
      g.get_Group();
     // insert into groupdb name;
      //add to db
  }

  public void updateGroup() {
	  System.out.println("1- Add Member");
	  System.out.println("2- Remove Member");
	  int choice =entry.nextInt();
	  
	  if (choice==1)
	  {
		  g.addMember(user1.getCurrentActiveUser());  
	  }
	  else if (choice==2)
	  {
		  g.removeMember();
	  }
  }

  public void getGroup() {
  }

  public void deleteGroup() {
  }

}