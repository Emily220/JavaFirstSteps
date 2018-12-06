public class Main {
    public void changeNumber(Number val) {

        val.setNumber(10);
    }

    public static void main(String[] args) {
        Main main = new Main();

        Number value = new Number();
        value.setNumber(5);

        main.changeNumber(value);

        System.out.println(value.getNumber());
        int a = 1;
        int b = 6;
        int zmienna = (int) (Math.random() * (b - a) + a);
        System.out.println(zmienna);
    }
}
