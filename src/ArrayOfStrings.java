import java.util.*;

public class ArrayOfStrings {

    private static final String[] words = {
            "R2D2", "DarthVader", "Jabba", "Yoda", "Kenobi", "Luke", "HanSolo", "Leia", "Luke", "R2D2",
            "R2D2", "Yoda", "R2D2", "Yoda", "Luke", "Yoda", "Luke", "Yoda", "Luke", "Leia",
    };

    public static void Task1a() {
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
    }

    public static void Task1b() {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
