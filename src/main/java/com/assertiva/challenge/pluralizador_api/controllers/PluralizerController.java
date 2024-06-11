package com.assertiva.challenge.pluralizador_api.controllers;

import com.assertiva.challenge.pluralizador_api.entities.PluralizedWords;
import com.assertiva.challenge.pluralizador_api.entities.WordsRequest;
import com.assertiva.challenge.pluralizador_api.services.PluralizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pluralizer")
public class PluralizerController {

    @Autowired
    private PluralizerService pluralizerService;

    @PutMapping("")
    public ResponseEntity<PluralizedWords> pluralizer (@RequestBody WordsRequest wordsRequest) {
        String[] words = wordsRequest.getWords();
        return ResponseEntity.status(HttpStatus.OK).body(pluralizerService.pluralizer(words));
    }
}
