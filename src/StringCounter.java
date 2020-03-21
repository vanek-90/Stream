import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import static java.util.Arrays.stream;

public class StringCounter {

    //Саму сортировку к сожалению никак не смог сделать через stream

    public static void countSymbol(String s) {
        Map<String, Integer> values = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String t = (s.substring(i, i + 1));
            values.computeIfPresent(t, (k, v) -> v + 1);
            values.putIfAbsent(t, 1);
        }

//изначально делал вывод через цикл, потом сделал через поток. Удалять не стал, чтобы  можно было сравнивать
        /*for (Map.Entry<String, Integer> entry : values.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue() +
                    " Данная величина составляет " + (100 * (entry.getValue()) / s.length()) + "%");
        }*/
        values.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":  " + entry.getValue() +
                " Данная величина составляет " + (100 * (entry.getValue()) / s.length()) + "%"));


    }
}
