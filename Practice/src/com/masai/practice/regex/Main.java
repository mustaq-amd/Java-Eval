package com.masai.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("ab");
        Matcher matcher=pattern.matcher("abababbaba");
    }
}
