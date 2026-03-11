import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	method1();
    	
    	System.out.println("Fim do programa");
    }
    
    public static void method1() {
    	System.out.println("***METODO 1 COMEÇOU***");
    	method2();
    	System.out.println("***METODO 1 ENCERROU***");
    }
    
    public static void method2() {
    	System.out.println("***METODO 2 COMEÇOU***");
		Scanner sc = new Scanner(System.in);

    	try {
        	System.out.println("Digite varios nomes: ");
        	String[] vect = sc.nextLine().split(" ");
        	System.out.println("Digite o numero da posição: ");
        	int position = sc.nextInt();
        	System.out.println(vect[(position)]);
    	}
    	catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Posição invalida!");
    		e.printStackTrace();
    	}
    	catch (InputMismatchException e) {
    		System.out.println("Apenas aceitamos numeros inteiros!");
    	}
    	sc.close();
	}
}
