public class Reduce {
    static int counter = 0;
    public static void main(String[] args) {
        int i = 100;
        while (i != 0) {

            i = reduceFizz(i);

        }
        System.out.println(counter);

    }

    static int reduceFizz(int i) {
        boolean even = i % 2 == 0;

        if (even) {

            i = i / 2;

        }else{

            i -= 1;

        }
        counter++;
        return i;
    }
}
