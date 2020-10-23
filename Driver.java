import java.util.Scanner;

public class Driver {
	
public static void printRecord (Record[] records, String recordTitle) {
		
		for (int i = 0; i < records.length; i++) {
			if(records[i].getRecordTitle().equalsIgnoreCase(recordTitle)) {
				
				System.out.println("ID: " + records[i].getId() + "\nTitle: "
								+ records[i].getRecordTitle() + "\nSinger: " 
								+ records[i].getSingerName() + "\nLength of the song: " 
								+ records[i].getRecordLength() + "\nRanking: " 
								+ records[i].getrecordRanking());
			}
			
		}
	}
	
	public static int findSongIndex (Record[] records, String titleFromUser) {
		
		for (int i = 0; i < records.length; i++) {
			if (records[i].getRecordTitle().equalsIgnoreCase(titleFromUser)) {
				return i;
			}
		}
		return -1;		
	}
	
	public static double getAverageLength (Record[] records) {
		
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordLength();
		}
		
		return sum / (double)records.length;
		
	}
	
	public static double getAverageRanking (Record[] records) {
	
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getrecordRanking();
		}
		
		return sum / (double)records.length;
	}
	

	public static void main(String[] args) {
		
		Record[] records = new Record[7];
		
		records[0] = new Record ("Tonight", "One", 2.8, 4);
		records[1] = new Record ("Without", "One", 3.2, 5);
		records[2] = new Record ("My crazy", "One", 2.7, 5);
		records[3] = new Record ("Sick", "Two", 2.8, 4);
		records[4] = new Record ("Boy", "Petr", 2.8, 4);
		records[5] = new Record ("Miss you", "Two", 2.8, 4);
		records[6] = new Record ("You know that...", "Voplatka", 2.8, 4);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the title: ");
		String titleFromUser = input.nextLine();
		System.out.println();
		
		
		int index = findSongIndex(records, titleFromUser);
		if (index < 0) {
			System.err.println("The title: " + titleFromUser + " is not in the database");
		} else {
			printRecord(records, titleFromUser);
		}
		
		System.out.println();
		System.out.println("Index of the record is: " + index);
		System.out.println();
		
		System.out.println("The average length of records " + getAverageLength(records));
		System.out.println("The average records ranking is " + getAverageRanking(records));		
	}
}