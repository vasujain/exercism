class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder response = new StringBuilder();
        for(int i=0; i<words.length; i++) {
            if (words.length > i + 1 && words[i + 1] != null) {
                response.append("For want of a ");
                response.append(words[i]);
                response.append(" the ");
                response.append(words[i+1]);
                response.append(" was lost.\n");
            } else {
                response.append("And all for the want of a ");
                response.append(words[0]);
                response.append(".");
            }
        }
        return response.toString();
    }

}
