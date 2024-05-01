package com.spring.ai.project.genAIApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ai.project.genAIApplication.service.GenAIService;

@RestController
@RequestMapping("/spring-ai")
public class GenAIController {
	
	@Autowired
	GenAIService genAiService;

    @GetMapping("/joke")
    public String getJoke(@RequestParam String topic){
        return genAiService.getJoke(topic);
    }

    @GetMapping("/books")
    public String getBooks(@RequestParam String category, @RequestParam String year){
        return genAiService.getBooks(category, year);
    }

}
