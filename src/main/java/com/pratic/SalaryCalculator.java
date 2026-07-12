package com.pratic;

public class SalaryCalculator {
    private int bonus;
    public double salaryMultiplier(int daysSkipped) {
        double gap = (daysSkipped < 5) ? 1.0 : 0.85;
        return gap;
    }

    public int bonusMultiplier(int productsSold) {
        int bonus = (productsSold < 20) ? 10 : 13;
        return bonus;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000;

        double salary = baseSalary * salaryMultiplier(daysSkipped);

        double calcSalary = salary += bonusForProductsSold(productsSold);

        double realSalary = (calcSalary > 2000) ? 2000 : calcSalary;
        return realSalary;
    }
}
