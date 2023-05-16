import ru.netology.statistic.StatisticsService;

public class Main {
    public static void main(String[] args) {

        StatisticsService service = new StatisticsService();
        long resultFindMax = service.findMax(new long[]{12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12});
        System.out.println(resultFindMax);

        long resultFindMaxWhenMaxInMiddle = service.findMax(new long[]{12, 5, 8, 4, 50, 3, 8, 6, 11, 11, 12});
        System.out.println(resultFindMaxWhenMaxInMiddle);
    }
}