import java.util.ArrayList;

public class ChessMain {

    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

//        System.out.println(whitePlayer); //toString
//        System.out.println(blackPlayer);

//        try {
//            whitePlayer.setRank(10000);
//        }
//        catch (IllegalArgumentException err){
//            System.out.println("Please update rank to valid");
//        }
//        System.out.println(whitePlayer.getRank());
       // blackPlayer.setRank(-100);


    }

    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@yandex.ru", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

}