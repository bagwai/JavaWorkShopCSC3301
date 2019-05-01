 
interface Vehicle{
	//implements the exercise on interface of vehicle
	public void changeGear(int g);
	public void speedUp(int s);
	public void printState();
	//methods

	public int gear = 0;
	public int speed = 0;
	//variables
	} //<Interface>;

class Car implements Vehicle{
	//the Car class implementing the Vehicle interface
	public int gear;
	public int speed;
	Car(int gr, int sp){
		gear = gr; speed = sp;
	}
	@Override
	public void changeGear(int g){
		gear += g;
	}
	@Override
	public void speedUp(int s){
		speed += s;
	}
	@Override
	public void printState(){
		System.out.println("Car present state: \n Speed: " + speed + " Gear: " + gear);
	}
}

class Bike implements Vehicle{
	//the Bike class implementing the Vehicle interface
	public int gear;
	public int speed;
	Bike(int gr, int sp){
		gear = gr; speed = sp;
	}
	@Override
	public void changeGear(int g){
		gear += g;
	}
	@Override
	public void speedUp(int s){
		speed += s;
	}
	@Override
	public void printState(){
		System.out.println("Bike present state: \n Speed: " + speed + " Gear: " + gear);
	}
}

class Interface{
	public static void main(String[] args) {
		Vehicle mota = new Car(2,21);
		Vehicle keke = new Bike(3,23);
		//upcasting
		
		mota.speedUp(11);
		mota.changeGear(3);
		mota.printState();

		keke.speedUp(13);
		keke.changeGear(7);
		keke.printState();
	}
}
