import java.util.*;
import java.io.*;
public class CreateHashMap{
public static void main(String[] arg) throws IOException{
 	Map<String,ArrayList<String>> hashed_dict = new HashMap<String,ArrayList<String>>(); 
	File file = new File("./words_alpha.txt"); 
	Scanner fscan = new Scanner(file); 
            while(fscan.hasNext()){ 
                String word = fscan.next(); 
		String hash = sort_hash(word);
		if (word.length()<13){
	       	    if(hashed_dict.containsKey(hash)){
		        hashed_dict.get(hash).add(word);
		    }
		    else {
			ArrayList<String> list = new ArrayList<String>();
			list.add(word);
			hashed_dict.put(hash,list);
		    }
		}	
	}             
	for(String hash: hashed_dict.keySet()){
	    System.out.print(hash+",");
	    for( String word : hashed_dict.get(hash)){
	    	System.out.print(word+",");
	    }
	    System.out.println();
	}
}
public static String sort_hash(String w){
	char[] carray = w.toCharArray();
	Arrays.sort(carray);
	String hash = new String(carray);
	return hash;
}	
}
