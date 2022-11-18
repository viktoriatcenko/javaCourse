package lesson_08.interfaces;

public interface GameBJ {
    void addPlayerInGame(Player player); // добавить игрока в игру

    void giveTwoCardsONHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать доп карту игроку, если ему нужно

    void printWinner(); // объявлять победителя
}
