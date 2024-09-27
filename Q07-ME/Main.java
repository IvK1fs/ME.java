package application;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    
	   System.out.println("insira o preço: ");
	   Double preco = sc.nextDouble();
	   Double descon;
	   
	   if(preco> 100 ){
	       descon = preco *0.1;
	   }else if (preco>= 50 && preco <= 100 ){
	       descon = preco * 0.05;
	   }else{
	   descon = preco - 0;
	    System.out.printf("preço final = R$%.2f", preco);
	    return;
	   }
	   System.out.printf("preço final = R$%.2f", preco - descon);
		sc.close();	
	}
}
