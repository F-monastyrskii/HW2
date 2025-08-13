public class Main {
    public static void main(String[] args) {
        //1 - объявление и вывод переменных
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println("1st task" + "\ndog: " + dog + "\ncat: " + cat + "\npapper: " + papper);
        //2 - увеличение значения каждой переменной на 4
        dog = (dog+4); cat = (cat+4); papper = (papper+4);
        System.out.println("2nd task"  + "\ndog: " + dog + "\ncat: " + cat + "\npapper: " + papper);
        //3 - reducing value of each variable by a certain amount//
        dog = ((dog) - 3.5); cat = ((cat) - 1.6); papper = ((papper) - 7639);
        System.out.println("3rd task"  + "\ndog: " + dog + "\ncat: " + cat + "\npapper: " + papper);
        //4- объявление новой переменной, её вывод, вывод результатов арифметических действий
        var friend = 19;
        System.out.println("4th task" + "\nfriend: " + friend);
        friend = (friend + 2);
        System.out.println("friend: " + friend);
        friend = (friend / 7);
        System.out.println("friend: " + friend);
        //5 - объявление новой переменной, её вывод, вывод результатов арифметических действий
        var frog = 3.5;
        System.out.println("5th task" + "\nfrog: " + frog);
        frog = (frog * 10);
        System.out.println("frog: " + frog);
        frog = (frog / 3.5);
        System.out.println("frog: " + frog);
        frog = (frog + 4);
        System.out.println("frog: " + frog);
        //6 - Подсчёт и вывод общей массы бойцов, подсчёт и вывод разницы массы бойцов
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("6th task" + "\ntotal mass of fighters = " + (boxer1+boxer2));
        var diff = Math.abs(boxer1 - boxer2);
        System.out.println("the difference between two fighters is "+ (diff));
        //7 - вывод остатка от деления
        var reminder = (boxer2 % boxer1);
        System.out.println("6th task" + "\nReminder of division is " + reminder);
        //8.1 - подсчёт числа сотрудников компании при 640 часах работы
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = (totalHours / hoursPerEmployee);
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");
        //8.2 - подсчёт возможного общего количества рабочих часов при увеличении числа сотрудников, работающих по 8 часов
        var additionalEmployees = 94;
        var updatedNumberOfEmployees = numberOfEmployees + additionalEmployees;
        var updatedTotalHours = updatedNumberOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + updatedNumberOfEmployees +
                " человек, то всего " + updatedTotalHours +
                " часов работы может быть поделено между сотрудниками");
    }
}