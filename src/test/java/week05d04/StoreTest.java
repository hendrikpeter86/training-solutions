package week05d04;

import com.sun.source.tree.NewArrayTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    public void addProductTest(){
        List<Product> testList = new ArrayList<>();
        Store store = new Store(testList);

        assertFalse(store.addProduct(new Product("Milk", 2020, 11, 25)));

        assertTrue(store.addProduct(new Product("Milk", 2020, 12, 15)));
      //  assertFalse(store.addProduct(new Product("Milk", 2020, 12, 24)));

    }

    @Test
    public void getNumberOfExpired(){
        List<Product> testList = new ArrayList<>();
        testList.add(new Product("Milk", 2020, 01, 03));
        Store store = new Store(testList);

        assertEquals(1, store.getNumberOfExpired());

    }
}
