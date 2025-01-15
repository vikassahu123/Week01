


import java.util.Scanner;

public class SimpleCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
       
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
       
        // Initialize the deck
        initializeDeck(deck, suits, ranks);
       
        // Shuffle the deck
        shuffleDeck(deck);
       
        // Get the number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numberOfPlayers = sc.nextInt();
       
        System.out.print("Enter the number of cards to be distributed to each player: ");
        int cardsPerPlayer = sc.nextInt();
       
        if (numberOfPlayers * cardsPerPlayer <= numOfCards) {
            // Distribute cards
            String[][] playerCards = distributeCards(deck, numberOfPlayers, cardsPerPlayer);
           
            // Print the player cards
            printPlayerCards(playerCards, numberOfPlayers, cardsPerPlayer);
        } else {
            System.out.println("Not enough cards to distribute.");
        }
    }
   
    public static void initializeDeck(String[] deck, String[] suits, String[] ranks) {
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
    }
   
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
   
    public static String[][] distributeCards(String[] deck, int numberOfPlayers, int cardsPerPlayer) {
        String[][] playerCards = new String[numberOfPlayers][cardsPerPlayer];
        int cardIndex = 0;
       
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }
   
    public static void printPlayerCards(String[][] playerCards, int numberOfPlayers, int cardsPerPlayer) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(playerCards[i][j]);
            }
            System.out.println();
        }
    }
}