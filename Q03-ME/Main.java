package application
  import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Insira o valor da casa: ");
		Double valorCasa = sc.nextDouble();
		
		
		System.out.println("Insira o seu salário: ");
		Double salario = sc.nextDouble();
       
       System.out.println("em quantos anos você vai pagar: ");
        int Anos = sc.nextInt();
        
        Double prestacaoMensal = valorCasa / (Anos * 12);
        
        if(prestacaoMensal >= salario* 0.3){
            System.out.println("Emprestimo Negado!");
        }else {
            System.out.println("Emprestimo aprovado! ");
        }
		sc.close();	
	}
}
