package interfacedefaultmethods;

import java.time.LocalDateTime;

public interface Audited {

    LocalDateTime getCreateAt();

    default boolean createdAfter(LocalDateTime dateTime){
        return getCreateAt().isAfter(dateTime);
    }
}
