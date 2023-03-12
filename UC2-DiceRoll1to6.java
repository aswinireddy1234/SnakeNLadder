package snakeandladder;
import java.util.Random;
public class SnakeAndLadderUc2 {
    public static void main(String[] args) {
            int d = 1;
            int playerpos=0;
            Random ran = new Random();
            d = ran.nextInt(6) + 1;
            System.out.println("dice roll is    " + d);

    }
}