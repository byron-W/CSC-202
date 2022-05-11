public class Tracker1 implements NumTrackerInterface {
	protected int count, sum;
	protected double average;

	public Tracker1(int count, int sum, double average) {
		this.count = count;
		this.sum = sum;
		this.average = average;
	}

	public void add(int a) {
		sum += a;
		count++;
		average = (double) sum / count;
		System.out.println("Number (" + a + ") added to data set 1");
		System.out.println("New values for " + toString());
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return average;
	}

	public int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "Tracker 1\nCount: " + count + "\nSum: " + sum +"\nAverage: " + average;
	}
}
