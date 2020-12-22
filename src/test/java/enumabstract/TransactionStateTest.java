package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionStateTest {

    @Test
    public void testIsCompleted(){

        HasTransactionState hasTransactionState = TransactionState.PENDING;
        assertFalse(hasTransactionState.isCompleted());
    }
}
