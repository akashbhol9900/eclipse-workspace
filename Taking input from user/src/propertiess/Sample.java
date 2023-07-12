package propertiess;
import java.util.Properties;
import java.io.*;

public class Sample {

	public static void main(String[] args) throws IOException{ 
		// TODO Auto-generated method stub
	Properties propertiesa=new Properties();
	FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\Taking input from user\\src\\propertiess\\abc.properties");
	//Properties properties2 = new Properties();
	propertiesa.load(fis);	
	String name=propertiesa.getProperty("name");
	String rname=propertiesa.getProperty("rname");
	String address=propertiesa.getProperty("address");
	System.out.println(name+"\t"+address+"\t"+rname);
	}

}
