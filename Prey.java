
public class Prey {
   private int prey_x;
   private int prey_y;
     private final int RAND_POS=30;
    private final int DOT_SIZE=20;
    public Prey()
    {
    }  
    public void generateLocation(){
    // Method for  generating the location of the prey
     int r = (int) (Math.random() * RAND_POS);
        prey_x = ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        prey_y = ((r * DOT_SIZE));
}
public void render(){
    //method for rendering the images
}
private void initializeImages(){
    //Method for initializing the images
}
}
