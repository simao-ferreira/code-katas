import java.util.HashMap;

//Source for exercise: https://www.hackerrank.com/challenges/make-it-anagram-mglines/problem


public class MakeItAnagramJava {

    public static int minimumRemovalsToAnagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        int result = 0;
        for (int i : map.values()) {
            result += Math.abs(i);
        }

        return result;
    }

    public static int anotherMinimumRemovalsToAnagram(String a, String b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        a.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) + 1));
        b.chars().forEach(c -> map.put(c, map.getOrDefault(c, 0) - 1));

        return map.values()
                .stream()
                .map(Math::abs)
                .reduce(0, Integer::sum);
    }
}
