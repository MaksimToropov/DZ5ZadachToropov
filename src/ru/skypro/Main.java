package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ������ 1
        int dog = 7;
        byte cat = 7;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAbult = dog > 10;
        char  bar = 35;
        System.out.println (dogIsAbult);

        // ������ 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weighOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer1 - boxer2;
        System.out.println ("����� ��� �������� " + weighOfAllBoxers);
        System.out.println ("������� � ���� �������� " + weightDifference);


        // ������ 3

        byte bananas = 5;
        int milkVolume = 200;
        byte iceCreamSundae = 2;
        byte rawEgge = 4;
        short bananasWeight = 80;
        int milkWeight = 105;
        int iceCreamSundaeWeight = 100;
        int rawEggeWeight = 70;
        int totalMilkWeight = (milkWeight * milkVolume) / 100;
        int totalWeight = (bananasWeight * bananas) + (totalMilkWeight) + (iceCreamSundae * iceCreamSundaeWeight) + (rawEgge * rawEggeWeight);
        double totalWeight1 = totalWeight / 1000.00;

        System.out.println ("��� ������� " + bananasWeight * bananas);
        System.out.println ("��� ������ " + totalMilkWeight);
        System.out.println ("��� ����������� " + iceCreamSundae * iceCreamSundaeWeight);
        System.out.println ("��� ��� " + rawEgge * rawEggeWeight);
        System.out.println ("����� ��� ��������� " + totalWeight1 + "��!");


        // ������ 4
        byte weightBusting = 7;
        short weightLoss = 250;
        short weightLoss2 = 500;
        int grPerKg = 1000 * weightBusting;
        int daysToLoseWeight = grPerKg / weightLoss;
        int daysToLoseWeight2 = grPerKg / weightLoss2;
        int averageNumberOfDays = (daysToLoseWeight + daysToLoseWeight2) / 2;
        System.out.println ("������ ������� ��������� " + daysToLoseWeight );
        System.out.println ("������ ������� ��������� " + daysToLoseWeight2 );
        System.out.println ("������� ���������� ���� ��� ��������� " + averageNumberOfDays);


        // ������ 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int numberOfMonths = 12;
        int mashaSum = mashaSalary / 10;
        int denisSum = denisSalary / 10;
        int kristinaSum = kristinaSalary / 10;
        int actualSalaryMasha = mashaSalary + mashaSum;
        int actualSalaryDenis = denisSalary + denisSum;
        int actualSalaryKristina = kristinaSalary + kristinaSum;
        int increseForTheYersMasha = mashaSum * numberOfMonths;
        int increaseForTheYersDenis = denisSum * numberOfMonths;
        int increaseForTheYersKristina = kristinaSum * numberOfMonths;
        System.out.println ("����������� �� ���� " + actualSalaryMasha);
        System.out.println ("����������� �� ������ " + actualSalaryDenis);
        System.out.println ("���������� �� �������� " + actualSalaryKristina);
        System.out.println ("���������� �� ��� ���� " + increseForTheYersMasha);
        System.out.println ("���������� �� ��� ����� " + increaseForTheYersDenis);
        System.out.println ("���������� �� ��� �������� " + increaseForTheYersKristina);

    }
}
