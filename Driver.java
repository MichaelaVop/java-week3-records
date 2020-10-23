import java.util.Scanner;

public class Driver {
	
	public static void printRecord (Record[] records, String recordTitle) {
		
		for (int i = 0; i < records.length; i++) {
			if(records[i].getRecordTitle().equalsIgnoreCase(recordTitle)) {
				
				System.out.println("ID: " + records[i].getId() + " title "
								+ records[i].getRecordTitle() + " singer: " 
								+ records[i].getSingerName() + ", length of the song is " 
								+ records[i].getRecordLength() + ", with ranking " 
								+ records[i].getrecordRanking());
			
		}
	}
	
	public static int findSongIndex (Record[] records, String titleFromUser) {
		
		for (int i = 0; i < records.length; i++) {
			if (records[i].getRecordTitle().equalsIgnoreCase(titleFromUser)) {
				return index;
			}
			a++;
		}
		return -1;		
	}
	
	public static double getAverageLength (Record[] records) {
		
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records.getRecordLength();
		}
		
		return sum / (double)records.length;
		
	}
	
	public static double getAverageRanking (Record[] records) {
	
		double sum = 0.0;
		for (int i = 0; i < records.length; i++) {
			sum += records.getrecordRanking();
		}
		
		return sum / (double)records.length;
	}
	
	//public static void selectedSong (Record)
	

	public static void main(String[] args) {
		
		
		Record r1 = new Record (Record.setId(), "Tonight", "One", 2.8, 4);
		Record r2 = new Record (Record.setId(), "Without", "One", 3.2, 5);
		Record r3 = new Record (Record.setId(), "My crazy", "One", 2.7, 5);
		Record r4 = new Record (Record.setId(), "Sick", "Two", 2.8, 4);
		Record r5 = new Record (Record.setId(), "Boy", "Petr", 2.8, 4);
		Record r6 = new Record (Record.setId(), "Miss you", "Two", 2.8, 4);
		Record r7 = new Record (Record.setId(), "You know that...", "Voplatka", 2.8, 4);
		
		Record[] records = new Record[7];
		
		records[0] = r1;
		records[1] = r2;
		records[2] = r3;
		records[3] = r4;
		records[4] = r5;
		records[5] = r6;
		records[6] = r7;
		
		printRecord(records);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the title: ");
		String titleFromUser = input.nextLine();
		System.out.println();
		
		
		int index = findSongIndex(records, titleFromUser);
		System.out.println(index);
		
		/*
		if (index == -1) {
			System.err.println("We don't have " + titleFromUser);
		} else {
			printRecord(records[index]);
			}
		*/
		
		}
		
		
		

	}

}
