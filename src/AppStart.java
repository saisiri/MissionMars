import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.robots.Direction;
import com.robots.Instruction;
import com.robots.Position;
import com.robots.RobotManager;
import com.robots.Rover;
import com.terrain.Plateau;

public class AppStart {
	public static void main(String[] arg) {
	 	Plateau  plateau = new Plateau(new Position(0, 0), new Position(5, 5));
	 	RobotManager manager = new RobotManager(plateau);
	 	Map<Rover, List<Instruction>> roverInstructions = new HashMap<>();
	 	roverInstructions.put(
 			new Rover("Rover 1", new Position(1, 2), Direction.N),
 			Arrays.asList(Instruction.L,Instruction.M,Instruction.L,Instruction.M,Instruction.L,Instruction.M,Instruction.L,Instruction.M,Instruction.M)
		);
	 	roverInstructions.put(
 			new Rover("Rover 2", new Position(3, 3), Direction.E),
 			Arrays.asList(Instruction.M,Instruction.M,Instruction.R,Instruction.M,Instruction.M,Instruction.R,Instruction.M, Instruction.R, Instruction.R, Instruction.M)
		);
		roverInstructions.forEach((rover, instructions) -> {
			try {
				for (Instruction instruction : instructions) {
					manager.move(rover, instruction);
				}
				System.out.println(rover.getPosition().getX() + " " + rover.getPosition().getY() + " " + rover.getDirection());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});
	}
}
