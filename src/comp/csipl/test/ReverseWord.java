package comp.csipl.test;

public class ReverseWord {
	public static void main(String[] args) {
		String str="How are you?";
		reverseStringWords(str);
	}
	public static void reverseStringWords(String str) {
		String[] strspl=str.split(" ");
		String string="";
		for (int i = strspl.length-1; i >=0 ; i--) {
			string= string+strspl[i]+" ";
		}
		System.out.println(string.trim().length());
		System.out.println(str.length());
	}

}
