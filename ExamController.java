package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {

    @GetMapping("/")
    public String home() {
        return "Online Exam System is Running!";
    }

    @GetMapping("/exam")
    public String exam() {
        return "Q1: Capital of India? A) Mumbai B) Delhi C) Chennai";
    }

    @GetMapping("/result")
    public String result(@RequestParam int score) {
        if (score == 3) return "Excellent!";
        else if (score >= 2) return "Good Job!";
        else return "Try Again!";
    }
}