package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LerArquivoTxt {

	 public static void main(String[] args) throws IOException {
		 
//		    Scanner ler = new Scanner(JOptionPane.showInputDialog("Entre com o caminho do arquivo de texto"));
//		 
//		    System.out.printf("Informe o nome de arquivo texto:\n");
//		   
//		    String nome = ler.nextLine();
//		    
//		    if(nome.matches("^http://www.mprj.mp.br/web/guest/home/-/detalhe-noticia/visualizar/.")){
//		 
//		    System.out.printf("foi " + nome);
//		    }
//		   
//		    System.out.printf("\nConteúdo do arquivo texto:\n");
//		    
//		    try {
//		    
//		      FileReader arq = new FileReader(nome);
//		      BufferedReader lerArq = new BufferedReader(arq);
//		 
		     // String linha = lerArq.readLine(); // lê a primeira linha
		// a variável "linha" recebe o valor "null" quando o processo
		// de repetição atingir o final do arquivo texto
//		      while (linha != null) {
//		        System.out.printf("%s\n", linha);
//		 
//		        linha = lerArq.readLine(); // lê da segunda até a última linha
//		      }
//		 
//		      arq.close();
		    
//		    } catch (IOException e) {
//		        
//		    	System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
//		    }
//		    
//		    
//		    System.out.println();
		 
		 criarArquivotTxt("teste");
		  }
	 
	 public static void criarArquivotTxt(String texto) throws IOException{
		 
		 	Scanner ler = new Scanner(texto);
		    String t = ler.next();
		 	
//		    System.out.printf("Informe o número para a tabuada:\n");
//		    n = ler.nextInt();
		 
		    FileWriter arq = new FileWriter("C:\\Users\\rodrigo.silva\\Desktop\\Logs\\links_javascript_css.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		 
		    gravarArq.printf(t);
		   
		    arq.close();
		 
		    System.out.printf("Sucesso");
		  }
	 
}
	 


