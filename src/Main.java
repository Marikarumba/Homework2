public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        //Задача 3.
        System.out.println("Задача 3");
        dog = dog-3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        //Задача 4.
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog*= 10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var boxerWeight1= 78.2;
        var boxerWeight2= 82.7;
        var sumWeight=boxerWeight1+boxerWeight2;
        System.out.println("Общий вес двух бойцов:"+ sumWeight+"кг.");
        var differenceWeight=boxerWeight2-boxerWeight1;
        System.out.println("Разница в весе:"+differenceWeight+"кг.");

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница в весе:"+differenceWeight+"кг.");
        System.out.println("Остаток от деления:"+boxerWeight2%boxerWeight1);

        //Задача 8
        System.out.println("Задача 8");
        var totalTime = 640;
        var dayTime= 8;
        var employees=totalTime/dayTime;
        System.out.println("Всего работников в компании:"+employees+" человек.");
        var employeeNew=employees+94;
        var totalTimeNew=employeeNew*dayTime;
        System.out.println("Если в компании работает "+employeeNew+" человека, то всего "+ totalTimeNew+" часов работы может быть поделено между сотрудниками.");
    }
}
