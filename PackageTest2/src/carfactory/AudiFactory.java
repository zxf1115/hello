package carfactory;
import car.*;
public class AudiFactory implements CarFactory{
	public Car createCar(){
		return new Audi();
	}
}