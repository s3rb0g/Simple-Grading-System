import java.util.Scanner;
public class Grades {

    static double scr1 = 0.0;
    static double scr2 = 0.0;
    static double scr3 = 0.0;
    static double scr4 = 0.0;
    static double scr5 = 0.0;
    static double total = 0.0;
    static double total2 = 0.0;
    static double fTotal = 0.0;
    
	
    public static void main(String args[]) {
    	Scanner xd = new Scanner(System.in);
    	
 
do{
 	    	
    System.out.println(" ");
    System.out.println("Grading System");
    System.out.println("==============");
    System.out.println("[1] - Compute Grades");
    System.out.println("[2] - Exit");
    System.out.println(" ");
    System.out.print("Option : ");
    int pick = xd.nextInt();
    System.out.println(" ");
    
   
    if(pick == 1){
    	
    	System.out.print("Student Number : ");
    	int num = xd.nextInt(); 
    	System.out.print("Student Name : ");
    	String name = xd.next();
    	
    	System.out.print("Number of Scores to input : ");
    	int choose = xd.nextInt();
    	 
    	if (choose == 1){ 	
    		System.out.print("Enter Quizzes Scores : ");
    		scr1 = xd.nextDouble();
    		Grade grd1 = new Grade(scr1);
    	
    		System.out.println(" ");
    		System.out.println("Result :");
    		System.out.println("Student Number : " + num);
    		System.out.println("Name : " + name);
    		System.out.println("Average : " + grd1.getAverage1());
    	 }
    	else if(choose == 2){
    		System.out.print("Enter Quizzes Scores : ");
    		scr1 = xd.nextDouble();
    		scr2 = xd.nextDouble();
    		Grade grd2 = new Grade(scr1, scr2);	
    	
    		System.out.println(" ");
    		System.out.println("Result :");
    		System.out.println("Student Number : " + num);
    		System.out.println("Name : " + name);
    		System.out.println("Average : " + grd2.getAverage2());
    	}
    	else if(choose == 3){
    		System.out.print("Enter Quizzes Scores : ");
    		scr1 = xd.nextDouble();
    		scr2 = xd.nextDouble();	
    		scr3 = xd.nextDouble();
    		Grade grd3 = new Grade(scr1, scr2, scr3);
    	
    		System.out.println(" ");
    		System.out.println("Result :");
    		System.out.println("Student Number : " + num);
    		System.out.println("Name : " + name);
    		System.out.println("Average : " + grd3.getAverage3());
    	}
    	else if(choose == 4){
    		System.out.print("Enter Quizzes Scores : ");
    		scr1 = xd.nextDouble();
    		scr2 = xd.nextDouble();	
    		scr3 = xd.nextDouble();	
    		scr4 = xd.nextDouble();
    		Grade grd4 = new Grade(scr1, scr2, scr3, scr4);
    	
    		System.out.println(" ");
    		System.out.println("Result :");
    		System.out.println("Student Number : " + num);
    		System.out.println("Name : " + name);
    		System.out.println("Average : " + grd4.getAverage4());
    	}
    	else if(choose == 5){
    		System.out.print("Enter Quizzes Scores : ");
    		scr1 = xd.nextDouble();
    		scr2 = xd.nextDouble();	
    		scr3 = xd.nextDouble();	
    		scr4 = xd.nextDouble();	
    		scr5 = xd.nextDouble();	
    		Grade grd5 = new Grade(scr1, scr2, scr3, scr4, scr5);
    	
    		System.out.println(" ");
    		System.out.println("Result :");
    		System.out.println("Student Number : " + num);
    		System.out.println("Name : " + name);
    		System.out.println("Average : " + grd5.getAverage5());
    	}
    	else{
    		System.out.println("1 to 5 only");
    	}
  	
    }
    else if(pick == 2){
		System.out.println(" ");
    	System.out.println("Thank you! Done");
    	System.exit(0);
    }
    else{
    	System.out.println("Invalid input!");
    }   
    	

}while(true);    
 
    	
    	
    }
 
    
    
}