import java.io.IOException;
import java.util.Random;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		
		Random r=new Random();
		 String[][] a=new String[rows][cols];
		  for(int i=0;i<rows;i++)
		  {
		      for(int j=0;j<cols;j++)
		      {
		         a[i][j]=vals[r.nextInt(7)];
		         
		      }
		  
		     
		  }
		
		
		grid = a;
		
	}
	
	
	

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String element = grid[0][0]; int count = 0;
		 for (int row = 0; row < grid.length; row++) {
		        for (int col = 0; col < grid[0].length; col++) {

		            String tempElement = grid[row][col];
		            int tempCount = 0;

		                for (int x = 0;  x< grid.length;x++){
		                    for(int y=0; y<grid[x].length;y++){

		                        if(grid[x][y] == tempElement){

		                            tempCount++;
		                        }

		                        if(tempCount > count) {

		                            element = tempElement;
		                            count = tempCount;

		                        }


		                    }


		                }
		                return tempElement;

		        }

		    }
		 return null;
		 	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		 for(int i=0;i<grid.length;i++)
		  {
		      for(int j=0;j<grid.length;j++)
		      {
		    	  if(grid[i][j] == val) {
		    		  count++;
		    	  }
		      }}
		 return count;
		      
	}

	//display the grid
	public String toString()
	{
		 for (int r = 0; r < grid[0].length; r++) {       //for loop for row iteration.
	    	  for (int c = 0; c < grid.length; c++) {   //for loop for column iteration.
	    	  System.out.print(grid[c][r] + "\t");
	    	
	    	  }
	    	  System.out.println(); //using this for new line to print array in matrix format.
	    	 
	   
	    	  }
		 return"";
	}
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid masters = new Grid(20, 20, vals); 
		System.out.println("The matrix");
		masters.toString();
		System.out.println("Max is : " + masters.findMax(vals));
		System.out.println(" a occurs " + masters.countVals("a") + " times");
		System.out.println(" b occurs " + masters.countVals("b") + " times");
		System.out.println(" c occurs " + masters.countVals("c") + " times");
		System.out.println(" 7 occurs " + masters.countVals("7") + " times");
		System.out.println(" 9 occurs " + masters.countVals("9") + " times");
		System.out.println(" 2 occurs " + masters.countVals("2") + " times");
		System.out.println(" X occurs " + masters.countVals("x") + " times");
		
	}
}
