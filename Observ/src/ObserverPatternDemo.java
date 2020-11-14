public class ObserverPatternDemo {
   public static void main(String[] args) {
      Counter counter = new Counter();

      new HexaObserver(counter);
      new OctalObserver(counter);
      new BinaryObserver(counter);

      System.out.println("Premier changement d'etat: 15");	
      counter.setState(15);
      System.out.println("Dexuieme changement d'etat: 10");	
      counter.setState(10);
   }
}