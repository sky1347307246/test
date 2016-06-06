import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

 public class leetcode1 {
	 public static void main(String[] args)
	 {
		
		// String strs="2147483648";
		 //2147483647
		 String[] strs={"","abc","bac","ape","and","cat"};
		leetcode1 l=new leetcode1(); 
		System.out.println(l.groupAnagrams(strs));
		 
	 
		
	}
	//1, 11, 21, 1211, 111221, ...
	 
	 public List<List<String>> groupAnagrams(String[] strs) {
		 Arrays.sort(strs);  
	     Map<String, List> map=new ConcurrentHashMap<String, List>();
	    
	     int flag=0;
	     int nullflag=0;
		 for(String str:strs){
			 if(str==""&& flag==0){
				 List n_l=new ArrayList<String>();
				 n_l.add("5");
				 map.put("kong", n_l);
				 flag=1;
			 }else  if((map.size()!=0&& flag==1)||(map.size()==0&&flag==0)){
            	      flag=2;
            	      List l=new ArrayList<String>();
            	      l.add(str);
 					 map.put(str,l );
 				 
                  }else {
            
			 Set<String> tmp=map.keySet();
			 for(String key:tmp){
				//相等，则加入key对应list
				 
				
				 if(str.length()==key.length()){
					 if(str==""&& flag!=0) {
						 List l=new ArrayList<String>();
						 l=map.get(key);
						 l.add(str);
						 
						 map.put(key, l);
						  
					 }
					 outer:
					 for(int i=0;i<str.length(); i++){
						 for(int j=0;j<key.length();j++){
						 if(str.charAt(i)==key.charAt(j)) {
							 if(i==key.length()-1)  {
								 List l=new ArrayList<String>();
								 l=map.get(key);
								 l.add(str);
								 
								 map.put(key, l);
								  
							 } 
						       
							break;
							 
						 }
						 if(str.charAt(i)!=key.charAt(j)&&j==key.length()-1){
								 
							 List l=new ArrayList<String>();
								 
								 
							 l.add(str);
								 
								
							 map.put(str, l);
							 
							 break outer;
							 
							 }
						 }
						 
						  
						
					 }
				 }
				 //不等，新建立list
			else{
				 List l=new ArrayList<String>();
					
					 l.add(str);
					 map.put(str,l );
				 
				 }
			 }		
           
             
                  }	 
	    	 
	    	 
	     }
		 
		 List<List<String>> a=new ArrayList<List<String>>();
		 Set<String> end=map.keySet();
		 for(String m:end){
			 System.out.println(map.get(m));
			 a.add(map.get(m));
		 }
		 return a;
	    }
	 
	 
		  
	}

 
