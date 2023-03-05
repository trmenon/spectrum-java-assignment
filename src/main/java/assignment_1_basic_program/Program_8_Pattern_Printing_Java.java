package assignment_1_basic_program;

public class Program_8_Pattern_Printing_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] pattern = new String[5];
		pattern[0] = "JJJJJJJ   A   V     V   A   ";
		pattern[1] = "   J     A A  V     V  A A  ";
		pattern[2] = "   J    A   A  V   V  A   A ";
		pattern[3] = "J  J   AAAAAAA  V V  AAAAAAA";
		pattern[4] = "JJJ    A     A   V   A     A";
		
		for(String str:pattern) {
			System.out.println(str);
		}
	}

}
