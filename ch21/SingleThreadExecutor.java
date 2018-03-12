import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor{
    public static void main(String[] args) {
        ExecutorService eService = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 5; i++){
            eService.execute(new LiftOff());
        }

        eService.shutdown();
    }
}