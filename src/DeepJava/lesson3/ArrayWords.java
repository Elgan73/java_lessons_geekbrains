package DeepJava.lesson3;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ArrayWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("word");
        words.add("word");
        words.add("word");
        words.add("word");
        words.add("lake");
        words.add("lake");
        words.add("somebody");
        words.add("somebody");
        words.add("he");
        words.add("he");
        words.add("she");
        words.add("none");
        words.add("none");


        TreeMap<String, Integer> map = new TreeMap<>();
        for (String i : words ) {
            if (!words.isEmpty()) {
                map.put(i, map.getOrDefault(i, 0) +1);
            }
        }

        //Вывод уникальных слов
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    if (entry.getValue() < 2 ) {
                        System.out.println(entry.getKey());
                    }
                });
        //Вывод кол-ва слов в массиве
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }
}
