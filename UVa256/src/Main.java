import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		QuirksomeSquares("uva0256.in.txt", "uva0256.out.txt");
	}
	
	public static void QuirksomeSquares(String fileIn, String fileOut) throws FileNotFoundException {
		Scanner reader = new Scanner(new File(fileIn));
		PrintWriter writer = new PrintWriter(new File(fileOut));
		int starter = 0, tempNumber;
		int lowerHalf, upperHalf;
		
		while(reader.hasNextInt()) {
			int digits = reader.nextInt();
			
			int upperLimit = (int) Math.pow(10, digits);
			int half = (int) (upperLimit/Math.pow(10, digits/2));
						
			while(starter < upperLimit) {
				tempNumber = starter;
				// The second half of the number
				lowerHalf = tempNumber%half;
				// The first half of the number
				upperHalf = tempNumber/half;
				
				// Format the numbers
				if(Math.pow((upperHalf+lowerHalf), 2) == starter) {
					if(digits == 2 && String.valueOf(starter).length()< digits)
						writer.println("0"+starter);
					
					else if(digits == 4 && String.valueOf(starter).length()< digits) {
						if(String.valueOf(starter).length() == 1)
							writer.println("000"+starter);
						else if(String.valueOf(starter).length() == 2)
							writer.println("00"+starter);
						else if(String.valueOf(starter).length() == 3)
							writer.println("0"+starter);
					}
					else if(digits == 6 && String.valueOf(starter).length()< digits) {
						if(String.valueOf(starter).length() == 1)
							writer.println("00000"+starter);
						else if(String.valueOf(starter).length() == 2)
							writer.println("0000"+starter);
						else if(String.valueOf(starter).length() == 3)
							writer.println("000"+starter);
						else if(String.valueOf(starter).length() == 4)
							writer.println("00"+starter);
						else if(String.valueOf(starter).length() == 5)
							writer.println("0"+starter);
					}
						
					else if(digits == 8 && String.valueOf(starter).length()< digits) {
						if(String.valueOf(starter).length() == 1)
							writer.println("0000000"+starter);
						else if(String.valueOf(starter).length() == 2)
							writer.println("000000"+starter);
						else if(String.valueOf(starter).length() == 3)
							writer.println("00000"+starter);
						else if(String.valueOf(starter).length() == 4)
							writer.println("0000"+starter);
						else if(String.valueOf(starter).length() == 5)
							writer.println("000"+starter);
						else if(String.valueOf(starter).length() == 6)
							writer.println("00"+starter);
						else if(String.valueOf(starter).length() == 7)
							writer.println("0"+starter);
					}
						
					else
						writer.println(starter);
				}
				starter++;
			}
			starter = 0;
		}
		reader.close();
		writer.close();
	}
}
