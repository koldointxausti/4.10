
public class Word implements CharSequence{
	private String word = "";
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word=word;
	}
	
	public char charAt(int arg0) {
		return word.charAt(arg0);
	}

	public int length() {
		return word.length();
	}

	public CharSequence subSequence(int arg0, int arg1) {
		return word.subSequence(arg0, arg1);
	}
	
	public String toString() {
		return word.toString();
	}
	
}
