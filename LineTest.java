import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.*;

class LineTest
{
	public static void main(String args[]) throws IOException
	{
		HashMap grpMap = new HashMap();
                grpMap.put("1", "ME");
                grpMap.put("2", "PROJECTS");
                grpMap.put("4", "FRAMEWORK");
                grpMap.put("5", "ZOHO");
                grpMap.put("6", "SWISSSQL");
                grpMap.put("10", "WEBNMS");
                grpMap.put("13", "VTITAN");
                grpMap.put("15", "IPHONE");
                grpMap.put("16", "ANDROID");
                grpMap.put("17", "OPENSOURCE");
                Set set = grpMap.entrySet();
                Iterator it = set.iterator();
                while(it.hasNext()){
                        Map.Entry me = (Map.Entry)it.next();
                        System.out.println(me);
                }

	}
}
