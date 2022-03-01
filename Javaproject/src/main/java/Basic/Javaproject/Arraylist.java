package Basic.Javaproject;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array
				String[] names ={"Samiha", "Sumu","Fh", "FS" ,"PS"};
				
				
				//Arraylist Method: add,remove,get,clear,size;
				
				//Array List
				ArrayList<String> namelist = new ArrayList<String>();
				
				System.out.println("Size :" +namelist.size());
				
				namelist.add("sumu");
				namelist.add("sumi");
				namelist.add("beeva");
				
				System.out.println("Size :" +namelist.size());
				
				int i=0;
				 for(i=0; i<namelist.size(); i++)
				 {
					 System.out.println(namelist.get(i));
				 }
				
				//for each loop
				
				//for (String value : namelist)
				{
	//				System.out.println(value);
					
				}
				
				

	}

}
