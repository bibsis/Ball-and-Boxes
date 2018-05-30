package org.elsys.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.elsys.part1.Ball;
import org.elsys.part1.BallContainer;
import org.elsys.part1.Box;
import org.elsys.part1.Color;
import org.elsys.part1.NotEnoughCapacityException;

public class Main4 {
	public void main() {
	    List<Integer> inputNumbers = new ArrayList<Integer>();
	    
	    Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Arrays.stream(sc.nextLine().split(","))
                  .forEach(token -> inputNumbers.add(Integer.parseInt(token)));
        }

        List<Ball> balls = new ArrayList<Ball>();
        
        Scanner sc1 = new Scanner(System.in);

        while (sc1.hasNext()) {
            Arrays.stream(sc1.nextLine().split(","))
                  .forEach(token -> inputNumbers.add(Integer.parseInt(token)));
        }
        
        for (Integer number : inputNumbers) {
            switch (number % 4) {
                case 0:
                    balls.add(new Ball(1.1, Color.WHITE));
                    break;
                case 1:
                    balls.add(new Ball(2.1, Color.GREEN));
                    break;
                case 2:
                    balls.add(new Ball(3.1, Color.BLUE));
                    break;
                case 3:
                    balls.add(new Ball(4.1, Color.RED));
                    break;
            }
        }

        BallContainer ballContainer = new BallContainer();

        ballContainer.addAll(balls);

        try {
        	 Box box = new Box(50);

        	 
            Iterator<Ball> ballsFromSmallestIterator = box.getBallsFromSmallest();

            Box sortedBox = new Box(50);

            while (ballsFromSmallestIterator.hasNext()) {
                sortedBox.add(ballsFromSmallestIterator.next());
            }
        } catch (NotEnoughCapacityException ex) {
            System.out.println(ex.getMessage());
        }
	}
}
