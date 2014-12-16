package socialnetworkfci;

import java.util.Scanner;

public abstract class Message
{
    
    Scanner entry=new Scanner(System.in);
    public User receiver;
    public User sender;  
    public MessageModel msg_db;
    public ChatMessage chatmsg;
    /**
     * send message specifying sender and receiver then call create message to write message 
     * then it will be added to database
     */
   public void sendMessage()
  {
      sender=sender.getCurrentActiveUser();
      System.out.println("Sender name: "+sender.name);
      msg_db.createMessage(sender,receiver);
  }
  public void addReceiver() 
  {}
}