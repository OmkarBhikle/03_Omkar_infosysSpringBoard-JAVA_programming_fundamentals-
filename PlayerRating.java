public class PlayerRating {
    public int playerPosition;
    public String playerName;
    public float criticOneRating;
    public float criticTwoRating;
    public float criticThreeRating;
    public float averageRating;
    public char category;

    PlayerRating( String playerName,int playerPosition) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.averageRating = (criticOneRating + criticTwoRating) / 2;
    }

    public void setCategory() {
        if(this.averageRating > 8) {
            this.category = 'A';
        }
        else if(this.averageRating<=8 && this.averageRating>5) {
            this.category = 'B';
        }
        else if(this.averageRating<=5 && this.averageRating>0) {
            this.category = 'C';
        }
        else{
            System.out.println("Please provide valid rating");
        }
    }

    public void display() {
        System.out.println("The player name is " + this.playerName);
        System.out.println("The player position is " + this.playerPosition);
        System.out.println("The player average rating is " + this.averageRating);
        System.out.println("The player category is " + this.category);
    }

    public static void main(String[] args) {
        PlayerRating player = new PlayerRating("Beckham", 1);
        player.calculateAverageRating(9, 9.9f);
        player.setCategory();
        player.display();

        PlayerRating player2 = new PlayerRating("Oscar", 1);
        player2.calculateAverageRating(1, 1,1);
        player2.setCategory();
        player2.display();
    }
}
