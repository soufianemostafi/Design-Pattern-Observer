public class HexaObserver extends Observer{

   public HexaObserver(Counter counter){
      this.counter = counter;
      this.counter.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( counter.getState() ).toUpperCase() ); 
   }
}