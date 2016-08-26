
/**
 * WhileLoop
 * Luis Oliver Juarez 
 */
public class FactCalcRunner
{
   public static void main(String [] args){
       int n1 = 20;
       
       
       FactCalc fc = new FactCalc();
       System.out.println("Number = " + n1);
       System.out.println("The factorial of " + n1 + " is: " + fc.factorial(n1));
       
}
}