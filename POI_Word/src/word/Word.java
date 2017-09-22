package word;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Word {

	public static void main(String[] args)throws Exception{
	  
		//Blank Document
	   XWPFDocument document = new XWPFDocument(); 
	   
	   //Write the Document in file system
	   FileOutputStream out = new FileOutputStream(new File("C:\\Users\\rodrigo.silva\\Desktop\\Logs\\createdocument.docx"));
	   document.write(out);
	   out.close();
	   
	   System.out.println("createdocument.docx written successully");
	   
	  }
}
