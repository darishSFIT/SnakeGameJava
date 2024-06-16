# Snake Game

Snake is the common name for a video game concept where the player maneuvers a line that grows in length, with the line itself being a primary obstacle. This concept is implemented here using Java programming language, utilizing various Java AWT (Advanced Window Toolkit) components and some Swing components.

## Game Controls

The direction where the snake moves on the screen can be controlled by using the up, down, left, and right arrow keys on the keyboard. This is achieved using a keyboard event listener that records the key pressed from the keyboard.

## Rules and Functionalities

- The snake can move in a given direction.
- When it eats the food, the size of its tail increases.
- Food is generated randomly.
- When the snake bites itself, the game is over.

## Project Structure

The code contains various classes. Below are the files in the Snake Game folder along with their functionalities:

### DataOfSquare.java

- **ArrayList<Color> C = new ArrayList<Color>();** - An ArrayList that contains the colors.
- In the `DataOfSquare(int col)` function, colors are assigned:
  - "YELLOW" for the snake
  - "BLUE" for the food
  - "BLACK" for the game screen background

### KeyboardListener.java

- This class handles keyboard input to control the snake's movement.
- **KeyAdapter** - An abstract adapter class for receiving keyboard events.
- **getKeyCode()** - Returns the integer keyCode associated with the key in this event.
  - Left arrow key: 37
  - Right arrow key: 39
  - Up arrow key: 38
  - Down arrow key: 40

### SquarePanel.java

- **setBackground()** - Sets the background color of this component.
- **repaint()** - Causes a call to this component's update method as soon as possible.

### ThreadsController.java

This is the most important class, controlling the game logic.

- **run()** - Core function that runs the game loop.
- **pauser()** - Adds delay between each move performed by the snake.
- **checkCollision()** - Checks if the snake bites itself or eats food. Displays "Food Consumed!" message if food is eaten.
- **stopTheGame()** - Stops the game in case of a collision.
- **spawnFood()** - Generates food for the snake at a random location.
- **moveInterne()** - Moves the head of the snake and refreshes positions in the array list.
- **moveExterne()** - Refreshes the squares that need to be refreshed.
- **deleteTail()** - Removes superfluous data from the positions array list, refreshing the display.

### Window.java

- **Grid = new ArrayList<ArrayList<DataOfSquare>>();** - Creates the ArrayList that contains the threads.
- **data = new ArrayList<DataOfSquare>();** - Creates threads and their data.
- **DataOfSquare c = new DataOfSquare(2);** - Adds created threads to the ArrayList.
- **getContentPane().setLayout(new GridLayout(20, 20, 0, 0));** - Sets up the layout of the panel.
- **getContentPane().add(Grid.get(i).get(j).square);** - Adds each square to the panel.
- **Tuple position = new Tuple(10, 10);** - Initial position of the snake.
- **ThreadsController c = new ThreadsController(position);** - Passes the initial position to the controller and starts the game.
- **this.addKeyListener((KeyListener) new KeyboardListener());** - Links the window to the keyboard listener.

### Main.java

- **Window f1 = new Window();** - Creates the game window with all its features.

## How to Run

To run the Snake Game, compile and execute the `Main.java` file. Ensure that all the other Java files are in the same directory.

```sh
javac Main.java
java Main
```

### Screenshots
<div align="center">
  
![ss1](https://imgur.com/Rowjenk.png)


![ss2](https://imgur.com/rFsaapE.png)


![ss3](https://imgur.com/rFHxPID.png)

</div>
