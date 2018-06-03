import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');

        char[] dnaArray = dnaStrand.toCharArray();
        for(int i=0; i<dnaArray.length; i++) {
            dnaArray[i] = map.get(dnaArray[i]);
        }
        return String.valueOf(dnaArray);
    }

}
