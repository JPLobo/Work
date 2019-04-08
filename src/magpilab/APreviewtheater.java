package magpilab;

public class APreviewtheater {
	
	private int[][] seats;
	private final int spr = 5;
	private final int rows = 4;
	private int counter = 0;
	private int count =0;
	
	
	public boolean isAisleSeat (int row, int seatNumber) {
	
if (seats[row][seatNumber] == seats[row][0] || seats[row][seatNumber] == seats[row][spr]) {
	return true;
}
return false;
	}
	public boolean twoTogether()
	{ 
		for (int g = 0; g< seats[rows][0]; g++) {
			for (int h =0; h<seats[0][spr]; h++) {
				if (seats[g][h] == 0) {
					 counter++;
				}
				else { 
					counter =0;
				}
				if (counter == 2) {
					break;
				}
	}
		}
		if (counter == 2) {
		return true;
		}
		return false;
	}
	public int findAdjacent(int row, int seatsNeeded)
	{ 
		for (int j = 0; j< seats[rows][0]; j++) {
			if (seats[row][j] == 0) {
				if(seats[row][j +1]==0) {
					count++;
					
				}
			}
			if (count == seatsNeeded) {
				return j;
			}
		}
			
	

	return -1;
}
}
