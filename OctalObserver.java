public class OctalObserver extends Observer{

   public OctalObserver(Counter counter){
      this.counter = counter;
      this.counter.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( counter.getState() ) ); 
   }
}