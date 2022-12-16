import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie {

	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	
	}

	Scanner scan = new Scanner(System.in);

	@Override
	public void play() {
		System.out.println("Please select a scene (1-3)");
		printScenes();
		int select = scan.nextInt();
		System.out.println(scenes.get(select-1));

	}

}