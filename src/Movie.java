import java.util.ArrayList;

public abstract class Movie {
	public String title;
	public int runTime;
	ArrayList<String> scenes;
	

	public Movie(String title, int runTime, ArrayList<String> scenes) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}

	public void printInfo() {
		System.out.println("Title: " + title + "\n" + "Runtime: " + runTime + " minutes");
	}

	public void printScenes(){
		System.out.println("Scenes:" + scenes.toString());
	}

	public abstract void play();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

}