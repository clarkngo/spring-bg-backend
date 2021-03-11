package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardGameController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/boardgame")
	public BoardGame boardgame(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new BoardGame(counter.incrementAndGet(), String.format(template, name));
	}
}
