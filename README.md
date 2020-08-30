##Overview for MakeChange project

- This project involved taking in user data and running it through the program. with that being said I first imported a scanner and created the scanner variable
named kb.
- After declaring the scanner variable I prompted the user for data in regards to the price of their item and amount tendered.
- Once the data was initialized into the variables 'price' and 'tendered' i created a double variable named 'change' and set it equal to (tendered + .00005) - price. the reason behind adding .00005 to the tendered variable was to round the number so the pennies output would be accurate.
- next I created int and double variable for the number of each denomination of change.
- in order to find the number of each denomination i used "casting" to turn the each variable into an integer.
- before i created the while loop to determine how much of each denomination was needed for change, i set 2 if statements for the condtions of price == tendered as well as tendered < price. if tendered < price than i would prompt the user they have not provided enough for the price of their good and send then through the prompt again. once the condition tendered >= price was met it would send the user to the while loo i will describe next.
- i decided to create a while loop in order to make the program continue to print off if conditions that were determined by whether each denomination was need to make change.
- after determining how many times each denomination could go into the variable 'change' the program prints off the message telling the customer how many of each they get back until the while function ends its loop on the condition change > 0.

##Topics

  - Taking user input
  - Casting
  - Methods
  - while loops
  - if statements
  -

#How to Run

 1. enter the amount of the god you are trying to purchase
 2. enter the amount tendered
 3. if amount tendered == price than the program ends
 4. if the tendered < price the user is prompted to please provide enough for the price of their good and sent through the original inputs again
 5. once they have entered enough money for the price of their good the program will tell them that how much of each denomination they will receive
 6. the program ends 
