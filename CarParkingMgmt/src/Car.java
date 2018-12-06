import java.util.*;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ticket=4999;
		int i;
		String value;
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Car management System...!");
		System.out.println("How many cars you need to park ?");
		int num=input.nextInt();
		HashMap<Integer,String> al = new HashMap<Integer,String>();
		al.clear();
		System.out.println("Enter your car names ");
		for (i=0;i <= num;i++)
		{
			
			 value=input.nextLine();	
			al.put(ticket++,value);
			
		}

al.remove(4999 );

		for(Map.Entry m:al.entrySet()){    
		       //System.out.println(m.getKey()+" "+m.getValue()); 
		       System.out.println("Your car name "+m.getValue()+" is parked with the ticket no "+m.getKey()); 
		       System.out.println();
		      } 

	}

}
