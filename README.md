# card-game-project
# Must 
# Class- CardGame
- has an ArrayList<Card> for deck of cards which contains all 52 cards. This needs to be populated when game is constructed.
- has a name defined in the constructor
- has getDeck method that lists cards
# Class - Card
- has string suit eg spade
- has string symbol
- has int value
- has toString method that describes the class

# Should
# Method in CardGame 
- Card dealCard()- takes the card from the top of the deck and returns it
- ArrayList<Card> sortDeckInNumberOrder() - sorts the cards in order eg 22223333  and store new shuffled deck back into the deck of cards attritute
- ArrayList<Card> sortDeckIntoSuits() - sorts into deck of suits and stores in  deck of cards attribute
- ArrayList<Card> shuffleDeck() - shuffles deck into a random order and store in deck of cards attribute

# Psudeo Code 
- Start with creating a commands class, set up methods as options in command class.
- Then create methods
- Use the interface comparable to sort by number
- Use searchable to sort by suit
- Use Math.Random to shuffle