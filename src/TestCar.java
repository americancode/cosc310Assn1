/**
 * COSC 310 Assignment1
 * TestCar.java
 * Instructor: Dr. Waleed Farag
 * 
 * This class tests the Car, Vehicle, Engine, Wheel, and Window classes
 * 
 * @author Nathaniel Churchill 03068120
 *
 */
public class TestCar {

	public static void main(String[] args) {
		//creating the Car objects
		Vehicle vehicleOne = new Car(new Engine(2400, 4, 16, 180), new Wheel(4, 265, 33), new Window(2, 45, 50), "Mercedes-Benz");
		Vehicle vehicleTwo = new Car(new Engine(), new Wheel(4, 225, 35), new Window(4, 50, 60), "Honda");
		
		//printing information for the first car
		System.out.println("Information about the first car\n\n");
		vehicleOne.displayWheelPressure();
		vehicleOne.displayWindowArea();
		vehicleOne.displayValveNumber();
		System.out.println("The horse power of the engine is " + vehicleOne.engine.getHorsePower() + "\n\n\n\n");
		
		
		//printing information for the second car
		System.out.println("Information about the second car\n\n");
		vehicleTwo.displayWheelPressure();
		vehicleTwo.displayWindowArea();
		vehicleTwo.displayValveNumber();
		System.out.println("The horse power of the engine is " + vehicleTwo.engine.getHorsePower());
		

	}
}
	
//Other classes


/**
 * This abstract class represents a "general" vehicle with the parts of an Engine, Wheel, and a Window
 */
abstract class Vehicle{
	//attributes
	protected Engine engine;
	protected Wheel wheel;
	protected Window window;
	
	/**
	 * A paremetized constructor for the abstract Vehicle
	 * @param engine An engine object
	 * @param wheel An wheel object
	 * @param window An window object
	 */
	public Vehicle(Engine engine, Wheel wheel, Window window){
		this.engine = engine;
		this.wheel = wheel;
		this.window = window;
	}
	
	/**
	 * This method prints the tire pressure
	 */
	public abstract void displayWheelPressure();
	
	/**
	 * This method prints the area of a  window
	 */
	public abstract void displayWindowArea();
	
	/**
	 * This method prints the number of valves
	 */
	public void displayValveNumber(){
		System.out.println("Vehicle Method: The number of valves is: " + engine.numberOfValves);
	}
	
}







/**
 * This class represents a car with an Engine, Wheel, Window, and extending the vehicle class
 */
class Car extends Vehicle{
	//attributes
	private String carMake;
	
	public Car(Engine engine, Wheel wheel, Window window, String carMake){
		super(engine, wheel, window);
		this.carMake = carMake;
		
	}
	

	@Override
	/**
	 * This method prints the wheel pressure
	 */
	public void displayWheelPressure() {
		System.out.println("The wheel pressure is " + super.wheel.getPressure());
	}

	@Override
	/**
	 * This method prints the window area
	 */
	public void displayWindowArea() {
		System.out.println("The area of the window is " + super.window.computeWindowArea());
	}
	
	@Override
	/**
	 * This method prints the number of valves
	 */
	public void displayValveNumber(){
		System.out.println("Car Method: The number of valves " + super.engine.numberOfValves);
	}
}















/**
 * This class represents a Wheel with attributes of number of wheels, the size of the wheels, 
 * and proper inflation pressure
 */
class Wheel{
	//attributes
	private int numberOfWheels;
	private int sizeOfWheels;
	private int tirePressure;
	
	/**
	 * a public parametized constructor that sets the attributes
	 * @param numWheels the number of wheels a car has
	 * @param wheelSize the size of the wheels of the car
	 * @param pressure the pressure of the tires of the car
	 */
	public Wheel (int numWheels, int wheelSize, int pressure){
		this.numberOfWheels = numWheels;
		this.sizeOfWheels = wheelSize;
		this.tirePressure = pressure;
	}
	
	/**
	 * This method returns the tire pressure (getter)
	 * @return the tire pressure
	 */
	public int getPressure(){
		return tirePressure;
	}
	
	/**
	 * This methods set the tire pressure (setter)
	 * @param pressure
	 */
	public void setPressure(int pressure){
		this.tirePressure = pressure;
	}
}











/**
 * This class represents a Engine with attributes of CC, number of cylinders, number of valves
 * and horse power
 */
class Engine{
	//attributes
	private int cylinderCapacityInCm;
	private int numberOfCylinders;
	protected int numberOfValves;
	private int horsePower;
	/**
	 * a no parameter constructor that sets some default values to the private attributes
	 */
	public Engine(){
		this.cylinderCapacityInCm = 1587;
		this.numberOfCylinders = 6;
		this.numberOfValves = 24;
		this.horsePower = 179;
	}
	
	/**
	 * 
	 * @param cc the cylinder capacity
	 * @param numCylinders the number of cylinders
	 * @param numValves the number of valves
	 * @param hp the horsepower
	 */
	public Engine(int cc, int numCylinders, int numValves, int hp){
		this.cylinderCapacityInCm = cc;
		this.numberOfCylinders = numCylinders;
		this.numberOfValves = numValves;
		this.horsePower = hp;
	}

	/**
	 * Returns the horsepower variable (getter)
	 * @return the amount of horsepower
	 */
	public int  getHorsePower(){
		return horsePower;
	}
	/**
	 * Sets the horse power variable (setter)
	 * @param hp
	 */
	public void setHorsePower(int hp){
		this.horsePower = hp;
	}
	
	/**
	 * This method starts the car
	 */
	public void start(){
		System.out.println("The car was started");
	}
	
	/**
	 * This method stops the car
	 */
	public void stop(){
		System.out.println("The car was stopped");
	}
}














/**
 * 
 * This class represents a window with the attributes of the width, height and number of windows
 *
 */
class Window{
	//attributes
	private int numberWindows;
	private int height;
	private int width;
	
	/**
	 * Parametized constructor
	 * @param numberWindows The number of windows the car has
	 * @param height The height of a window
	 * @param width The width of a window
	 */
	public Window(int numberWindows, int height, int width){
		this.numberWindows = numberWindows;
		this.height = height;
		this.width = width;
	}
	
	/**
	 * This method rolls the window up
	 */
	public void rollUp(){
		System.out.println("Window is being rolled up");
	}
	
	/**
	 * This method rolls down the window of the car
	 */
	public void rollDown(){
		System.out.println("Window is being rolled down");
	}
	
	/**
	 * This method computes the area of a window
	 * @return the height * width
	 */
	public int computeWindowArea(){
		return this.height * this.width;
	}
}



