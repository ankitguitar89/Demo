package FileReader;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class readXML {
public static void main(String args[]) throws Exception
{
	File f=new File(".\\DataFiles");
	File[] fileArray= f.listFiles();
	for(int i=0;i<fileArray.length; i++)	
	{
		System.out.println(fileArray[i].getName());
	}
	String fileName="Data3.xml";
	DocumentBuilderFactory builderFactory= DocumentBuilderFactory.newInstance();
	
	DocumentBuilder builder= builderFactory.newDocumentBuilder();
	System.out.println(f+"\\"+fileName);
	Document document=builder.parse(f+"\\"+fileName);
	System.out.println("Root element :" + document.getDocumentElement().getNodeName());
	
	//System.out.println(document.getDocumentElement());
}
}