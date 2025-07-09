package com.xworz.method;

public class LanguageAnalyzer extends InputProcessor {

    //4. Create a class InputProcessor, which accepts user input. Derive a class LanguageAnalyzer that checks if the input is a question or statement.
    // Then create ResponseGenerator that gives a canned response.
    String text;

    public String questionCheck(String text){
        this.text=text;
        return text;
    }
}
