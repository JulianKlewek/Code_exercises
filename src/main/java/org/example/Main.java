package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public boolean solution(String moves){
        int numberOfMoves = moves.length();
        if (numberOfMoves < 4 || !isNumberOfDirectionsEqual(moves)) {
            System.out.println("Moves are invalid");
            return false;
        }

        int currentX = 0;
        int currentY = 0;
        char[] movesArray = moves.toCharArray();
        Pair[] positions = new Pair[numberOfMoves];
        List<Integer> upDownList = new ArrayList<>();
        List<Integer> leftRightList = new ArrayList<>();

        for (int i = 0; i <= movesArray.length -1; i++) {
            if(movesArray[i] == '^'){
                currentY += 1;
                upDownList.add(currentX);
            }
            if(movesArray[i] == 'v'){
                currentY -= 1;
                upDownList.add(currentX);
            }
            if(movesArray[i] == '>'){
                currentX += 1;
                leftRightList.add(currentY);
            }
            if(movesArray[i] == '<'){
                currentX -= 1;
                leftRightList.add(currentY);
            }
            positions[i] = new Pair(currentX, currentY);
        }

        if(!isRobotCameBackToStartingPosition(currentX, currentY)){
            System.out.println("Robot didn't came back to starting position");
            return false;
        }
        if(isRobotVisitedSamePointTwice(positions)){
            System.out.println("Robot visited same point twice");
            return false;
        }
        if (!isRectangle(upDownList, leftRightList)){
            System.out.println("Moves not formed rectangle");
            return false;
        }

        System.out.println("Robot formed a rectangle");
        return true;
    }

    private boolean isRectangle(List<Integer> upDownList, List<Integer> leftRightList) {
        long upDownCount = upDownList.stream()
                .distinct()
                .count();
        long leftRightCount = leftRightList.stream()
                .distinct()
                .count();

        return upDownCount == 2 && leftRightCount == 2;
    }

    private boolean isRobotVisitedSamePointTwice(Pair[] pairs) {

        for (int i = 0; i < pairs.length; i++) {
            for (int j = i +1; j < pairs.length; j++) {
//                System.out.println(pairs[i] + " ," + pairs[j]);
                if(pairs[i].x == pairs[j].x && pairs[i].y == pairs[j].y){
//                    System.out.println("Jest powtórzenie");
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isRobotCameBackToStartingPosition(int x, int y) {
        return x == 0 && y == 0;
    }

    private boolean isNumberOfDirectionsEqual(String moves) {
        long countUp = moves.chars().filter(up -> up == '^').count();
        long countDown = moves.chars().filter(up -> up == 'v').count();
        long countLeft = moves.chars().filter(up -> up == '<').count();
        long countRight = moves.chars().filter(up -> up == '>').count();

        return countUp == countDown && countRight == countLeft;
    }

    class Pair{
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x=" + x + ", y=" + y;
        }

    }

}