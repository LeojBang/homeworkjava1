public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeightFirst = 78.2;
        var boxerWeightSecond = 82.7;
        var totalWeight = boxerWeightFirst + boxerWeightSecond;
        System.out.println(" Общая масса боксеров " + totalWeight + " кг ");
        var weightDifference = boxerWeightSecond - boxerWeightFirst;
        System.out.println(" Разница в весе составляет: " + weightDifference + " кг ");
        var weightBoxerDifference = boxerWeightSecond % boxerWeightFirst;
        System.out.println(" Разница в весе составляет: " + weightBoxerDifference + " кг ");

        var totalHours = 640;
        var hoursPerOne = 8;
        var totalPer = totalHours/hoursPerOne;
        System.out.println(" Всего работников в компании - " + totalPer + " человек ");
        var addPer = 94;
        totalPer = totalPer + addPer;
        totalHours = totalPer * 8;
        System.out.println(" Если в этой компании работает " + totalPer + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками ");
    }
}