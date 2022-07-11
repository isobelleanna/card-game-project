# card-game-project
# Must (completed)
# Class- CardGame
- has an ArrayList<Card> for deck of cards which contains all 52 cards. This needs to be populated when game is constructed.
- has a name defined in the constructor
- has getDeck method that lists cards
# Class - Card
- has string suit eg spade
- has string symbol
- has int value
- has toString method that describes the class

# Should (completed)
# Method in CardGame 
- Card dealCard()- takes the card from the top of the deck and returns it
- ArrayList<Card> sortDeckInNumberOrder() - sorts the cards in order eg 22223333  and store new shuffled deck back into the deck of cards attritute
- ArrayList<Card> sortDeckIntoSuits() - sorts into deck of suits and stores in  deck of cards attribute
- ArrayList<Card> shuffleDeck() - shuffles deck into a random order and store in deck of cards attribute

# Pseudo Code 
- Start with creating a commands class, set up methods as options in command class.
- Then create methods
- Use the interface comparable to sort by number
- Use searchable to sort by suit
- Use collection.shuffle() to shuffle

# Could (completed)
# Class Snap that extends CardGame
- should use methods dealCard(), sortDeckInNumberOrder(), sortDeckIntoSuits() and shuffleDeck() as well as some new ones.
- by pressing enter the user takes there turn
- each turn a new card is dealt from the deck
- the game continues until two cards in a row have the same symbol. When this happens the player wins and the game ends.

# Pseudo Code
- create a PlayCommands Class
- if statement that when user input "" dealCard()
- fields current card + previous card
- if current card + previous card symbol is the same printMessage("You win")

# Would (completed)
- create a player class so two players can play snap together
- the users take it in terms to go if the snap occurs, they win.
- add a timer so that when there is a snap oppurtunity, the player has two seconds to submit snap in order to win. If they don't type they loose.

# Pseudo Code
- create a player class, with username and score and getter and setter for score
- create an int field in play commands called playerNum if 1 run user with id of 1 then set player to 2 and run user with the id of two. 
- increase score method which increases users score by 1

# Would (part 2)
- add a timer so that when there is a snap opportunity, the player has 2 seconds to submit snap to win, if they don't they loose.

# Pseudo Code
- use class timer and set to 2 seconds 
- if userinput == "snap" print "You win", else "You loose"