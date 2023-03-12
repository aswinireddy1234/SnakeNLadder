package snakeandladder;
import java.util.Random;
public class SnakeNLadder {
    public static void main(String[] args) {
        int diceroll;
        int playerpos = 0;
        int dicecount = 0;
        while (playerpos != 100) {
            System.out.println("This a 2 player game initially both are at zero ");
            int option1, option2;
            int diceroll = 0;
            int countdiceroll = 0;
            int player1pos = 0;
            int player2place = 0;
            while (player1pos != 100 || player2place != 100) {
                System.out.println("\nPLAYER 1 CHANCE");
                Random ran = new Random();
                diceroll = ran.nextInt(6) + 1;
                dicecount++;
                countdiceroll++;
                System.out.println("random diceroll is     " + diceroll);
                int options = 0;
                Random randomoption = new Random();
                options = randomoption.nextInt(2) + 1;
                System.out.println("option chosen by player is " + options);
            if(options==0) {
                Random randomoption2 = new Random();
            }
            option1 = randomoption2.nextInt(3);
                System.out.println("option chosen by player1 is " + option1);
                if (option1 == 0) {
                System.out.println(" No Play ");
                }
                if (options == 1) {
                    System.out.println("Ladder ");
                    playerpos = playerpos + diceroll;
                    System.out.println("current playerposition " + playerpos);
                    if (playerpos > 100) {
                        if (option1 == 1) {
                            System.out.println("Ladder  ");
                            player1pos = player1pos + diceroll;
                            System.out.println("current player1position " + player1pos);
                            if (player1pos > 100) {
                                System.out.println("Player can not cross 100 ");
                                playerpos = playerpos - diceroll;
                                System.out.println("So player will remain at previous position which is " + playerpos);
                            } else if (playerpos == 100) {
                                    System.out.println("u win");
                                    player1pos = player1pos - diceroll;
                                    System.out.println("So player will remain at previous position which is " + player1pos);
                            } else if (player1pos == 100) {
                                    System.out.println("player 1 win");
                                    break;
                            }
                        }
                        if (options == 2) {
                            if (option1 == 2) {
                                System.out.println(" Snake  ");
                                playerpos = playerpos - diceroll;
                                System.out.println("current playerposition " + playerpos);
                                if (playerpos < 0) {
                                    playerpos = playerpos + diceroll;
                                    System.out.println(" actual current playerposition is " + playerpos);
                                    player1pos = player1pos - diceroll;
                                    System.out.println("current player1position " + player1pos);
                                    if (player1pos < 0) {
                                        player1pos = player1pos + diceroll;
                                            System.out.println("Player will restart so actual current player1position is " + player1pos);
                                    }
                                }

                                System.out.println("\nPLAYER 2 CHANCE");
                                Random ra = new Random();
                                diceroll = ra.nextInt(6) + 1;
                                countdiceroll++;
                                System.out.println("random diceroll is     " + diceroll);
                                Random randomoptionp2n = new Random();
                                option2 = randomoptionp2n.nextInt(2) + 1;
                                System.out.println("option chosen by player 2 is " + option2);
                                if (option2 == 0) {
                                    System.out.println("No Play");
                                }
                                if (option2 == 1) {
                                    System.out.println("Ladder");
                                    player2place = player2place + diceroll;
                                    System.out.println("current player2position " + player2place);
                                    if (player2place > 100) {
                                        System.out.println("Player can not cross 100 ");
                                        player2place = player2place - diceroll;
                                        System.out.println("So player will remain at previous position which is " + player2place);
                                    } else if (player2place == 100) {
                                            System.out.println("player2 win");
                                            break;
                                    }
                                }
                                    if (option2 == 2) {
                                        System.out.println(" Snake  ");
                                        player2place = player2place - diceroll;
                                        System.out.println("current player2position " + player2place);
                                        if (player2place < 0) {
                                            player2place = player2place + diceroll;
                                            System.out.println("Player 2 will restart so actual current player2position is " + player2place);
                                        }
                                    }
                                }
                            System.out.println("The total dice count is  " + dicecount);
                            System.out.println("Total dice roll is " + countdiceroll);
                        }
                    }
                }
            }
        }
    }
}