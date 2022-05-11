public class NumTrackerInterfaceDriver {
	public static void main(String[] args) {
		Tracker1 t1 = new Tracker1(4, 8, 2);
		Tracker2 t2 = new Tracker2(10, 40);
		String str = "";
		String lnbreak = "\n-----------\n";
		str += t1.toString();
		str += lnbreak;
		str += t2.toString();
		System.out.println(str + "\n");
		t1.add(5);
		System.out.println(lnbreak);
		t2.add(3);
	}
}
