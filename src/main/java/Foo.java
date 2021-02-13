public class Foo {

    public static void main(String[] args) {
        //System.out.println("Hello Git");
        //System.out.println("Hello Git");
        int sum = 1;
        for (int i = 1; i<=5;i++){ // w tej pętli liczona jest silnia
            sum = sum*i;
        }
        int rez = 1;
        for (int i =1; i<=4; i++){
            rez = rez *4;
        }
        System.out.println(rez);
    }
}
