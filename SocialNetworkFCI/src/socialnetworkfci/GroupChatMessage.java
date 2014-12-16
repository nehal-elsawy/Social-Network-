package socialnetworkfci;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupChatMessage extends Message {

  public ArrayList<String> allUsers=new ArrayList();
                
  public String title;
  Scanner scan=new Scanner(System.in);
  String names;

  public void addReceiver()
  {
      while(true)
      {
          System.out.println("Enter the users names");
          allUsers.add(scan.nextLine());
      }
  }

}