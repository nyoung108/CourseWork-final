
package libraryFunctions;
import java.util.UUID;
public class generateId {
     public static String uniqueId() {
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }
}
