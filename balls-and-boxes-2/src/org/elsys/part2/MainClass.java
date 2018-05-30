package org.elsys.part2;

import java.util.ArrayList;
import java.util.List;

import org.elsys.part1.Ball;
import org.elsys.part1.Box;

public class MainClass {
	public void main(String[] args) {
		
		 List<Integer> mainArguments = new ArrayList<Integer>();
		 
		 for (String arg : args) {
	            if (arg != null) {
	                mainArguments.add(Integer.parseInt(arg));
	            }
	        }
		 List<Ball> balls = new ArrayList<Ball>();
		 
		 Box box = new Box(50);

         for (Ball ball : balls) {
             box.add(ball);
         }
	}
}
