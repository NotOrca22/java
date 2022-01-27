public class InterestCalc {
    public static double calcInterest(long original,double rate) {
        return original + (original*(rate/100));
    }
    public static void main(String[] args) {
        double money = calcInterest(10000, 2.4);
        System.out.println(money);
        for (int i=1;i<11; i++) {
            System.out.println("With " + i + " percent interest, 10,000 dollars would cost " + calcInterest(10000, i) + " dollars.");
        }
    }
}
