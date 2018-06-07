class Hamming {

        private String leftStrand, rightStrand;
    int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if(leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance() {
        hammingDistance = 0;
        for(int i=0; i<leftStrand.length(); i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
        }
        return hammingDistance;
    }
}