class NaturalNumber {
    int number;

    NaturalNumber(int number) {
        if(number < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        this.number = number;
    }

    Classification getClassification() {
        if(number == 1) return Classification.DEFICIENT;
        if(getAliquotSum(number) == number) return Classification.PERFECT;
        if(getAliquotSum(number) < number) return Classification.DEFICIENT;
        return Classification.ABUNDANT; //if(getAliquotSum(this.number) > this.number)
    }

        int getAliquotSum(int number) {
            int sum = 0;
            for(int i=1; i<=number/2; i++) {
                if(number%i==0) sum+= i;
            }
            System.out.println(sum);
            return sum;
        }

}
