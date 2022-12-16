import java.util.ArrayList;
import java.util.Scanner;

public class Blockbuster {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Movie> films = new ArrayList<>();
		ArrayList<String> dvdscenes = new ArrayList<>();
		ArrayList<String> dvdscenes2 = new ArrayList<>();
		ArrayList<String> dvdscenes3 = new ArrayList<>();
		ArrayList<String> VHSscenes = new ArrayList<>();
		ArrayList<String> VHSscenes2 = new ArrayList<>();
		ArrayList<String> VHSscenes3 = new ArrayList<>();
		Movie dvd = new DVD("Avengers", 140, dvdscenes);
		Movie dvd2 = new DVD("The Hobbit", 180, dvdscenes2);
		Movie dvd3 = new DVD("The Batman", 150, dvdscenes3);
		Movie vhs = new VHS("Mrs Doubtfire", 125, VHSscenes);
		Movie vhs2 = new VHS("Alladin", 145, VHSscenes2);
		Movie vhs3 = new VHS("The Princess Bride", 90, VHSscenes3);
		dvdscenes.add("The Get Together");
		dvdscenes.add("Flying Ship Attack");
		dvdscenes.add("Alien war");
		films.add(dvd);
		dvdscenes2.add("Bag-End");
		dvdscenes2.add("Dwarves");
		dvdscenes2.add("Azog the Defiler");
		films.add(dvd2);
		dvdscenes3.add("The Penguin");
		dvdscenes3.add("The Riddler");
		dvdscenes3.add("The End");
		films.add(dvd3);
		VHSscenes.add("Divorce");
		VHSscenes.add("The Disguise");
		VHSscenes.add("The Reckoning");
		films.add(vhs);
		VHSscenes2.add("Arabian nights");
		VHSscenes2.add("Friend like me");
		VHSscenes2.add("Jafar's downfall");
		films.add(vhs2);
		VHSscenes3.add("Farm Boy");
		VHSscenes3.add("Inconceivable");
		VHSscenes3.add("Mostly Dead");
		films.add(vhs3);
		
		System.out.println("Welcome to Blockbuster! Please select a film (1-6)");
		dvd.printInfo();
		dvd2.printInfo();
		dvd3.printInfo();
		vhs.printInfo();
		vhs2.printInfo();
		vhs3.printInfo();
		int choice = scan.nextInt();
		films.get(choice-1).play();
		
		scan.close();
	}

}