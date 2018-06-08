class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replace("-", "");
        if(stringToVerify.length() != 10 || stringToVerify.length()==0) return false;;
        int sum = 0;
        for(int i=0; i<stringToVerify.length(); i++) {
            if(!Character.isDigit(stringToVerify.charAt(i)) && stringToVerify.charAt(i) != 'X') {
                return false;
            }
            int current = Character.getNumericValue(stringToVerify.charAt(i));
            if(stringToVerify.charAt(i) == 'X') {
                if(i!=stringToVerify.length()-1) {
                    return false;
                }
                current =  10;
            }

            sum += (10 - i) * current;
        }
        return sum%11 == 0;
    }

}
