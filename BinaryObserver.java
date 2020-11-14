public class BinaryObserver extends Observer{

   public BinaryObserver(Counter counter){
      this.counter = counter;
      this.counter.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( counter.getState() ) ); 
   }

}