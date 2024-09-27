package application
  import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("coloque o numero que você acho que sair: ");
		Random random = new Random();
		
		 int number = random.nextInt(5) + 1 ;
		 
       int numeroFo = sc.nextInt();
       if(numeroFo == number){
           System.out.printf("%d = %d parabéns!",number, numeroFo);
           
       }else {
           System.out.printf("%d ≠ %d", numeroFo, number);
       }
       
        
        
		sc.close();	
	}
}
