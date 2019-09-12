package com.tonasolution;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args){
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object oriented, platform independant language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic symantics");
        languages.put("Algo", "an algorithmic language ");
        languages.put("Basic", "Begginers all purposes symbolic instructions Code");
        languages.put("Lisp", "Therein lies");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in map");
        } else {
            System.out.println(languages.get("Java"));
            languages.put("Java", "THE COURSE ABOUT JAVA");
            System.out.println(languages.get("Java"));
        }

        System.out.println("=================");
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

        languages.remove("Java");
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }


}
