package socialnetworkfci;

import java.util.Scanner;

public class ChatMessage extends Message
{
  public User receiver;
  public User sender;
  Scanner entry=new Scanner(System.in);
    
  public MessageModel msg_db;
    /**
     *@Override
     * add name of receiver 
     */ 
  
  public void addReceiver() 
  {
      System.out.println("enter receiver name: ");
      receiver.name=entry.nextLine();
  }
}