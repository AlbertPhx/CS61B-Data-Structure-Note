public class Dog{
    public int weightInPonds;
    /** one integer constructor for dogs */
    public Dog(int w){
        weightInPonds = w;

    }

    public void makeNoise(){
        if(weightInPonds <10){
            System.out.println("yip!!");
        }else if (weightInPonds <30){
            System.out.println("bark!");
        }else{
            System.out.println("wooof!");
        }
    }
}

// @3