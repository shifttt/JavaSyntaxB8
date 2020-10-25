package group.task;

public class task7 {
	
	public static void main (String[] args) {
		
		int[][] array = {
				{1, 3, -5, 120},
				{4, 3, 25, 16},
				{5, 180, 6, 7}
		};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j< array[i].length; j++) {
				if(array[i][j]%2==0) {
					System.out.print(array[i][j] + " ");
				}
			}
			
		}
		
	}

}
