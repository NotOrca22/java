public class firstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int myAge = 13;
        System.out.println(myAge - 3);
        int myFirstNumber = (10+5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);
        long bustedInt = 999999999;
        long bustedInt2 = 999999999;
        long longestLong = 9219999999999999999L;
        byte bustedByte1 = -27;
        byte bustedByte2 = -5;
        System.out.println(Float.MAX_VALUE);
//        byte bustedByte3 = bustedByte1 + bustedByte2;
        System.out.println(bustedByte1+bustedByte2);
        System.out.println(bustedInt*99999999);
        char myChar = 'D';
        char myUnicodeCharacter = '\u0044';
        System.out.println(myUnicodeCharacter);
        boolean isOrca = true;
        String numberString = "250.55";
        String lastString = "10";
        int myInt = 50;
        System.out.println(lastString + myInt);
        boolean isNotOrca = false;
        if (isOrca) {
            System.out.println("Orca");
        }
        if (isNotOrca) {
            System.out.println("Not Orca");
        }
        int topScore = 109;
        if (topScore != 100) {
            System.out.println("you got da high score!");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("You win $50!");
        }
        boolean isCar = true;
        if (!isCar) {
            System.out.println("no tengo car");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("yay i have a car");
        }
        double a = 20.00;
        double b = 80.00;
        double product = (a + b) * 100.00;
        double remainder = product % 40.00;
        boolean isZeroRemainder = remainder == 0 ? true : false;
        if (!isZeroRemainder) {
            System.out.println("Got some remainder");
        }
        System.out.println("I" +
                "am" +
                "a" +
                "very" +
                "pog" +
                "orca.");
        int percentOrca = 0;percentOrca++;System.out.println(percentOrca);
        int                                              percentShark                        = 1;
        if(isOrca)System.out.println("soy orca");
        if (isOrca) {
            System.out.println("I am " + percentOrca + " percent orca.");
        }
        calculateScore();
    }
    public static void calculateScore() {
        System.out.println("Score is 1000");
    }
}
