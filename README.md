####  Jets Project

The project had many requirements. I was to create a fleet of jets with different capabilities.
My application will be a menu to use your jets and access information about them.


All jets must have a model, speed, range, and price associated with them.



###  Structure

- This project held many classes.

  - There was a main application class which launched my menu and the called methods from outside
      classes to help run my program properly.

  - I had a class called AirField that contained all of my methods that were used to do the following:

     -  Create and array of Jets, using a txt file to import the information on it, assign each line
          of the txt file to a new instances of a jet and add them to the array list.

     - printFleet method to print the list of all current Jets and their details.

     - fastestJet method that calculated the fastest current jet in the fleet, and would also display
        the information of that specific jet.

     - longestRange method that looked at the range of all jets in the fleet and the displayed the
          one with the longest range in N miles.

     - dogFight method that iterated through my array to find the jets that were an instance of a
          fight jet and then called their corresponding method from the interfaces that they implemented.

      - loadAllCargo method that iterated through my array to find the jets that were an instance of a
           cargo jet and then called their corresponding method from the interfaces that they implemented.

      - travel method that iterated through my array to find the jets that were an instance of a
           passenger jet and then called their corresponding method from the interfaces that they implemented.

      - add a Jet method, that would allow the user to enter information, Make, Model, Speed, Range and Price,
        to the current fleet at the airfield. This would then appear on the list of jets if the user chose menu
        item 1 again at the root of the first menu.

      - remove a Jet method that would prompt a menu for the user to see and choose a jet based on a number
          to remove from the fleet. Once removed this jet would then disappear from the list if the current
          list was chosen again.

      - I also added a fly a jet method, that prompted the user a few questions, which in turn led  them to a menu
          of jets the  could fly. If the user chose a jet that was a fighter jet, there was a secret was scenario
          that displayed a small story with a few fun options while in a dog fight.

    - After each menu item was chosen, it looped back to the root menu so the user could choose again until they
        entered quit.






### What I Learned and Improved

    - Some lessons I learned and improved on while working on the project were:
          - Try/Catch
          - For each loops
          - Casting and Instance Of
          - Array Lists
          - Interfaces




          
### Technology I used
        - While loops
        - Switch loops
        - Switch within a Switch
        - Try/Catch
        - For each loops
        - Casting and Instance Of
        - Array Lists
        - for loops
        - Interfaces
        - Abstract classes
        - UML Diagram
        -




###   What Was Fun  

- This was one of the most fun HW assignments I have done. I found it challenging at first, having to use some
    things we learned that I was not the most familiar with, but it helped me grow and gain a better understanding.
    I love while loops and making switch menus, it was fun to put a switch within a switch as well as do a stretch
    goal. It was even more fun to create a fun war time dog fight scenario I added when the user chose to fly a
    fight jet.
