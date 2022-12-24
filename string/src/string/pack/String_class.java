package string.pack;

public class String_class {
	public static void main(String[] args) {
		
		
		String s1="java is  programing language";

		String s2="java Is  Programing Language";
		
		System.out.println(s1.length());
		
	    int l = s1.length();
	    System.out.println(l);
	    
	    System.out.println();
	    
	    char cat = s2.charAt(16);
	    System.out.println(cat);
	    
	    System.out.println();

	    char cat1 = s1.charAt(18);
	    System.out.println(cat1);
	    System.out.println();
	    
	    boolean eql= s1.equals(s2);
	    System.out.println(eql);
	    
	    System.out.println();
	    
	    boolean eql1 = s2.equals(s1);
	    System.out.println(eql1);
	    System.out.println();
	    
	    boolean eqlc = s1.equalsIgnoreCase(s2);
	    System.out.println(eqlc);
	    System.out.println();
	    
	    int indexOf = s1.indexOf('a');
	    System.out.println(indexOf);
	    System.out.println();
	    
	    int indexOf2 = s2.indexOf('L');
	    System.out.println(indexOf2);
	    System.out.println();
	    
	    int lastIndexOf = s1.lastIndexOf('a');
	    System.out.println(lastIndexOf );
	    
	
	   
	    
	    
	    
	}

}
