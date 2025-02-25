public class Main
{
	public static void main(String[] args) {
		String s=".,khushi praja,pati";
		String regex=".,";
		System.out.print(replace(s,regex));
		
	}
	public  static String replace (String s, String regex){
	    return s.replaceAll(regex,"");
	}
	
}
