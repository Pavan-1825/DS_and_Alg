package Chapter_2;

public class Progression {

    protected long current;

    public Progression(){
        this(0);
    }

    public Progression(long start){
        current = start;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    private void advance(){
        current++;
    }

    public void printSummary(int n){
        System.out.println(nextValue());
        for(int i=1; i<n; i++){
            System.out.println(" "+nextValue());
            System.out.println();
        }
    }
}
