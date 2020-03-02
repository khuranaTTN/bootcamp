import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
//Create a non maven project and add use log4j for logging.
public class Test2 {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("hi");
    }
}
