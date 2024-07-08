public class Grade extends Grades{

	Grade(){
	}
	
   Grade(double scr1){
   	this.scr1 = scr1;
   }
   
   Grade(double scr1, double scr2){
   	this.scr1 = scr1;
   	this.scr2 = scr2;
   }
   
   Grade(double scr1, double scr2, double scr3){
   	this.scr1 = scr1;
   	this.scr2 = scr2;
   	this.scr3 = scr3;
   	
   }
   
   Grade(double scr1, double scr2, double scr3, double scr4){
   	this.scr1 = scr1;
   	this.scr2 = scr2;
   	this.scr3 = scr3;
   	this.scr4 = scr4;
   }
   
   Grade(double scr1, double scr2, double scr3, double scr4, double scr5){
   	this.scr1 = scr1;
   	this.scr2 = scr2;
   	this.scr3 = scr3;
   	this.scr4 = scr4;
   	this.scr5 = scr5;
   	
   }
    
    public double getAverage1(){
   	total = scr1;
   	total2 = total / 1;
   	fTotal = Math.round(total2 *100)/100.0;
 
   	return fTotal;
   }
   
   public double getAverage2(){
   	total = scr1 + scr2;
   	total2 = total / 2;
   	fTotal = Math.round(total2 *100)/100.0;
 
   	return fTotal;
   }
   public double getAverage3(){
   	total = scr1 + scr2 + scr3;
   	total2 = total / 3;
   	fTotal = Math.round(total2 *100)/100.0;
 
   	return fTotal;
   }
    public double getAverage4(){
   	total = scr1 + scr2 + scr3 + scr4;
   	total2 = total / 4;
   	fTotal = Math.round(total2 *100)/100.0;
 
   	return fTotal;
   }
   public double getAverage5(){
   	total = scr1 + scr2 + scr3 + scr4 + scr5;
   	total2 = total / 5;
 	fTotal = Math.round(total2 *100)/100.0;
 		
   	return fTotal;
   }
}