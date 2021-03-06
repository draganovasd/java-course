package Car;

public class Car {
	private int price;
	
	public Car(){
		this.price=0;
	}

	public Car(int price) {
		this();
		setPrice(price);
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return this.price;
	}
	public void printPrice(){
		System.out.println("The price of the car is: "+price);
	}

	public static void main(String[] args) {
		Car[] MyNewCar = new Car[10];
		MyNewCar[0] = new Automobile(10000,8 );
		MyNewCar[1] = new Automobile(6000, 7 );
		MyNewCar[2] = new Automobile(1000, 10);
		MyNewCar[3] = new Automobile(13000,6 );
		MyNewCar[4] = new Automobile(90000,5 );
		MyNewCar[5] = new SUV(16325, true);
		MyNewCar[6] = new SUV(7069, false);
		MyNewCar[7] = new SUV(20004, false);
		MyNewCar[8] = new SUV(9865, false);
		MyNewCar[9] = new SUV(100000, true);
		sort(MyNewCar);
		print(MyNewCar);
	}
	public static void sort(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length - 1; j++) {
				if (cars[j].getPrice() > cars[j + 1].getPrice()) {
					int temp = cars[j + 1].getPrice();
					cars[j + 1].setPrice(cars[j].getPrice());
					cars[j].setPrice(temp);
				}
			}
		}

	}

	public static void print(Car[] cars) {
		for (int i = 5; i < 10; i++) {
			cars[i].printPrice();
			((SUV) cars[i]).printHighly();
		}
		for (int j = 0; j < 5; j++) {
			cars[j].printPrice();
			((Automobile) cars[j]).printFuelAndExpense();
		}


	}

}
