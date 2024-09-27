package application;
import java.util.Scanner;
import java.util.Locale;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new  Scanner(System.in);
	    
	   
	    System.out.println("Insira o tamanho do primeiro segmento do triângulo: ");
	    Double angA = sc.nextDouble();
	    
	    
        System.out.println("Insira o tamanho do segundo segmento do triângulo: ");
        Double angB = sc.nextDouble();
        
        
        System.out.println("Insira o tamanho do terceiro segmento do triângulo: ");
        Double angC = sc.nextDouble();
        
        if(angA > angC + angB || angB > angC + angA || angC > angA + angB ){
            System.out.println("Não foi possivel criar o triângulo!");
            return;
        }else {
            System.out.println("triângulo criado com sucesso! ");
            
        }
        
        if(angA == angC && angC == angB ){
            System.out.println("triângulo equilátero");
            
        }else if(angA == angC && angA != angC|| angA == angB && angA != angC || angC == angB && angC != angA ){
            System.out.println("triângulo isoceles");
        }else if(angA != angC && angA != angB){
            System.out.println("triangulo escaleno");
        }else{
            System.out.println("");
        }
        
		sc.close();	
	}
}
