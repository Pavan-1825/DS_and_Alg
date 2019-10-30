package Chapter_2;

public class FibonacciProgression extends Progression{

    protected long prev;

    public FibonacciProgression(){
        this(0,1);
    }

    public FibonacciProgression(long first, long second){

        prev = second - first;
    }

    // In this method we're saving the previous value is storing in temporary variable
    // and adding with current to produce fibanacci number.. process continues for other values
    protected void advance(){

        long temp = prev;
        prev = current;
        current += temp;
    }
}
