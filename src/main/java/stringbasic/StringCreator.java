package stringbasic;

public class StringCreator {
    public String createStringForHeap(){
        return new String("for heap");
    }

    public String createStringForPool(){
        return "for pool";
    }
}
