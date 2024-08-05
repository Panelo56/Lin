package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class LinesTest {

    @org.junit.jupiter.api.Test
    void statisticSaleSum() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticSaleSum(sale);

        long expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleAverageMonth() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticSaleAverageMonth(sale);

        long expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleMax() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticSaleMax(sale);

        long expected = 8;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleMin() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticSaleMin(sale);

        long expected = 9;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticMonthUnderAverage(sale);

        long expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticMonthOverAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.statisticMonthOverAverage(sale);

        long expected = 5;
        assertEquals(expected, actual);
    }
}