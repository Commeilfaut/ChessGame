public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;


    public Player(String name, String email, boolean white, int rank, int age) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("the name should not be empty");
        }
        else{
            this.name = name;
        }
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("The email address should not be empty");
        }
        if(email.contains("@") == false || email.contains(".") == false){
            throw new IllegalArgumentException("The email address should contain '.' and '@' ");
        }
        else {
            this.email = email;
        }
        this.white = white;
        this.rank = rank;
        if(age < 18){
            throw new IllegalArgumentException("You are under the age of 18");
        }
        else {
            this.age = age;
        }
    }


    public String getName() {return name; }

    public String getEmail() {return email; }

    public boolean isWhite() {return white; }

    public int getRank() {return rank; }

    public int getAge() {return age; }

    public void  setRank(int rank) {
        if(rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("The rank should be in range of 100 and 3000");
        }

        this.rank = rank;
        System.out.println("The rank of " + name + " was changed to " + rank);
    }

    public void movePiece(Piece piece, Spot spot){

        if (isWhite() != piece.isWhite()){
            throw new IllegalArgumentException("incorrect piece color.Try again");
        }
        piece.setSpot(spot);
        System.out.println("Piece" + piece.getName()  + " is moved to: " + spot);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
