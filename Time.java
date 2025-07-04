package demo02;

public class Time {
	private int hrs;
	private int mins;
	private int secs;
	
	public Time(){}

	public Time(int hrs, int mins, int secs) {
		super();
		this.hrs = hrs;
		this.mins = mins;
		this.secs = secs;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) throws InvalidTimeException{
		if(hrs<0 || hrs>24)
			throw new InvalidTimeException("hrs",hrs);
		this.hrs = hrs;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) throws InvalidTimeException {
		if(mins<0 || mins>60)
			throw new InvalidTimeException("mins",mins);
		this.mins = mins;
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) throws InvalidTimeException {
		if(secs<0 || secs>60)
			throw new InvalidTimeException("secs",secs);
		this.secs = secs;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", mins=" + mins + ", secs=" + secs + "]";
	}
	
	
	
}
