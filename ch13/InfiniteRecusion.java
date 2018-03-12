import java.util.ArrayList;
import java.util.List;

public class InfiniteRecusion{
    public String toString(){
        // return "InfiniteRecusion address: " + this + "\n";
        return "InfiniteRecusion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecusion> v = new ArrayList<InfiniteRecusion>();
        for(int i = 0; i < 10; i++){
            v.add(new InfiniteRecusion());
        }
        System.out.println(v);
    }
}