import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AptekaTest {

    @Test
    void testGetFullInfo() {
        Apteka apteka = new Apteka("TestApteka", new String[]{"A", "B"}, new double[]{10, 20});
        String expected = "Название аптеки: TestApteka\n" +
                "Лекарства: [A, B]\n" +
                "Цены: [10.0, 20.0]\n";
        assertEquals(expected, apteka.getFullInfo());
    }

    @Test
    void testGetMostExpensiveMedicinePrice() {
        Apteka apteka1 = new Apteka("Apteka1", new String[]{"A", "B", "C"}, new double[]{10, 20, 30});
        assertEquals(30, apteka1.getMostExpensiveMedicinePrice());

        Apteka apteka2 = new Apteka("Apteka2", new String[]{"A", "B"}, new double[]{50, 10});
        assertEquals(50, apteka2.getMostExpensiveMedicinePrice());

        Apteka apteka3 = new Apteka("Apteka3", new String[]{}, new double[]{});
        assertEquals(0, apteka3.getMostExpensiveMedicinePrice());

        Apteka apteka4 = new Apteka("Apteka4", new String[]{"A"}, new double[]{100});
        assertEquals(100, apteka4.getMostExpensiveMedicinePrice());
    }

    @Test
    void testGetTotalCost() {
        Apteka apteka1 = new Apteka("Apteka1", new String[]{"A", "B", "C"}, new double[]{10, 20, 30});
        assertEquals(60, apteka1.getTotalCost());

        Apteka apteka2 = new Apteka("Apteka2", new String[]{"A", "B"}, new double[]{50, 10});
        assertEquals(60, apteka2.getTotalCost());

        Apteka apteka3 = new Apteka("Apteka3", new String[]{}, new double[]{});
        assertEquals(0, apteka3.getTotalCost());

        Apteka apteka4 = new Apteka("Apteka4", new String[]{"A"}, new double[]{100});
        assertEquals(100, apteka4.getTotalCost());
    }

    @Test
    void testEmptyMedicine() {
        Apteka apteka = new Apteka("EmptyApteka", new String[0], new double[0]);
        assertEquals(0.0, apteka.getMostExpensiveMedicinePrice(), 0.001);
        assertEquals(0.0, apteka.getTotalCost(), 0.001);
    }

    @Test
     void testSingleMedicine() {
        Apteka apteka = new Apteka("SingleApteka", new String[]{"Test"}, new double[]{55.0});
        assertEquals(55.0, apteka.getMostExpensiveMedicinePrice(), 0.001);
        assertEquals(55.0, apteka.getTotalCost(), 0.001);
    }

     @Test
     void testManyMedicine() {
         Apteka apteka = new Apteka("ManyApteka", new String[]{"A", "B", "C", "D"}, new double[]{10.5, 25.0, 15.5, 30.0});
         assertEquals(30.0, apteka.getMostExpensiveMedicinePrice(), 0.001);
         assertEquals(81.0, apteka.getTotalCost(), 0.001);
     }
}