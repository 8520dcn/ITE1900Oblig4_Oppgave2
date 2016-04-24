
//Kilde: http://www.javawithus.com/programs/towers-of-hanoi
import java.util.Scanner;

public class TowersOfHanoi {

	private static Integer antFlytninger = 0;
	private static Integer antMetodeKall = 0;

	public void solve(int n, String start, String auxiliary, String end) {
		leggTilFlytning();
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			leggTilKall();
			solve(n - 1, start, end, auxiliary);
			System.out.println(start + " -> " + end);
			solve(n - 1, auxiliary, start, end);
		}
	}

	public static void main(String[] args) {
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.print("Skriv inn antall disker i tarnet: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towersOfHanoi.solve(discs, "A", "B", "C");
		System.out.println("Antall flytninger: " + antFlytninger);
		System.out.println("Antall rekursive kall: " + antMetodeKall);
	}

	private void leggTilFlytning() {
		antFlytninger++;
	}
	
	private void leggTilKall() {
		antMetodeKall++;
	}
}