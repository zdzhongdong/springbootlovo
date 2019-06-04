
public class tb extends Thread {
	private static int i;
	public tb() {
		i=200;
	}
	public void run() {
		while(i<100) {
			i++;
		}
		System.out.println(i);
	}
	public static void main(String[] args) {
		tb tb1 = new tb();
		tb1.start();
		tb tb2 = new tb();
		tb2.start();
		tb tb3=new tb();
		tb3.i=50;
		tb3.start();
		
	}

}
