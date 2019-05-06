package inheritance;
import java.util.ArrayList;
public class HexGrid
{

private GamePiece[][] grid;

public int getGamePieceCount()
{
	int count = 0;
	for (int i = 0; i < grid [0].length; i++) {
		for (int g = 0; g< grid.length; g++) {
			if (grid[i][g] != null ) {
				count ++;
			}
				
		}
	}
	return count;
	
}

public boolean addRandom (int num) {
	if (getGamePieceCount () + num > grid.length * grid[0].length) {
		return false;
	}
	while (num >0) {
		int row = (int)Math.random() * grid.length;
		int col = (int) Math.random() *grid[0].length;
		if(grid[row][col] == null) {
		
			num --;
		}
	}
	return true;
}
}