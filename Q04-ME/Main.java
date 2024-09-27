package application
  import java.util.Scanner;
import java.util.Locale;
public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("insira o seu peso: ");
	    Double peso = sc.nextDouble();
	    
	   
	    System.out.println("insira a sua altura: ");
	    Double altura = sc.nextDouble();
	    
	    double imcCalc = peso/(altura * altura);
	    
	    if(imcCalc < 18.5)  {
	     System.out.printf("abaixo do peso! imc = %.1f%n",imcCalc);   
	    }else if(imcCalc >= 18.5 && imcCalc < 25){
	        System.out.printf("peso ideal! imc = %.1f%n",imcCalc );
	    }else if(imcCalc >= 25 && imcCalc < 30){
	        System.out.printf("sobrepeso! imc = %.1f", imcCalc);
	    }else if (imcCalc >= 30 && imcCalc < 40 ){
	        System.out.printf("obesidade! imc = %.1f", imcCalc);
	    }else {
	        System.out.printf("obesidade morbida! imc = %.1f", imcCalc);
	    }
	    

		sc.close();	
	}
