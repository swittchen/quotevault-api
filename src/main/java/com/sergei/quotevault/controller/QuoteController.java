package com.sergei.quotevault.controller;

import com.sergei.quotevault.entity.Quote;
import com.sergei.quotevault.repository.QuoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private final QuoteRepository repo;

    public QuoteController(QuoteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        List<Quote> all = repo.findAll();
        return all.get(new Random().nextInt(all.size()));
    }

    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
        return repo.save(quote);
    }
}
