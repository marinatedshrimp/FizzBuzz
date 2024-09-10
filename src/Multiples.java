public class Multiples {

    static int counter = 0;
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {

            i = countFizz(i);

        }
        System.out.println(counter);

    }

    static int countFizz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 || divisibleBy5) {

            counter++;

        }
        i++;
        return i;
    }

}

//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

