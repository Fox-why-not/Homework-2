public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("значение dog равняется " + dog);
        System.out.println("значение cat равняется " + cat);
        System.out.println("значение paper равняется " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("теперь значение dog равняется " + dog);
        System.out.println("теперь значение cat равняется " + cat);
        System.out.println("теперь значение paper равняется " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("а после уменьшения значение dog равняется " + dog);
        System.out.println("значение cat равняется " + cat);
        System.out.println("значение paper равняется " + paper);
        var friend=19;
        System.out.println("значение friend равняется " + friend);
        friend=friend + 2;
        System.out.println("значение friend равняется " + friend);
        friend=friend / 7;
        System.out.println("значение friend равняется " + friend);
        var frog=3.5;
        System.out.println("значение frog равняется " + frog);
        frog=frog * 10;
        System.out.println("значение frog равняется " + frog);
        frog=frog / 3.5;
        System.out.println("значение frog равняется " + frog);
        frog=frog +4;
        System.out.println("значение frog равняется " + frog);
        var Boxer1=78.2;
        var Boxer2=82.7;
        var TotalBoxersWeight= Boxer1 + Boxer2;
        System.out.println("общий вес бойцов составит " + TotalBoxersWeight + " Кг.");
        var WeightDifference=Boxer2 % Boxer1;
        System.out.println("Разница в весе бойцов составляет " + WeightDifference + " Кг.");
        var TotalTime=640;
        var TimeSolo=8;
                var NumberOfEmployers= TotalTime / TimeSolo;
        System.out.println("Всего в компании работает - " + NumberOfEmployers + " Человек.");
        var NumbTeoreticEmployers= NumberOfEmployers + 94;
var NewTotalTime=NumbTeoreticEmployers * 8;
System.out.println("Если в компании работает " + NumbTeoreticEmployers + " Человек, то всего " + NewTotalTime + " Часоа работы может быть поделено между сотрудниками");
    }
}