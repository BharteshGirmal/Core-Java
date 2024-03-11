package study.HW;

public class Message 
{
	private String SenderName;
	private String ReciverName;
	private String Messages;
	private Address ReceiverAddress;
	
	public Message()
	{
		this.SenderName=null;
		this.ReceiverAddress=null;
		this.Messages=null;
		this.ReceiverAddress=null;
	}
	
	public Message(String SenderName ,String ReciverName, String Messages,Address ReceiverAddress )
	{
		this.SenderName=SenderName;
		this.ReciverName=ReciverName;
		this.Messages=Messages;
		this.ReceiverAddress=ReceiverAddress;
	}
	
	public String toString()
	{
		String str="Sender : "+this.SenderName+"\nReceiver : "+this.ReciverName+
				"\nMessage : "+this.Messages+"\nAddress: "+this.ReceiverAddress;
		str+="\n________________________________________________________________";
		return str;
	}

	public String getSenderName() 
	{
		return SenderName;
	}

	public void setSenderName(String senderName) 
	{
		SenderName = senderName;
	}

	public String getReciverName() 
	{
		return ReciverName;
	}

	public void setReciverName(String reciverName) 
	{
		ReciverName = reciverName;
	}

	public String getMessages()
	{
		return Messages;
	}

	public void setMessages(String messages)
	{
		Messages = messages;
	}

	public Address getReceiverAddress() 
	{
		return ReceiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) 
	{
		ReceiverAddress = receiverAddress;
	}
	
	

}
