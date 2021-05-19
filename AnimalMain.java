public class AnimalMain{

     public static void main(String[] args){
        Animal a1 = new Animal();
        a1.updateNoOfAnimals();

       Animal a2 = new Animal();
       Animal.updateNoOfAnimals();

       Animal a3 = new Animal();
       a3.updateNoOfAnimals();

       System.out.println(a1.getNoOfAnimals());

}// main

}// class

