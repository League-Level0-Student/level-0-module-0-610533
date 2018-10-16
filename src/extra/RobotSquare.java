package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		Robot Jerry =new Robot();
		Jerry.setSpeed(50);
		Jerry.penDown();
		
		for (int i = 0; i < 8; i++) {
			Jerry.move(100);
			Jerry.turn(360 / 8);
		}
		
//		Jerry.move(70);
//		Jerry.turn(90);
//		Jerry.move(70);
//		Jerry.turn(90);
//		Jerry.move(70);
//		Jerry.turn(90);
//		Jerry.move(100);
//		Jerry.turn(70);
//		Jerry.move(100);
//		Jerry.turn(50);
//		Jerry.move(200);
//		Jerry.turn(90);
//		Jerry.move(190);
//		Jerry.turn(90);
//		Jerry.move(200);
//		Jerry.turn(60);
//		Jerry.move(150);
//		Jerry.turn(90);
//		Jerry.move(100);
//		Jerry.turn(60);
//		Jerry.move(200);
				
		
		
		
		
	}
}
