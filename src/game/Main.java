package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Dealer dealer = new Dealer();


        Game game = new Game();
        game.addPlayerToGame(player);
        game.addPlayerToGame(dealer);

        Koloda koloda = new Koloda();
        System.out.println(koloda.getRandomCart());
    }
}
