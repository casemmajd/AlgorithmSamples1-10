
Description of a Card Game: 
 In a typical card game, each player gets a hand of cards. 
 The deck is shuffled and cards are dealt one at a time from the deck and added to the players' hands. 
 In some games, cards can be removed from a hand, and new cards can be added. 
 The game is won or lost depending on the value (ace, 2, ..., king) and suit (spades, diamonds, clubs, hearts) of the cards that a player receives. 

Nouns: 
 If we look for nouns in this description, there are several candidates for objects: game, player, hand, card, deck, value, and suit. 
   - game, player, hand, card, deck, value, and suit.
 Of these, the value and the suit of a card are simple values, and they might just be represented as instance variables in a Card object. 
   - value, and suit 
 In a complete program, the other five nouns might be represented by classes. 
 But let's work on the ones that are most obviously reusable: card, hand, and deck.
   - class Card, class Hand, class Deck


Verbs:
 If we look for verbs in the description of a card game, we see that we can shuffle a deck and deal a card from a deck. 
   - shuffle, and deal
 This gives use us two candidates for instance methods in a Deck class: shuffle() and dealCard(). 
   - shuffle(), dealCard()
 Cards can be added to and removed from hands. 
   - added to, and removed 
 This gives two candidates for instance methods in a Hand class: addCard() and removeCard(). 
  addCard(), removeCard()
 Cards are relatively passive things, but we at least need to be able to determine their suits and values. 
   - suits, and values
   - getSuit(), getValue()
