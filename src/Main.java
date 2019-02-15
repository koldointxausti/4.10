import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Word word = new Word();
		word.setWord("hello");
		boolean repeat = true;
		while(repeat) {
			System.out.println("What do you want to do?\n\n"
					+ "\t[1] Change the word\n"
					+ "\t[2] Show the word\n"
					+ "\t[3] Show the length of the word\n"
					+ "\t[4] Show me a caracter in a position\n"
					+ "\t[5] Show me the caracter between two positions\n"
					+ "\t[0] Exit");
			String option = sc.next();
			sc.nextLine();
			switch(option){
			default:
				System.out.println("Enter a possible option");
				break;
			case "0":
				System.out.println("Bye!");
				repeat = false;
				break;
			case "1":
				System.out.println("Enter the word you want:");
				word.setWord(sc.next());
				sc.nextLine();
				break;
			case "2":
				System.out.println("The word is: "+word.toString());
				break;
			case "3":
				System.out.println("The length of the word is: "+word.length());
				break;
			case "4":
				System.out.println("Which position is the character you want in?");
				int position = sc.nextInt();
				System.out.println("The character in the position "+position+" is: "+word.charAt(position));
				break;
			case "5":
				System.out.println("In which position do the characters you want start?");
				int position1 = sc.nextInt();
				System.out.println("In which position do the characters you want finish?");
				int position2 = sc.nextInt();
				System.out.println("The characters between "+position1+" and "+position2+" are: "+word.subSequence(position1, position2));
				break;
			}
		}
		sc.close();
	}
}
