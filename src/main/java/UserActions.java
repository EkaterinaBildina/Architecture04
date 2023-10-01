import java.time.LocalDateTime;
import java.util.Date;

interface UserActions {
    boolean authorize(String username, String password);
    boolean selectRoute(String routeId, LocalDateTime time);

    boolean selectRoute(String routeId, Date time);


}