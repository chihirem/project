import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;



public class File1 {

	public static void main(String[] args) throws Exception
	{
		 
		Properties prop = new Properties();
			InputStream input=new FileInputStream("PersonProp.properties");
			prop.load(input);
			System.out.println("First : "+prop.getProperty("first"));
			System.out.println("Last : "+prop.getProperty("last"));
			System.out.println("Gender : "+prop.getProperty("gender"));
			System.out.println("Age : "+prop.getProperty("age"));
			System.out.println("Weight : "+prop.getProperty("weight"));

	}

}
