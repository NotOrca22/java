public class Main {
    public static double calcInchAndFeetToCentimeter(double feet, double inches) {
        if (feet<0|inches<0|inches>12) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54 + (inches) * 2.54;
        return centimeters;
    }
    public static void main(String[] args) {
        for (int i = 1; i<6; i++) {
            System.out.println("This is iteration " + i + ".");
        }
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        int i = calculateScore(true, 1000, 1000, 1000);
        System.out.println(i);
        double cm = calcInchAndFeetToCentimeter(5,-10);
        System.out.println(cm);
        String x = getDurationString(75, 3);
        System.out.println(x);
        int value = 3;
        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3,4, or 5");
                break;
            default:
                System.out.println("Value was 3");
                break;
        }
        String month = "jAnUaRy";
        switch(month) {
            case "january":
                System.out.println("yes");
                break;
            default:
                System.out.println("no");
                break;
        }
        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000) {
////            return 1;
////        } else if(playerScore >= 500) {
////            return 2;
////        } else if(playerScore >= 100) {
////            return 3;
////        }
////
////        return 4;
        int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
    public static String calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, String username) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return Integer.toString(finalScore);
        }

        return "-1";
    }
    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " +remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
    int value = 3;
}
