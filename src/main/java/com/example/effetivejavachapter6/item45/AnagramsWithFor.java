package com.example.effetivejavachapter6.item45;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class AnagramsWithFor {
    public static void main(String[] args) throws IOException {

        Path dictionary = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                Set<String> dic = groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>());
                dic.add(word);
            }
        }

        for (Set<String> group : groups.values()) {
            if (groups.size() >= minGroupSize) {
                System.out.println(groups.size() + ": " + group);
            }
        }
    }

    public static String alphabetize(String word) {
        char[] a = word.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
