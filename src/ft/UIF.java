package ft;

import java.util.Scanner;

public class UIF extends Classone {

	public static void main(String[] args) {

		//System.out.println("MetaTron 5000" );
		//System.out.println("the worlds most powerful psychic A.I. ");
		//System.out.println("===========================");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Ask a question and recieve the truth.");
		 String input = myObj.nextLine();
		 	//int i = input.length();
		 	int r = (int)(Math.random() * 20);
		 	int d = (int)(Math.random() * 10);
		 	//int k = (int)(Math.random() * 7);
		 	
		//System.out.println(r);
		//System.out.println(d);
	
		if (input.equalsIgnoreCase("where can i find a golden ticket")) {
			System.out.println("That would be cheating ");
			System.out.println("and what would a computer do with a lifetime suply of chocolate?");
		}
			//main(args);
		 	C1(r);
		 	Hr(d);
		 	//C2(k);

		 	System.out.println("would you like to ask another question y or n");
		 	String yn = myObj.nextLine();
		 		if (yn.equalsIgnoreCase("y")) {
		 		main(args);
		 		}
		 		if (yn.contentEquals("n"))
		 	
		 	System.out.println("goodbye");
		 		myObj.close();
		 	}
		 
	}

		
	


	
	

		
	

	
	
	

	
		
	
		
	
		
		
	




  

