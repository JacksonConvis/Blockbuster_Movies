import java.util.ArrayList;

public class VHS extends Movie {
	ArrayList<String> scenes = new ArrayList<String>();
	static int currentTime = 0;

	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		
	}

	@Override
	public void play() {
		System.out.println(scenes.get(currentTime));
		currentTime++;
		if (currentTime > scenes.size()) {
			rewind();
		}

	}

	public static void rewind() {
		currentTime = 0;
	}

}