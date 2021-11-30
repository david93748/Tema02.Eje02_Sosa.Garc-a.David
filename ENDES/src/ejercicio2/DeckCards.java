package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		//Lista donde se va a guardar el valor total de las cartas
		ArrayList<Card> deck = new ArrayList<Card>();

		//Bucle que crea todos los valores de todas cartas
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				//Crea una carta
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		//Baraja las cartas, intercambiando las posiciones de las cartas aleatoriamente
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Nos muestra las 5 primeras cartas
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
