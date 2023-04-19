public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Барсик", 5, false),
                new Cat("Обжорка", 35, false),
                new Cat("Персик", 15, false)};

        Plate plate = new Plate(10);
        plate.getInfo();

        int resultCatEat;
        boolean allCatFull = false;
        while (!allCatFull) {
            allCatFull = true;
            plate.addFood();
            plate.getInfo();
            for (Cat cat : cats) {
                resultCatEat = cat.catEat(plate.getFood());
                if (!cat.isFull()) {
                    allCatFull = false;
                } else plate.setFood(plate.getFood() - resultCatEat);
            }
        }

    plate.getInfo();
    System.out.println("-----Все котики сыты-----");
    }
}