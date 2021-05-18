public class Main{
	
	public static void main(String[] args){
		
		Adult ad1 = new Adult();
		ad1.setName("Billy White");
		ad1.setAge(30);
		ad1.setGender("male");
		ad1.setHeight(6.5f);
		ad1.setWeight(11.0f);
		ad1.setPpsNo("5645614F");
		ad1.setOccupation("Software Developer");
		ad1.setIsMarried(true);
		ad1.setIsCarOwner(true);
		
		System.out.println(ad1.toString());
		System.out.println(ad1.eat());
		System.out.println(ad1.drive() + "\n");
		
		Child cd1 = new Child();
		cd1.setName("Frank Davis");
		cd1.setAge(8);
		cd1.setGender("male");
		cd1.setHeight(1.5f);
		cd1.setWeight(3.0f);
		
		System.out.println(cd1.toString());
		System.out.println(cd1.eat());
		System.out.println(cd1.swim() + "\n");
		
		Baby clariss = new Baby();
		clariss.setName("Clariss Machado");
		clariss.setAge(0);
		clariss.setGender("female");
		clariss.setHeight(0.5f);
		clariss.setWeight(1.0f);
		clariss.setIsTeething(false);
		
		System.out.println(clariss.toString());
		System.out.println(clariss.sleep());
	}
}