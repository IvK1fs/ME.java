package application;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    
	   System.out.println("insira um ano: ");
	   int ano = sc.nextInt();
	   if(ano %4 == 0 && ano %100 != 0 || ano %400 ==0){
	       System.out.println("ano bissexto");
	   }else {
	       System.out.println("ano não bissexto");
	   }
	   
		sc.close();	
	}
}
