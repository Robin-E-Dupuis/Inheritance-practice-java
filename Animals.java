public class Animals {

   public void cat(){
       System.out.println("You invoked a cat");
   }
   public void dog(){
       System.out.println("You invoked a dog");
   }
    public static void main(String[] args) {
        cat Cat = new cat();
        Cat.setWhiskers(true);
        Cat.setNumberOfCats(10);
        System.out.println(Cat);
        
        dog Dog = new dog();
        Dog.setCute(true);
        Dog.setRace("French");
        Dog.setWeight(20);
        System.out.println(Dog);
    }
  }
