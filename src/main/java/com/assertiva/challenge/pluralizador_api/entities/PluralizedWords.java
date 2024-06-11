package com.assertiva.challenge.pluralizador_api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PluralizedWords {
    private String[] words;
    private int[] rules;
}
