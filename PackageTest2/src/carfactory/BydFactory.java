package carfactory;
import car.*;
public class BydFactory implements CarFactory{
	public Car createCar(){
		return new Byd();
	}
}