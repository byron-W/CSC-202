public class Tracker2 implements NumTrackerInterface {
	protected int count, sum;

	public Tracker2(int count, int sum) {
		this.count = count;
		this.sum = sum;
	}

	public void add(int a) {
		sum += a;
		count++;
		System.out.println("Number (" + a + ") added to data set 2");
		System.out.println("New values for " + toString());
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return (double) sum / count;
	}

	public int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "Tracker 2\nCount: " + count + "\nSum: " + sum +"\nAverage: " + (double) sum / count;
	}
}