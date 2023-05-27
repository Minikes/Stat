package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(long[] sales) {
        long sum = 0;
        int allSales;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        allSales = (int) sum;

        return allSales;
    }

    public int averageSalesAmount(long[] sales) {
        int a = sumOfAllSales(sales);
        int average = a / 12;
        return average;
    }

    public int peakSales(long[] sales) {
        long peak = sales[0];
        int peakS = 0;
        for (long p : sales) {
            if (p > peak) {
                peak = p;
            }
            peakS = (int) peak;
        }
        return peakS;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales){
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int belowTheAverage(long[] sales){
        int monthBelow = 0;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] < averageSalesAmount(sales)){
                monthBelow++;
            }
        }
        return monthBelow;
    }

    public int aboveTheAverage(long[] sales){
        int monthAbove = 0;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] < averageSalesAmount(sales)){
                monthAbove++;
            }
        }
        return monthAbove;
    }
}

