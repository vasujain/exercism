import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class ProteinTranslator {
    static int CODON_LENGTH = 3;
    static HashMap<String, String> proteinMap = new HashMap<>();
    static {
        proteinMap.put("AUG", "Methionine");
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        proteinMap.put("UGG", "Tryptophan");
        proteinMap.put("UAA", "STOP");
        proteinMap.put("UAG", "STOP");
        proteinMap.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        for(int i=0; i<rnaSequence.length(); i+=CODON_LENGTH) {
            String codon = rnaSequence.substring(i, i + CODON_LENGTH);
            if(proteinMap.get(codon).equals("STOP")) {
                return proteins;
            } else {
                proteins.add(proteinMap.get(codon));
            }
        }
        return proteins;
    }
}