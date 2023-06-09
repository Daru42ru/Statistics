import org.example.StatisticsService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {
    @Test
    public void findMaxFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 12};
        long expected = 30;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
