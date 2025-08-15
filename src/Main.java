public class Main {
    public static void main(String[] args) {
        //1st task
        int i = 0;
        byte b = 0;
        short s = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        System.out.printf("\nЗначение переменной i с типом int равно " + i +
                "\nЗначение переменной b с типом byte равно " + b +
                "\nЗначение переменной s с типом short равно " + s +
                "\nЗначение переменной l с типом long равно " + l +
                "\nЗначение переменной f с типом float равно " + f +
                "\nЗначение переменной d с типом double равно " + d );
        //2nd task
        i = 569;
        b = 67;
        s = -159;
        l = 987678965549L;
        f = 2.786f;
        d = 27.12;
        System.out.printf("\nЗначение переменной i с типом int равно " + i +
                "\nЗначение переменной b с типом byte равно " + b +
                "\nЗначение переменной s с типом short равно " + s +
                "\nЗначение переменной l с типом long равно " + l +
                "\nЗначение переменной f с типом float равно " + f +
                "\nЗначение переменной d с типом double равно " + d );
        //3rd task
        var pupilsLP = 23;
        var pupilsAS = 27;
        var pupilsEA = 30;
        var paperListTotal = 480;
        var paperListPerPupil = paperListTotal / (pupilsLP + pupilsAS + pupilsEA);
        System.out.println("\nНа каждого ученика рассчитано " + paperListPerPupil + " листов бумаги ");
        //4th task
        var perTwoMinutesProductivity = 16;
        var perTwentyMinutesProductivity = perTwoMinutesProductivity * 10;
        var perDayProductivity = perTwentyMinutesProductivity * 72;
        var perThreeDaysProductivity = perDayProductivity * 3;
        var perMonthProductivity = (perThreeDaysProductivity * 10) + perDayProductivity;//при условии если речь идёт
        // про месяц в котором 31 день ( Январь, март, май, июль, август, октябрь и декабрь)
        System.out.println("За 2 минуты машина произвела " + perTwoMinutesProductivity + " штук бутылок»");
        System.out.println("За 20 минут машина произвела " + perTwentyMinutesProductivity + " штук бутылок»");
        System.out.println("За день машина произвела " + perDayProductivity + " штук бутылок»");
        System.out.println("За 3 дня машина произвела " + perThreeDaysProductivity + " штук бутылок»");
        System.out.println("За месяц машина произвела " + perMonthProductivity + " штук бутылок»");
        //5th task
        var whitePaintCanPerClass = 2;
        var brownPaintCanPerClass = 4;
        var amountOfClasses = 40;
        var whitePaintCanPerClassTotal = whitePaintCanPerClass * amountOfClasses;
        var brownPaintCanPerClassTotal = brownPaintCanPerClass * amountOfClasses;
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + whitePaintCanPerClassTotal + " банок белой краски и " + brownPaintCanPerClassTotal + " банок коричневой краски");
        //6th task
        var bananaNetWeightPerBreakfastGr = 5 * 80; //5бананов по 80 гр каждый
        var milkNetWeightPerBreakfastGr = 2 * 105; //200 мл молока (100 мл = 105 грамм)
        var iceCreamNetWeightPerBreakfastGr = 2 * 100; //2 брикета по 100 грамм
        var eggsNetWeightPerBreakfastGr = 4 * 70; //4 яйца (1 яйцо — 70 грамм)
        var netWeightPerBreakfastGr = bananaNetWeightPerBreakfastGr + milkNetWeightPerBreakfastGr + iceCreamNetWeightPerBreakfastGr + eggsNetWeightPerBreakfastGr;
        var netWeightPerBreakfastKg = netWeightPerBreakfastGr / 1000;
        var reminder = netWeightPerBreakfastKg % netWeightPerBreakfastGr;
        System.out.println("Масса нетто 1 порции завтрака составляет " + netWeightPerBreakfastGr + "грамм (" + netWeightPerBreakfastKg +"," + reminder + "кг)");
        //7th task
        var targetTotalWeightLossKg = 7;
        var easyWeightLossPerDayGr = 250;
        var hardWeightLossPerDayGr = 500;
        var weightLossPeriodEasy = targetTotalWeightLossKg * 1000 / easyWeightLossPerDayGr;
        var weightLossPeriodHard = targetTotalWeightLossKg * 1000 / hardWeightLossPerDayGr;
        var avarageWeightLossPeriod = (weightLossPeriodEasy + weightLossPeriodHard) / 2;
        System.out.println("\n" + weightLossPeriodEasy + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм." +
                "\n" + weightLossPeriodHard + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм." +
                "\nВ среднем чтобы добиться результата похудения потребуется " + avarageWeightLossPeriod + "день");
        //8th task
        var mashaPerMonthCurrent = 67760;
        var denisPerMonthCurrent = 83690;
        var kristinaPerMonthCurrent = 76230;
        var mashaPerMonthUpdated = mashaPerMonthCurrent * 1.1;
        var denisPerMonthUpdated = denisPerMonthCurrent * 1.1;
        var kristinaPerMonthUpdated = kristinaPerMonthCurrent * 1.1;
        var mashaYearDiff =  (mashaPerMonthUpdated - mashaPerMonthCurrent) * 12;
        var denisYearDiff =  (denisPerMonthUpdated - denisPerMonthCurrent) * 12;
        var kristinaYearDiff = (kristinaPerMonthUpdated - kristinaPerMonthCurrent) * 12;
        //в выводе стоит выполнить приведение к типу иначе в выводе будут некоректно отображаться полученные значения
        System.out.println("Маша теперь получает " + (int)mashaPerMonthUpdated + " рублей. Годовой доход вырос на " + (int)mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + (int)denisPerMonthUpdated + " рублей. Годовой доход вырос на " + (int)(denisYearDiff) + " рублей");
        System.out.println("Кристина теперь получает " + (int)kristinaPerMonthUpdated + " рублей. Годовой доход вырос на " + (int)(kristinaYearDiff) + " рублей");
    }
}