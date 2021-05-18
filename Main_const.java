public class Main{
	public static void main(String[] args){
		
			
		Car c1 = new Car("Subaru", 53.45f, "89C45", true);
		
		
		System.out.println(c1.toString());
		System.out.println(c1.accelerate());
		System.out.println(c1.brake());
		
		
		Car c2 = new Car();
		
		
		c2.setManufacturer("Toyota");
		c2.setEngineSize(45.44f);
		c2.setRegisNo("90C4343");
		c2.setNtc(true);
		
		System.out.println(c2.toString());
		System.out.println(c2.accelerate());
		System.out.println(c2.brake());
		
		System.out.println(Car.getNoCarsProduced());
		
		Truck t1 = new Truck("Ford");
		
		System.out.println(t1.toString());
		System.out.println(t1.accelerate());
		System.out.println(t1.brake());
	
		Truck t2 = new Truck();
		
		t2.setManufacturer("Hyundai");
		t2.setEngineSize(89.44f);
		t2.setRegisNo("99C4343");
		t2.setNtc(true);
		
		System.out.println(t2.toString());
		System.out.println(t2.accelerate());
		System.out.println(t2.brake());
	}
}