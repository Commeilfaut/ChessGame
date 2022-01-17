import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
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


    public HashMap<String, Piece>  createPieces() {
        King whiteKing = new King(new Spot("h", 7), "white_king", true );

        King blackKing = new King(new Spot("d", 8), "black_king", false );

        Rook whiteRook1 = new Rook(new Spot("a", 7), "white_rook1", true);

        Rook whiteRook2 = new Rook(new Spot("g", 7), "white_rook2", true);

        Khight blackKhight = new Khight(new Spot("d", 6), "black_khight", false);

        HashMap <String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKhight.getId(), blackKhight);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKhight.getId(), blackKhight);
        return pieceHashMap;
    }
        public void play(ArrayList <Player> players, HashMap<String, Piece>hashMap){
            //move 1
            try {
                players.get(0).movePiece(hashMap.get("white_rook1"), new Spot("a", 8));
            }
            catch (IllegalArgumentException error){
                System.out.println("The move is incorrect, please try again");
                //retry functionality
            }

            players.get(1).movePiece(hashMap.get("black_khight"), new Spot("c", 8));
        }

}