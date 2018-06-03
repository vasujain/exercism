import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 97; i <= 122; i++) {
            hashSet.add((char) i);
        }

        for(char c: input.toCharArray()) {
            c = Character.toLowerCase(c);
            if (hashSet.contains(c)) {
                hashSet.remove(c);
            }
        }
        return hashSet.size() == 0;
    }

}
