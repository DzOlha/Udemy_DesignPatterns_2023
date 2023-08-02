package structural.flyweight.codeFlyweightTask;

import structural.flyweight.codeFlyweightTask.flyweight.WordToken;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<WordToken> tokens = new ArrayList<>();

    public Sentence(String plainText) {
        String[] words = plainText.split(" ");
        for (int i = 0; i < words.length; i++) {
            tokens.add(new WordToken(words[i], i));
        }
    }

    public WordToken getWord(int index) {
        return tokens.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = tokens.size();
        for (int i = 0; i < size; ++i) {
            WordToken token = tokens.get(i);
            for (int j = 0; j < token.word.length(); j++) {
                Character c = token.word.charAt(j);
                if (token.capitalize) {
                    c = Character.toUpperCase(c);
                }
                sb.append(c);
            }
            if (i != size - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
