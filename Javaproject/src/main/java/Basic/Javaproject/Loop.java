package Basic.Javaproject;

import java.util.ArrayList;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Array
		String[] names ={"Samiha", "Sumu","Fh", "FS" ,"PS"};
		
		
		
		//int i=0;
		// for(i=0; i<50; i++)
		// {
			 //System.out.println(i);
		 //}
		
		//Array List
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("sumu");
		
		//for each loop
		
		for (String value : names)
		{
			System.out.println(value);
		}
		
		
	}

}
