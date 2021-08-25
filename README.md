# Nikita_Final_Project

--Favorite Football Player App --Nature of the project:
This is a java based project, I have made it simple, very user friendly and easy to use.

In my project I can add a favorite football player, remove the favorite player
and search the player by text writing. It has checks that
you can't search an empty box, If the text box is empty than it will display an error
message. If you complete the text box than it will display the success message.
I wanted the interfaceto be simple so i could learn whilst creating the project and not 
struggle and have massive errors to sort out.

-- App Features:

In my project I used the following features Java, JavaFX, exception handling and serialization of an object. 

There are four classes in my project: 

--Player.javaused to add player info., create constructor and getter setter to protect data. 

--Sample.fxml used to create the screen, labels and text field using css tags.

--Main.java, this class is the main class in this class, where we perform some functions to add the player, delete the player and search the player. In this class first we have to write JavaFX code to create the screen and set the size of the screen and load the class sample.fxml. In the sample.fxml wscreen the labels, textboxes and buttons inside the main screen. After this I gave values to the buttons, and textboxes with ids. The ArrayList used to store data of player. 

--For the add player section, inside the setOnAction if the text box is empty it will display an error message or if the field is not empty it will then run the else statement, Boolean type flag is used to check the players name in the text box entered is already  there, If the arraylist already has the name entered it will not store and it will display an error message, the all-error message is shown on the alert box. After this the Boolean type flag checks if the name is not present in the list, it will then add the player name and player team name to the list. 

--For the remove player section, When the remove button is pressed it will check if the text box is empty then it will again display an error message. In the else statement, if the name is present in the list, then it will remove that player from the list. After this we will use Boolean type flag, if the players name is found than it will display the player and its team. Again, in the else statement, if player is not present than it will display an error message. 

--The search player section so when the search player button is pressed and if the text field is empty, it will again show an error message. In the else statement we must search the player if the given name is present than it will display the players name and team. If the player is not present than it will display an error message.  “try and catch”, exception handler, if there is any exception inside the code it will be display the exception message as the try statement allows you to define a block of code to be tested for errors while it is being executed and the catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

--Compiling:
Goto project eclipse -> clean then build project

--Deploying:
Right click on the project and click export.

--Running:
Simply Press the green play button in the top part of eclipse which runs the project.


