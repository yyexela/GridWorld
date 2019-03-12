# Answers  
## Part 1  
### Set 1  
1) No, the bug does not always moves to a new location, for example, if in front of it is out of bounds or already occupied, it will instead turn.  
2) The bug moves in the direction it is facing.  
3) If the bug does not move then it is turning.  
4) When the bug moves it leaves behind a flower.  
5) When the bug is facing an edge and acts, it turns. If it is facing an edge and it moves, then it goes off the grid. If it isn't facing the edge but is at one, then it moves.  
6) When a bug has a rock right in front of it and acts, it turns.  
7) A flower does not move.  
8) A flower can act, causing it to darken in color.  
9) A rock can act but it has no apparent function in doing so. It has lots of getters, however.  
10) No, more than once actor cannot be in the same location in the grid at the same time.  
### Exercises  
1)  
* 0 degrees - North  
* 45 degrees - North-East  
* 90 degrees - East  
* 135 degrees - South-East  
* 180 degrees - South  
* 225 degrees - South-West  
* 270 degrees - West  
* 315 degrees - North-West  
* 360 degrees - North  
2) You can move the bug in any direction horizontally, vertically, or diagonally for a single square/grid  
When you tell the bug to move off the grid it disappears forever (on a bounded grid)  
3) I use the setColor() method to change the color of a flower and rock  
4) If I move the bug onto the rock, the rock is displaced by the bug and then when the bug moves again, a flower is in the place of where the rock was  
## Part 2  
### Set 2  
1) The variable sideLength is the side length of the box that the BoxBug creates  
2) The instance variable steps counts how many times the box bug moved, which is used to check to make sure the box bug didn't move more than the side length variable  
3) The turn method is called twice to make the box bug turn 90 degrees, making a corner of a box as opposed to then moving diagonally  
4) The move method can be called in the BoxBug class because it extends the Bug class which does contain the move method  
5) Yes, there is no setSideLength() or equivalent method that changes the side length variable. The only time the size of the square pattern will be different is if the grid is too small to fit the box bug's box  
6) Yes, if it hits a wall it has to turn before finishing the side length of the box  
7) The value of steps will be zero once the box bug turns, either by completing a box side length or hitting a wall (also, once the box bug is created)  
## Part 3
### Set 3  
1) `loc1.getRow();`  
2) `false` because the row and column are not identical  
3) `(4, 4)`  
4) `135` degrees since the location is south-east  
5) The `getAdjacentLocation` method starts out with a `Location` object and takes in another `Location` as a parameter, to which is the direction (like a vector, start point to end point)  
### Set 4  
1) You can count the number of objects on a grid by creating an ArrayList of locations by calling `getOccupiedLocations` and then calling `.size()` to find how many locations are occupied by objects.  
To get the number of empty locations in a bounded grid, find the number of objects and subtract it from the total grid size (found by `getNumRows() * getNumCols()`)  
2) You can check if location (10,10) is in a grid by calling `isValid(new Location(10, 10))`  
3) Grid has method declarations but no code in it because it is extended by other classes which overwrite the methods. If the methods were not declared, then the classes extending them couldn't use the methods if called as a `Grid` object.  
4) No, I don't think that it would be better for the objects to be returned in an array since you don't know how many objects there'll be in the first place whereas an array requires you to declare its size first.  
### Set 5  
1) Every Actor has a location, direction, and color.  
2) When an Actor is constructed, it is `BLUE` and faces `NORTH`.  
3) The Actor class was created as a class instead of an interface because other Actors need to implement the Actor class and take all of the methods. Then, the methods can be overwritten or kept the same. An interface is empty regardless, and only guarantees some methods, not their functionality.  
4) Adding an Actor twice without removing itself first causes an error `Exception in thread "main" java.lang.IllegalStateException: This actor is already contained in a grid.`  
Removing an Actor twice without adding itself a second time causes an error `Exception in thread "main" java.lang.IllegalStateException: This actor is not contained in a grid.`  
5) An actor move itself 90 degrees to the right by setting the direction to `90 + getDirection()`  
### Set 6  
1) `if (gr == null) return false` checks if the bug is on a grid. `if (!gr.isValid(next)) return false` checks if the adjacent location to the bug (according to its direction) is an actual location. Finally, `return (neighbor == null) || (neighbor instanceof Flower)` checks if the adjacent block is null or contains a Flower, onto which it can move, otherwise it doesn't.  
2) `return (neighbor == null) || (neighbor instanceof Flower)`  
3) `isValid(Location loc)` is used to make sure the bug doesn't go off the grid. `get(Location loc)` is used to get the object at a specific location, which is used to check to make sure the bug doesn't run onto a rock.  
4) `getAdjacentLocation(int direction)` is used to get the grid location of where the bug is facing to check objects and if it's on a grid.  
5) `getDirection()`, `getLocation()`, and `getGrid()`.  
6) If the location the bug is trying to move to is out of the grid, the bug removes itself from the grid (if the grid is bounded).  
7) The variable `loc` is needed in order to call the `getAdjacentLocation(int direction)` method.  
8) The flowers that are dropped by the bug have the same color as the bug becuase, when placed, they call the bug's `getColor()` method.
9) Using the `removeSelfFromGrid()` method, no. Using the `move()` method, yes.  
10) 
```java
Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
```
11) To turn 180 degrees, the bug needs to turn 180/45 = 4 times.  
### Group Activity  
Done :)  
## Part 4  
### Set 7  
1) The methods implemented in `Critter` are:  
`act()`, `getActors()`, `processActors()`, `getMoveLocations()`, `selectMoveLocation()`, `makeMove()`  
2) All critters make these actions, in order:  
`getActors()`, `processActors()`, `getMoveLocation()`, `selectMoveLocation()`, and `makeMove()`  
3) Subclasses of `Critter` could override the `getActors()` method since the method returns an ArrayList of <b>all</b> actors on a grid. Overriding the method could cause only a certain type of actors to be returned.  
4) A critter could process actors by: changing their color, changing their direction, removing them, and causing them to move/act.  
5) To make a critter move, it should call `getMoveLocations()`, `slectMoveLocation()`, and `makeMove()`. The first gets the critter's possible move locations, the second processe these locations down to a single location which is passed into `makeMove()` to actually move to the location.  
6) There is no `Critter` constructor because it extends `Actor`, so the `super` constructor is called, which is the constructor for `Actor`.  
### Set 8  
1) `ChameleonCritter` acts differently even though it doesn't override act because it changes the methods within act: `processActors()` and `makeMove()`.  
2) The `ChameleonCritter` calls `super.makeMove()` because it still moves like the critter it extends, it just changes the direction before-hand.  
3) You would make the `ChameleonCritter` drop a flower after it moves by creating a Flower object at the end of the `makeMove()` method and placing it at the previous critter location (obtained by calling `getLocation()` at the start of the method).  
4) `ChameleonCritter` doesn't override the `getActors()` method because it uses all actors in its `processActors()` method.  
5) The `Actor` class contains the `getLocation()` method.  
6) A `Critter` can access its own grid by the `getGrid()` method found in the `Actor` class.  
### Set 9  
1) The `CrabCritter` doesn't override `processActors()` because it's function is to not affect `Rock` and `Critter` classes, which the method filters out.  
2) To eat all neighboring actors, the `CrabCritter` first gets all actors to its front, front-right, and front-left in `getActors()`. Then, the class uses the super `processActors()` method to eat all of the actors obtained that aren't a rock or critter.  
3) The `getLocationsInDirections()` method is used in `CrabCritter` because it allows for an easier way to process the directions _from_ the crab that are being checked for actors. An input of an angle is given and then it returns an ArrayList of locations that exist given the array input on directions.  
4) The possible locations for actors to be returned by the `getActors()` method are (4, 3), (4, 4), and (4, 5).  
5) The similarity is that 'Math.random()' is used in both movements and they both can only move onto an empty grid space. The difference is that crabs can only move horizontally in-line with their bodies whereas critters can move onto any empty adjacent grid space.  
6) A `CrabCritter` turns instead of moving when the ArrayList returned from `getMoveLocations()` is empty, which causes the super method `selectMoveLocation()` to return the crab's current location, which is then checked for in `makeMove()`, causing a random direction to be chosen for the crab to move to (either left or right 90 degrees).  
7) The crabs don't eat each other because the `processActors()` method filters out any class which is a `Critter`, which is true of `CrabCritter` which extends `Critter`.  
## Part 5  
### Set 10
1) `isValid()` is specified in the `Grid` interface. The Abstract class `AbstractGrid` and grids `BoundedGrid` and `UnboundedGrid` implement this method. (see Set 10 figure)  
2) In `AbstractGrid`, the method `getValidAdjacentLocations()` is the only method that calls `isValid()`. The other methods don't call `isValid()` because they call `getValidAdjacentLocations()`.  
3) In `getNeighbors()`, the methods from the `Grid` interface called are: 
* `getOccupiedAdjacentLocations(Location loc)`  
* `get(Location loc)`  
The classes that implement these methods are `AbstractGrid`, `BoundedGrid`, and `UnboundedGrid` since the `Grid` interface is is the highest parent.  
4) The `getEmptyAdjacentLocations()` method returns a location when using the `get()` method that returns an object of type `E` because the all the `get()` method is doing is returning an object, if one exists, no matter the type. It doesn't matter what the type is for the `getEmptyAdjacentLocations()` method since it just checks if an object exists at a location, and returns all the empty locations.  
5) if `Location.HALF_RIGHT` was replaced both times with `Location.RIGHT` in the `getValidAdjacentLocations()` method, it would only return locations that are directly vertical or horizontal to the location being tested, as opposed to including diagonals.  
## Set 11  
1) The `BoundedGrid` constructor ensures that there is at least one valid location by throwing an `IllegalArgumentException` when the rows and/or cols are less than or equal to 0.  
2) `getNumCols()` determines the number of columns by getting the length of the first row (it has to exist due to the constructor).  
3) For a location to be valid in `BoundedGrid`, the location has to:  
* have a row greater or equal to 0  
* have a row less than the amount of rows  
* have a column greater or equal to 0  
* have a column less than the number of columns  
4) An `ArrayList<Location>` is returned in the `getOccupiedLocations()` method. The time complexity is n-squared due to the double for-loop.  
5) A location is returned by the `get()` method. A parameter of `Location` is needed. Big O will be n, since just if-statements are used (it has linear complexity).  
6) Th exceptions the `put()` method can throw are:  
* `IllegalArgumentException`  
* `NullPointerException`  
7) The `remove()` method returns generic `E` objects (whatever objects the `Grid` interface contains)  
8) Yes, since the `BoundedGrid` extends the abstract grid interface, which implements the grid interface, making changes where it is required in order for the grid to be bounded and for all parent methods to still work (by changing the methods where applicable).  