class ReverseString {

    String reverse(String inputString) {
        int inputLength = inputString.length();
        if(inputLength <=1) return inputString;
        char[] strArray = inputString.toCharArray();
        char temp;
        for(int i=0; i<inputLength/2; i++) {
            temp = strArray[i];
            strArray[i] = strArray[inputLength-i-1];
            strArray[inputLength-i-1] = temp;
        }
        return new String(strArray);
    }
  
}