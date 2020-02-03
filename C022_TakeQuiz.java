import java.util.Scanner;


public class C022_TakeQuiz {
    static final int NUM_OF_QUESTIONS = 10;
    static int[] firstNumbers = new int[NUM_OF_QUESTIONS];
    static int[] secondNumbers = new int[NUM_OF_QUESTIONS];
    static int[] correctResults = new int[NUM_OF_QUESTIONS];
    static int[] collectedAnswers = new int[NUM_OF_QUESTIONS];


    public static void createQuestions(){
        for (int i=0; i<NUM_OF_QUESTIONS; i++) {

            Scanner scanner = new Scanner(System.in);

            firstNumbers[i] = (int)(10*Math.random());
            secondNumbers[i] = (int)(10*Math.random());
            correctResults[i] = firstNumbers[i] + secondNumbers[i];

            System.out.print("What is " + firstNumbers[i] + " + " + secondNumbers[i] + " = ");
            collectedAnswers[i] = scanner.nextInt();
        }
    }


    public static int gradeQuiz() {
        int score = 10;
        int totalPoints = 0;
        System.out.println("Your answers were: ");
        for (int i=0; i<NUM_OF_QUESTIONS; i++) {
            System.out.print( "Q" + i + ": You answered " + collectedAnswers[i] + ";");
            if (collectedAnswers[i] == correctResults[i]) {
                System.out.println(" Your answer was correct!");
                totalPoints = totalPoints + score;
            } else {
                System.out.println(" Your answer was wrong. The correct answer is " + firstNumbers[i] + " + " + secondNumbers[i] + " = " + correctResults[i]);
            }
        }
        return totalPoints;
    }


    public static void main(String[] args) {
        int totalPoints = 0;
        createQuestions();
        totalPoints = gradeQuiz();
        System.out.println("You total score in this quiz is " + totalPoints + " / 100 points");
    }
}