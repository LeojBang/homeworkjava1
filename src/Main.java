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

        byte a = 5;
        short b = 10;
        int c = 15;
        long d = 20L;
        float e = 1.5234f;
        double f = 3.554543;
        System.out.println(" Значение переменной a с типом byte равно " + a);
        System.out.println(" Значение переменной b с типом short равно " + b);
        System.out.println(" Значение переменной c с типом int равно " + c);
        System.out.println(" Значение переменной d с типом long равно " + d);
        System.out.println(" Значение переменной e с типом float равно " + e);
        System.out.println(" Значение переменной f с типом double равно " + f);

       // float z = 27.12f;
       // long x = 987678965549L;
       // float v = 2.786f;
       // short n = 569;
      //  short m = -159;
      //  short s = 27897;
      //  byte h = 67;

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short papers = 480;
        int allClasses = (class1 + class2 + class3);
        int paperPerStudient = papers / allClasses;
        System.out.println(" На каждого ученика рассчитано " + paperPerStudient + " листов бумаги ");

        short boatlesPerMinute = 8;
        short boatlesPerMinutes20 = (short) (20 * boatlesPerMinute);
        System.out.println(" За 20 минут машина произвела " + boatlesPerMinutes20 + " штук бутылок ");
        short boatlesPerDay = (short) (boatlesPerMinute * 1440);
        System.out.println(" За cутки машина произвела " + boatlesPerDay + " штук бутылок ");
        int boatlesPer3Day = (boatlesPerMinute * 1440 * 3);
        System.out.println(" За 3 cуток машина произвела " + boatlesPer3Day + " штук бутылок ");
        int boatlesPer30Day = (boatlesPerMinute * 1440 * 30);
        System.out.println(" За 30 cуток машина произвела " + boatlesPer30Day + " штук бутылок ");

        short banokKraski = 120;
        short whitePerRoom = 2;
        short brownPerRoom = 4;
        short perRoom = (short) ( whitePerRoom + brownPerRoom);
        short rooms = (short) (banokKraski/perRoom);
        short whiteBanok = (short) (rooms * whitePerRoom);
        short brownBanok = (short) (rooms * brownPerRoom);
        System.out.println("В школе, где " + rooms + " классов, нужно " + whiteBanok + " банок белой краски и " + brownBanok + " банок коричневой краски.");

        byte weightBanana = 80;
        short milkWeight = 100;
        byte iceCream = 100;
        byte egg = 70;
        double breakestWeight = (weightBanana * 5) + (milkWeight * 1.05 * 2) + (iceCream * 2) + (egg * 4);
        System.out.println("Вес завтрака в граммах равен " + breakestWeight);
        breakestWeight = breakestWeight/1000;
        System.out.println("Вес завтрака в килограммах равен " + breakestWeight);

        short deficit1 = 250;
        short deficit2 = 500;
        byte goal = 7;
        short days1 = (short) (goal*1000/deficit1);
        short days2 = (short) (goal*1000/deficit2);
        short avgDays = (short) ((short) (goal*1000)/((deficit1+deficit2)/2));
        System.out.println(" Дней, чтобы похудеть при 250 граммах в неделю на 7 кг " + days1);
        System.out.println(" Дней, чтобы похудеть при 500 граммах в неделю на 7 кг " + days2);
        System.out.println(" Дней, чтобы похудеть в среднем на 7 кг " + avgDays);

        int paydayMasha = 67760;
        int paydayDenis = 83690;
        int paydayChris = 76230;
        float paydayBonus = 1.1f;
        int paydayMashaYear = paydayMasha * 12;
        int paydayDenisYear = paydayDenis * 12;
        int paydayChrisYear = paydayChris * 12;
        int paydayMashaBonus = (int) (paydayMasha * paydayBonus);
        int paydayDenisBonus = (int) (paydayDenis * paydayBonus);
        int paydayChrisBonus = (int) (paydayChris * paydayBonus);
        int paydayMashaBonusYear = paydayMashaBonus * 12;
        int paydayDenisBonusYear = paydayDenisBonus * 12;
        int paydayChrisBonusYear = paydayChrisBonus * 12;
        int paydayDiffMasha = paydayMashaBonusYear - paydayMashaYear;
        int paydayDiffDenis = paydayDenisBonusYear - paydayDenisYear;
        int paydayDiffChris = paydayChrisBonusYear - paydayChrisYear;

        System.out.println(" Маша теперь получает " + paydayMashaBonus + " Годовой доход вырос на " + paydayDiffMasha + " рублей ");
        System.out.println(" Денис теперь получает " + paydayDenisBonus + " Годовой доход вырос на " + paydayDiffDenis + " рублей ");
        System.out.println(" Кристина теперь получает " + paydayChrisBonus + " Годовой доход вырос на " + paydayDiffChris + " рублей ");

    }
}
