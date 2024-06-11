package com.assertiva.challenge.pluralizador_api.entities;

public class Rules {

    public boolean endsWithVocal (String word) {
        char letter = word.charAt(word.length() - 1);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public boolean endsWithS_X (String word) {
        char letter = word.charAt(word.length() - 1);
        return letter == 's' || letter == 'x';
    }

    public boolean endsWithZ (String word) {
        char letter = word.charAt(word.length() - 1);
        return letter == 'z';
    }

    public String applyRuleOne (String word) {
        return word.concat("s");
    }

    public String applyRuleThree (String word) {
        return word.substring(0, word.length() - 1).concat("ces");
    }

    public String applyRuleFour (String word) {
        return word.concat("es");
    }
}
