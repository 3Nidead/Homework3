public class Main {
    public static void main(String[] args) {
        //Задача1
        int apple = 45000;
        byte pineapple = 11;
        short lime = 13333;
        long fruits = 54883727223123L;
        float potato = 15.772376F;
        double tomato = 177.2132895473;
        System.out.println("Значение переменной apple " + "c типом int" + " равно " + apple);
        System.out.println("Значение переменной pineapple " + "c типом byte" + " равно " + pineapple);
        System.out.println("Значение переменной lime " + "c типом short" + " равно " + lime);
        System.out.println("Значение переменной fruits " + "c типом long" + " равно " + fruits);
        System.out.println("Значение переменной potato " + "c типом float" + " равно " + potato);
        System.out.println("Значение переменной tomato " + "c типом double" + " равно " + tomato);

        //Задача2
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Задача3
        byte lydmilaClass = 23;
        byte annaClass = 27;
        byte ekaterinaClass = 30;
        int allStudents = lydmilaClass + annaClass + ekaterinaClass;
        short totalPaper = 480;
        int paperPerStudent = totalPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        //Задача4
        byte machinePerformanceInTwoMinutes = 16;
        int inTwentyMinutes = (machinePerformanceInTwoMinutes / 2) * 20;
        System.out.println("За 20 минут " + "машина произвела " + inTwentyMinutes + " штук бутылок");
        int inOneDay = 24 * 60 * (machinePerformanceInTwoMinutes / 2);
        System.out.println("За 1 сутки " + "машина произвела " + inOneDay + " штук бутылок");
        int inThreeDays = inOneDay * 3;
        System.out.println("За 3 дня " + "машина произвела " + inThreeDays + " штук бутылок");
        int oneMonth = inThreeDays * 10;
        System.out.println("За 1 месяц " + "машина произвела " + oneMonth + " штук бутылок");

        //Задача5
        byte totalCansOfPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass =4;
        int oneClassCanOfPaint = whitePaintPerClass + brownPaintPerClass;
        int totalClasses = totalCansOfPaint / oneClassCanOfPaint;
        int whitePaintTotal = totalClasses * whitePaintPerClass;
        int brownPaintTotal = totalClasses * brownPaintPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

        //Задач6
        byte banana = 5;
        byte oneBananaWeight = 80;
        short milkMl = 200;
        byte hundredMl = 105;
        int milk = milkMl / 100;
        byte iceCream = 2;
        byte oneIceCreamWeight = 100;
        byte egg = 4;
        byte oneEggWeight = 70;
        int totalWeightInGrams = banana*oneBananaWeight+hundredMl*milk+iceCream*oneIceCreamWeight+egg*oneEggWeight;
        System.out.println("Вес завтрака составляет " + totalWeightInGrams + " грамм");
        short inOneKiloGrams = 1000;
        double totalWeightInKilo = (double) totalWeightInGrams / inOneKiloGrams;
        System.out.println("Вес завтрака составляет " + totalWeightInKilo + " килограмм");

        //Задача7
        byte totalWightInKiloToLose = 7;
        short oneKiloInGrams = 1000;
        int totalWeightInGramsToLose = totalWightInKiloToLose * oneKiloInGrams;
        short loseWeightA = 250;
        short loseWeightB = 500;
        int daysToLoseWeightA = totalWeightInGramsToLose/loseWeightA;
        int daysToLoseWeightB = totalWeightInGramsToLose/loseWeightB;
        int averageValue = (daysToLoseWeightA + daysToLoseWeightB) / 2;
        System.out.println("Если спортсмен будет худеть каждый день на 250 грамм, то у него уйдет " + daysToLoseWeightA + " дней");
        System.out.println("Если спортсмен будет худеть каждый день на 500 грамм, то у него уйдет " + daysToLoseWeightB + " дней");
        System.out.println("В среднем, для достижения результата, может понадобиться " + averageValue + " день");

        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        short salaryIncrease = 10;
        int salaryIncreaseMasha = salaryMasha * salaryIncrease / 100 + salaryMasha;
        int salaryIncreaseDenis = salaryDenis * salaryIncrease / 100 + salaryDenis;
        int salaryIncreaseKristina = salaryKristina * salaryIncrease / 100 + salaryKristina;
        int annualIncomeMashaBefore = salaryMasha * 12;
        int annualIncomeMashaAfter = salaryIncreaseMasha * 12;
        int differenceMasha = annualIncomeMashaAfter - annualIncomeMashaBefore;
        int annualIncomeDenisBefore = salaryDenis * 12;
        int annualIncomeDenisAfter = salaryIncreaseDenis * 12;
        int differenceDenis = annualIncomeDenisAfter - annualIncomeDenisBefore;
        int annualIncomeKristinaBefore = salaryKristina * 12;
        int annualIncomeKristinaAfter = salaryIncreaseKristina * 12;
        int differenceKristina = annualIncomeKristinaAfter - annualIncomeKristinaBefore;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей." + "Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей." + "Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей." + "Годовой доход вырос на " + differenceKristina + " рублей");








    }
}
