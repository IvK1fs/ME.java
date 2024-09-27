package application;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    
	   System.out.println("digite um valor dentro do intervalo {10,20}: ");
	   Double num = sc.nextDouble();
	   
	   
	   if(num >=15 && num <= 20){
	       System.out.println("dentro do intervalo");
	   }else{
	       System.out.println("fora do intervalo");
	   }
		sc.close();	
	}
}
