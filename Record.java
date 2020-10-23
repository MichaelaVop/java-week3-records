
public class Record {
	
	private int id;
	private String recordTitle;
	private String singerName;
	private double recordLength;
	private int recordRanking;
	
	public Record (String recordTitle, String singerName, double recordLength, int recordRanking) {
		
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
		
	}
	
	public int setId() {
		int randomNum = (int)(Math.random() * 9901) + 100;
		this.id = randomNum;
	}
	
	public void setRecordTitle(String recordTitle) {
		if (recordTitle != "" || recordTitle != null) {
			this.recordTitle = recordTitle;
		}
	}
	
	public void setSingerName(String singerName) {
		if (singerName != "" || singerName != null) {
			this.singerName = singerName;
		}
	}
	
	public void setRecordLength(double recordLength) {
		if (recordLength > 0) {
			this.recordLength = recordLength;
		}
	}
	
	public void setRecordRanking(int recordRanking) {
		if (recordRanking > 0 && recordRanking < 6) {
			this.recordRanking = recordRanking;
		}
	}
	
	
	public int getId () {return id;}
	public String getRecordTitle () {return recordTitle;}
	public String getSingerName () {return singerName;}
	public double getRecordLength () {return recordLength;}
	public int getrecordRanking () {return recordRanking;}
	
	

}
