package com.sergei.quotevault.repository;

import com.sergei.quotevault.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository  extends JpaRepository<Quote, Long> {
}
