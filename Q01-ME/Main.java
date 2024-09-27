package application
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o seu nome:");
		
		String nomeFuncionario = sc.next();
		
		
		System.out.println("Insira o seu salário:");
		
		double salario = sc.nextDouble();
		
		
		System.out.println("Insira o tempo de trabalho em anos:");
		
		int anosTrabalhados = sc.nextInt();
		
		double reajuste;
		
		if(anosTrabalhados <=3 ){
		    
		    reajuste = salario * 0.03;
		    
		}else if( anosTrabalhados >3 && anosTrabalhados <= 10){
		    
		    reajuste = salario * 0.125;
		    
		}else {
		    reajuste = salario * 0.2 ;
		}
		
	System.out.printf("%s seu novo salário é igual a R$%.2f",nomeFuncionario, salario + reajuste);
		
			
	}
}
