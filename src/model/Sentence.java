package model;

public class Sentence {
    private String word;

    public Sentence() {
    }

    public Sentence(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "word='" + word + '\'' +
                '}';
    }
}
