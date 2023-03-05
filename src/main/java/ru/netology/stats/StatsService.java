package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int bellowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;
            }
        }
        return count;
    }
    public int aboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;
            }
        }
        return count;
    }
}
