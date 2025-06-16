package Motors;

import java.util.ArrayList;

public class readCars {

	public static void main(String[] args) {
		ArrayList<Cars> val = new ArrayList<>();
		val.add(new Cars("2014", "Scorpio"));

		Cars car = new Cars("2019", "Honda Creta");
		Cars car1 = new Cars("2020", "Honda Amaze");
		Cars car2 = new Cars("2021", "Hyundai Verna");
		val.add(car);
		val.add(car1);
		val.add(car2);
		printcars(val);

	}
	public static void printcars(ArrayList<Cars> somelist) {
		for(int i=0;i<somelist.size();i++) {
			System.out.println("Name of car "+somelist.get(i).getCarName());
		}
	}
}
