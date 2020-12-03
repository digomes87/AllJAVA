package metodos.java;

public class Main {
    public static boolean gameOver = true;
    public static int score = 800;
    public static int levelCompleted = 5;
    public static int bonus = 100;
    public static String msgScore = "Tua Pontuaçao final foi: ";

    public static void main(String[] args) {
        calculateScore();
	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;


	    if(gameOver){
	        int finalScore = score + (levelCompleted * bonus);
	        System.out.println(msgScore + finalScore);
        }
    }


    public static void calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            System.out.println(msgScore + finalScore);
        }
    }


}
