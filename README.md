# Code_exercises
A drawing robot is positioned at point (0,0) of a coordinate plane, and the string moves describes the path the robot will take.
Each of the string's characters describes a single move made by the robot.
Moreover, the robot will make the moves in the exact same order as they appear in the string, starting from position
(0 , 0).

Assuming the robot has already made some moves from the string, and is currently at point(x , y), if the next character of the string is:

• "^" : the robot will move to (x , y + 1);

• "v" : the robot will move to (x , y - 1);

• "<" : the robot will move to (x - 1 , y);

• ">" : the robot will move to (x + 1 , y).

Each time the robot moves, it draws a line between its current position and the point to which it moves.
It is guaranteed that the instructions provided in the string moves will never cause the robot to visit the same point more than once, with the exception of point
(0 , 0), which might be visited by the robot exactly twice: at the beginning and at the end of the robot's path.

The task is to determine whether, after the robot has made all moves provided in the string, all the lines it has drawn form a single rectangle.

Write a function:
```java
public static boolean solution(String moves){}
```
that, given the string moves, returns true if the robot's path will form a rectangle or false otherwise.

## Examples:

1. Given moves = "^^^<<<<vvv>>>>", the function should return true.

<img src="/Users/julek/Documents/Zrzuty ekranu/Zrzut ekranu 2024-04-17 o 16.56.18.png" width="250" height="250">

2. Given moves = "<vvv>>^^^<", the function should return true;

<img src="/Users/julek/Documents/Zrzuty ekranu/Zrzut ekranu 2024-04-17 o 16.56.33.png" width="250" height="250">

3. Given moves = "<^^^>v", the function should return false. The rectangle is two moves short.

<img src="/Users/julek/Documents/Zrzuty ekranu/Zrzut ekranu 2024-04-17 o 17.14.36.png" width="250" height="250">




