public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   private SingleObject(){}

   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("ayyylmao!");
   }
}


// only one object can be made of the class (class cant be instantiated: represent as or by an instance.)
// There is only one object it can possibly get. because it is public class -> private static INSTANCE -> private CLASS
