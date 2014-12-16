package socialnetworkfci;

import java.util.Scanner;

public class MessageModel 
{
  Scanner entry=new Scanner(System.in);
  public void createMessage(User sender, User receiver)
  {
      System.out.println("Enter your message content");
      String msg=entry.nextLine();
     //add msg sender reveciver to database 
  }

  public void deleteMessage() {
  }

  public void getMessage() {
      
  }

  public void updateMessage() {
  }

}