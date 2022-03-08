
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
public class BufferedReaderExample {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
		Map<String,Integer> intList = new HashMap<String,Integer>();
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\EPS_Output.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				
				String numberOnly= sCurrentLine.replaceAll("[^0-9]", "");
				System.out.println(numberOnly);
				
				String exceptionName = sCurrentLine.substring(0,sCurrentLine.indexOf("on")+2);
				System.out.println(exceptionName);
				
				intList.put(exceptionName,Integer.parseInt(numberOnly));
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		//System.out.println(intList);
		//return intList;
 
	}
}