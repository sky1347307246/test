
public class leetcode2 {

	public static void main(String[] args) {
	 

		String[] strs={"a"};
		leetcode2 l=new leetcode2();
		System.out.println(l.longestCommonPrefix(strs));
		
	}
	public String longestCommonPrefix(String[] strs) {
		  if(strs.length!=0){
	            String str_short=strs[0];
		        String result="";
		      
		       for(int i=0;i<strs.length;i++){
		           if(str_short.length()>strs[i].length()){
		        	   str_short=strs[i];
		        			   }
		           
		           }
		       String com=new String("");
		       int num=str_short.length()+1;int c=0;
		       for(int i=1;i<num;i++){
		    	   String tmp=str_short.substring(0,i);
		    	   for(String str:strs){
		    		   if(str.startsWith(tmp)==false){
		    			   result="";
		    			   break;
		    			   
		    		   }
		    		   result=tmp;
		    	   }
		    	   if(result!=""){		    		   
		    		   com =result;
		    		    
		    	   }
		    	   
		    	   
		       }
		       
		       return com;
	    }	 
	    return "";
     }  
	
	
}
