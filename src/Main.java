public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        var friend = 19.0;
        System.out.println("friend = " +friend);
        friend *= 2;
        System.out.println("friend = " +friend);
        friend /= 7;
        System.out.println("friend = " +friend);

        var frog = 3.5;
        System.out.println("frog = " +frog);
        frog *= 10;
        System.out.println("frog = " +frog);
        frog /= 3.5;
        System.out.println("frog = " +frog);
        frog += 4;
        System.out.println("frog = " +frog);

        var WeightFirstBoxer = 78.2;
        var WeightSecondBoxer = 82.7;
        var TotalWeigtBoxer = WeightFirstBoxer + WeightSecondBoxer;
        var WeightDifferenceBoxer = TotalWeigtBoxer % WeightFirstBoxer;
        System.out.println("Общий вес двух бойцов " +TotalWeigtBoxer +" кг");
        System.out.println("Разница между весами бойцов " +WeightDifferenceBoxer +" кг");


    }
}