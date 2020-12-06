package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductsByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("kifli", Category.BAKEDGOODS, 60),
                new Product("zsemle", Category.BAKEDGOODS, 40),
                new Product("joghurt", Category.DAIRY, 150),
                new Product("kefír", Category.DAIRY, 100),
                new Product("tej", Category.DAIRY, 250),
                new Product("domestos", Category.HOUSEKEEPING, 1500)
        ));

        assertEquals(2,store.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(1,store.getProductByCategoryName(Category.HOUSEKEEPING));
        assertEquals(3,store.getProductByCategoryName(Category.DAIRY));
    }


}


