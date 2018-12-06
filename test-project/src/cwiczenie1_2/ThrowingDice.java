package cwiczenie1_2;

public class ThrowingDice {
    public int throwing() {
        int a = 1;
        int b = 7;

        /*  y=Math.random()*(b-a); // jest w [0,b-a)
            y=Math.random()*(b-a)+a: //jest w [a,b)
            y=b-Math.random()*(b-a); //jest w (a,b]  */

        int zmienna = (int) (Math.random() * (b - a) + a);
        return zmienna;
    }

    public static void main(String[] args) {
        ThrowingDice throwingDice = new ThrowingDice();

        System.out.println(throwingDice.throwing());
    }
}
