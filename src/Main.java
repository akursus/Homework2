public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //Task 2
        System.out.println("Задание 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //Task 3
        System.out.println("Задание 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        //Task 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("friend = " +friend);
        friend += 2;
        System.out.println("friend = " +friend);
        friend /= 7;
        System.out.println("friend = " +friend);

        //Task 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog = " +frog);
        frog *= 10;
        System.out.println("frog = " +frog);
        frog /= 3.5;
        System.out.println("frog = " +frog);
        frog += 4;
        System.out.println("frog = " +frog);

        //Task 6
        System.out.println("Задание 6");
        var WeightFirstBoxer = 78.2;
        var WeightSecondBoxer = 82.7;
        var TotalWeigtBoxer = WeightFirstBoxer + WeightSecondBoxer;
        var WeightDifferenceBoxer = TotalWeigtBoxer % WeightFirstBoxer;
        System.out.println("Общий вес двух бойцов " +TotalWeigtBoxer +" кг");
        System.out.println("Разница между весами бойцов " +WeightDifferenceBoxer +" кг");

        //Task 7
        System.out.println("Задание 7");
        var WeightDifferenceBoxer1 = WeightSecondBoxer - WeightFirstBoxer;
        System.out.println("Разница между весами бойцов " +WeightDifferenceBoxer1 +" кг");
        var WeightDifferenceBoxer2 = WeightSecondBoxer % WeightFirstBoxer;
        System.out.println("Разница между весами бойцов " +WeightDifferenceBoxer2 +" кг");

        //Task 8
        System.out.println("Задание 8");
        var AllWorkingHours = 640;
        var WorkingHours = 8;
        var TotalWorkers = AllWorkingHours / WorkingHours;
        System.out.println("Всего работников в компании – " +TotalWorkers +" человек");
        var WorkersMore = 94;
        var TotalWorkersNew = TotalWorkers + WorkersMore;
        var AllWorkingHoursNew = TotalWorkersNew * WorkingHours;
        System.out.println("Если в компании работает " +TotalWorkersNew +" человека, то всего " +AllWorkingHoursNew +" часа работы может быть поделено между сотрудниками");

    }
}