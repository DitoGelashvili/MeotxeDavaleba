package demo3;

public class Main {
    public static void main(String[] args) {

    }


    static <SmartPhone extends Smartphone> void showSmartphone(SmartPhone smartphoni) {
        System.out.println(smartphoni);
    }


    static <SimBiani extends Simbian> void showSimbian(SimBiani simbiani) {
        System.out.println(simbiani);
    }
}
