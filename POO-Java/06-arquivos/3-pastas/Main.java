import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Digite o caminho da pasta: ");
    	String strPath = sc.nextLine();
    	
    	File path = new File(strPath);

    	File[] folders = path.listFiles(File::isDirectory);
    	System.out.println("PASTAS: ");
    	System.out.println();
    	if (folders == null) {
    		System.out.println("Nenhuma pasta encontrada neste diretorio!");
    	}
    	else {
    	for (File folder : folders) {
    		System.out.println(folder);
    	}
    	File[] files = path.listFiles(File::isFile);
    	System.out.println("Arquivos: ");
    	System.out.println();
    	if (files == null) {
    		System.out.println("Nenhum arquivo encontrado neste diretorio!");
    	}
    	else {
    	for (File file : files) {
    		System.out.println(file);
    	}
    }
    	boolean sucess = new File(strPath + "\\subdir").mkdir();
    	System.out.println("Diretorio criado com sucesso: " + sucess);
    	
    	sc.close();	
    }
}
}