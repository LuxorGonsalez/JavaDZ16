import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void fight1() {
        Player player1 = new Player("Darth vader", 10);
        Player player2 = new Player("Obi-Wan Kenobi", 8);


        Game game = new Game();
        game.register(player1);
        game.register(player2);


        int actual = game.round(player1.getName(), player2.getName());
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void fight2() {
        Player player1 = new Player("Darth vader", 10);
        Player player2 = new Player("Obi-Wan Kenobi", 8);


        Game game = new Game();
        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round(player1.getName(), "Unregistered player");
        });
    }

    @Test
    public void fight3() {
        Player player1 = new Player("Darth vader", 10);
        Player player2 = new Player("Obi-Wan Kenobi", 80);


        Game game = new Game();
        game.register(player1);
        game.register(player2);


        int actual = game.round(player1.getName(), player2.getName());
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fight4() {
        Player player1 = new Player("Darth vader", 10);
        Player player2 = new Player("Obi-Wan Kenobi", 8);


        Game game = new Game();
        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round(player2.getName(), "Unregistered player");
        });
    }

    @Test
    public void fight5() {
        Player player1 = new Player("Darth vader", 10);
        Player player2 = new Player("Obi-Wan Kenobi", 10);


        Game game = new Game();
        game.register(player1);
        game.register(player2);


        int actual = game.round(player1.getName(), player2.getName());
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


}
