package com.avishek.org;

public class StringReplace {
	
	public String charEncode(int offset, String str){  
	      String result = "";
	      if(offset<0)
	        offset=26+offset;
	      for(int i=0;i<str.length();i++){
	         result+=(char)('a'+(str.charAt(i)-'a'+offset)%26);
	      }
	      return result;
	    }
	
	public String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
	
	public static void main(String[] args) {
		StringBuilder myName = new StringBuilder("avishek");
		myName.setCharAt(3, 'j');
		System.out.println(myName);
		StringReplace strReplace = new StringReplace();
		strReplace.charEncode(1, "avishek");
		strReplace.replace("avishek", -1, 'c');
	}

}
