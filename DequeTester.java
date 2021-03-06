//Team ILackCreativitySo-MeToo - T. Fabiha, Nadine Jackson, Isaac Jon
//APCS2 pd2
//L #02: All Hands on Deque!
//2018-04-20

public class QQDriver
{
    
    public static void s(Object x)
    {
	System.out.println(x);
    }
    
    public static void main(String[] args)
    {
	
	//PHASE TWO IMPLEMENTATION
	Deque<String> teamVoltron = new QQKachoo<String>();
	s("Empty Deque teamVoltron created");
	//s("Getting paladin at the front end: "+teamVoltron.getFirst()); //Exception
	//s("Getting paladin at the back end: "+teamVoltron.getLast()); //Exception

	s("");
	
	/*
	s("Attempting to add null"); //Should throw an exception
	teamVoltron.addFirst(null);
	*/
	
	s("Adding Paladin Lance in the front end");
	teamVoltron.addFirst("Lance");
	s("Adding Paladin Keith in the front end");
	teamVoltron.addFirst("Keith");
	s("Adding Paladin Pidge in the front end");
	teamVoltron.addFirst("Pidge");
	s("Adding Paladin Hunk in the front end");
	teamVoltron.addFirst("Hunk");
	s("Adding Paladin Shiro in the front end");
	teamVoltron.addFirst("Shiro");
	s("Adding Paladin Allura in the front end");
	teamVoltron.addFirst("Allura");

	s("");
	
	s("Paladins in teamVoltron: "+teamVoltron); //Should print 6 names, but there is an error with the toString method
	s("Getting the paladin at the front end: "+teamVoltron.getFirst());
	s("Getting the paladin at the back end: "+teamVoltron.getLast());

	s("");
	
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	s("Removing a paladin from front: "+teamVoltron.removeFirst());
	//s("Removing a paladin from front, there should be none. "+teamVoltron.removeFirst()); //Exception

	s("");
	
	s("Adding Paladin Lance in the back end");
	teamVoltron.addLast("Lance");
	s("Adding Paladin Keith in the back end");
	teamVoltron.addLast("Keith");
	s("Adding Paladin Pidge in the back end");
	teamVoltron.addLast("Pidge");
	s("Adding Paladin Hunk in the back end");
	teamVoltron.addLast("Hunk");
	s("Adding Paladin Shiro in the back end");
	teamVoltron.addLast("Shiro");
	s("Adding Paladin Allura in the back end");
	teamVoltron.addLast("Allura");

	s("");
	
	s("Paladins in teamVoltron: "+teamVoltron);
	s("Getting the paladin at the front end: "+teamVoltron.getFirst());
	s("Getting the paladin at the back end: "+teamVoltron.getLast());

	s("");
	
	s("Removing a paladin from back: "+teamVoltron.removeLast());
	s("Removing a paladin from back: "+teamVoltron.removeLast());
	s("Removing a paladin from back: "+teamVoltron.removeLast());
	s("Removing a paladin from back: "+teamVoltron.removeLast());
	s("Removing a paladin from back: "+teamVoltron.removeLast());
	s("Removing a paladin from back: "+teamVoltron.removeLast()); 
	//s("Removing a paladin from back, there should be none. "+teamVoltron.removeLast()); //Exception
	
      
    }
}
