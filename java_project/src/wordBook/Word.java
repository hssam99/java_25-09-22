package wordBook;

import java.util.ArrayList;
import java.util.List;

public class Word {

	private String word;
	private List<String> mean = new ArrayList<>();

	public Word() {
	}

	public Word(String word) {
		this.word = word;
	}

	public Word(String word, List<String> list) {
		this.word = word;
		this.mean = list;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<String> getMean() {
		return mean;
	}

	public void setMean(List<String> mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", mean=" + mean + "]";
	}

}
