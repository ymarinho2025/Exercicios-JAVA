public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        int i;

        x = 2;
        y = 0;

        for (i=0; i<x; i++) {
            System.out.println(i + ",");
            y = y + 5;
            System.out.println(y);
        }
    }
}