package demo2;

public class Main {
    public static void main(String[] args) {
        sumable jami = (int x, int y) -> x + y;
        System.out.println(jami.sum(4, 4));

	System.out.println(jami.sum(3, 2));

	System.out.println(jami.sum(7, 8));	
    }
}
