package pragrams;

public class Prefix
{

	public static void main(String[] args) {
		String s = "india";
	    String s2 = "indaus";
	    String small,large;
	     if(s.length() > s2.length()) 
	        {small = s2;large = s;}
	      else
	        {small = s;large = s2;}
	    int index = 0;    
	    for(char c: large.toCharArray())
	    {
	        if(index==small.length()) break;
	        if(c != small.charAt(index)) break;
	        index++;
	    }
	    if(index==0)
	      System.out.println(""+s+ " and "+s2+ " have no common prefix");
	    else
	      System.out.println(large.substring(0,index));
	}

}
