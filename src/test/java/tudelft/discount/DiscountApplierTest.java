package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DiscountApplierTest {

    @Test
    void test() {

        Product h = new Product("pHome", 100.0, "HOME");
        Product b = new Product("pBusness", 100.0, "BUSINESS");

        ProductDao mock = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(h,b);
        Mockito.when(mock.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(mock);
        discountApplier.setNewPrices();


        Assertions.assertEquals(90.0, h.getPrice());
        Assertions.assertEquals(110.0, b.getPrice());

    }

}
