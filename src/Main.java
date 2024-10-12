public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 783789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task 2
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task 3
        dog = dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Task 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        //Task 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(friend);
        frog=frog+4;
        System.out.println(frog);
        //Task 6
        var weightBoxerOne=78.2;
        var weightBoxerTwo=82.7;
        var weightBothBoxers=weightBoxerOne+weightBoxerTwo;
        var differenceWieghtBoxers=weightBoxerTwo-weightBoxerOne;
        System.out.println(weightBothBoxers);
        System.out.println(differenceWieghtBoxers);
        //Task 7
        var remainsWieghtBoxers=weightBoxerTwo % weightBoxerOne;
        System.out.println(remainsWieghtBoxers);
        //Task 8
        var timeWork = 640;
        var timeWorkOneWorker=8;
        var numberWorkers=timeWork/timeWorkOneWorker;
        System.out.println("Всего работников в компании - " + numberWorkers + " человек");
        numberWorkers=numberWorkers+94;
        timeWork=numberWorkers*timeWorkOneWorker;
        System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");


    }
}