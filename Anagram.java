import java.io.*;
import java.util.*;
public class Anagram{
public static void main(String[] arg) throws IOException{
	File file = new File("./hashmap");
	Scanner fscan = new Scanner(file);
	HashMap<String,String[]> anagramap = new HashMap<String,String[]>();
	while(fscan.hasNext()){
		String[] line = fscan.nextLine().split(",");
		anagramap.put(line[0],Arrays.copyOfRange(line,1,line.length));
	}
	try {System.out.println(Arrays.toString(anagramap.get(sort_hash(arg[0]))));}
	catch(Exception e) {System.out.println("Enter a jumble as an arguement");}
}
public static String sort_hash(String w){ 
    char[] carray = w.toCharArray();
    Arrays.sort(carray);
    String hash = new String(carray);
    return hash;
}  
}