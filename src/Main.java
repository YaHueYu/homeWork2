public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("задание 1");
        var dogWeight = 8.0;
        System.out.println(dogWeight);

        var catWeight = 3.6;
        System.out.println(catWeight);

        var paperWeight = 763789;
        System.out.println(paperWeight);
        System.out.println("собачка " + dogWeight + " кошечка " + catWeight + " бумага " + paperWeight);
        System.out.println("задание 2");
        dogWeight = dogWeight + 4;
        System.out.println(dogWeight);

        catWeight = catWeight + 4;
        System.out.println(catWeight);

        paperWeight = paperWeight + 4;
        System.out.println(paperWeight);

        System.out.println("собачка " + dogWeight + " кошечка " + catWeight + " бумага " + paperWeight);
        System.out.println("задание 3");
        dogWeight = dogWeight - 3.5;
        System.out.println(dogWeight);

        catWeight = catWeight - 1.6;
        System.out.println(catWeight);

        paperWeight = paperWeight - 7639;
        System.out.println(paperWeight);

        System.out.println("собачка " + dogWeight + " кошечка " + catWeight + " бумага " + paperWeight);
        System.out.println("задание 4");
        var friendsWeight = 19;
        System.out.println(friendsWeight);

        friendsWeight = friendsWeight * 2;
        System.out.println(friendsWeight);

        friendsWeight = friendsWeight / 7;
        System.out.println(friendsWeight);

        System.out.println(" мало дузей блин осталось... всего " + friendsWeight);
        System.out.println("задание 5");
        var frogWeight = 3.5;
        System.out.println(frogWeight);

        frogWeight = frogWeight * 10;
        System.out.println(frogWeight);


        frogWeight = frogWeight / 3.5;
        System.out.println(frogWeight);

        frogWeight = frogWeight + 4;
        System.out.println(frogWeight);

        System.out.println("толстая лягуха");


        System.out.println(" задание 6 ");
        var fighter1 = 78.2;
        var fighter2 = 82.7;

        var fighterWeight = fighter1 + fighter2;
        System.out.println("общий вес бойцов " + fighterWeight);
        var fightersWeight = fighter2 - fighter1;
        System.out.println("разница в весе бойцов " + fightersWeight + " кг ");

        System.out.println("задание 7");
        var boxerWeight1 = 78.2;
        var secondBoxer2 = 82.7;
        var remains = secondBoxer2 % boxerWeight1 ;
        System.out.println("остаток " + remains);

        System.out.println("задание 8");
        var time = 640;
        var clock = 8;
        var worcker = time / clock;
        System.out.println("всего в компании работает " + worcker);

        worcker = worcker + 94;
        System.out.println(worcker);

        var moreWorcker = 174;
        var work = time / moreWorcker;
        System.out.println("если в компании работает " + moreWorcker + " человека, то всего "+ work + " часа работы может быть поделено между сотрудниками");

    }

}
