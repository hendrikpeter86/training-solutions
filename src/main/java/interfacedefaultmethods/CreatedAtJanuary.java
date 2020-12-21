package interfacedefaultmethods;

import java.time.LocalDateTime;

public interface CreatedAtJanuary {
    LocalDateTime getCreateAt();
    boolean createdAfter(LocalDateTime dateTime);
}
