package training_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Task implements Comparator<Task>{
	private int maCV;
	private String tenCV;
	private String timeBD;
	private String timeKT;

	public Task() {
		super();
	}

	public Task(int maCV, String tenCV, String timeBD, String timeKT) {
		super();
		this.maCV = maCV;
		this.tenCV = tenCV;
		this.timeBD = timeBD;
		this.timeKT = timeKT;
	}

	public int getMaCV() {
		return maCV;
	}

	public void setMaCV(int maCV) {
		this.maCV = maCV;
	}

	public String getTenCV() {
		return tenCV;
	}

	public void setTenCV(String tenCV) {
		this.tenCV = tenCV;
	}

	public String getTimeBD() {
		return timeBD;
	}

	public void setTimeBD(String timeBD) {
		this.timeBD = timeBD;
	}

	public String getTimeKT() {
		return timeKT;
	}

	public void setTimeKT(String timeKT) {
		this.timeKT = timeKT;
	}

	@Override
	public String toString() {
		return this.maCV + " " + this.tenCV + " " + this.timeBD + " " + this.timeKT;
	}

	public long timeTre(Task task2) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		long sub = 0;
		try {
			Date date1 = format.parse(this.timeKT);
			Date date2 = format.parse(task2.getTimeBD());
			sub = date2.getTime() - date1.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			return sub;
		}
	}

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getTimeBD().compareTo(o2.getTimeBD());
	}
}
