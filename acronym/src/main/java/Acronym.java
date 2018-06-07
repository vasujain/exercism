class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        String[] phraseArr = this.phrase.split("[ -]");
        for(int i=0; i<phraseArr.length; i++) {
            sb.append(phraseArr[i].toUpperCase().charAt(0));
        }
        return sb.toString();
    }
}
