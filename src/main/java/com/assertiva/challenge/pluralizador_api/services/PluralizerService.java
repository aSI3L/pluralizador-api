package com.assertiva.challenge.pluralizador_api.services;

import com.assertiva.challenge.pluralizador_api.entities.PluralizedWords;
import com.assertiva.challenge.pluralizador_api.entities.Rules;
import org.springframework.stereotype.Service;

@Service
public class PluralizerService extends Rules {

    public PluralizedWords pluralizer (String [] words) {
        int[] rules = new int[4];
        PluralizedWords pluralizedWords = new PluralizedWords();

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();

            // Rule 1
            if (endsWithVocal(words[i])) {
                rules[0] += 1;
                words[i] = applyRuleOne(words[i]);
                continue;
            }

            // Rule 2
            if (endsWithS_X(words[i])) {
                rules[1] += 1;
                continue;
            }

            // Rule 3
            if (endsWithZ(words[i])) {
                rules[2] += 1;
                words[i] = applyRuleThree(words[i]);
                continue;
            }

            // Rule 4
            rules[3] += 1;
            words[i] = applyRuleFour(words[i]);
        }

        pluralizedWords.setRules(rules);
        pluralizedWords.setWords(words);

        return pluralizedWords;
    }
}
