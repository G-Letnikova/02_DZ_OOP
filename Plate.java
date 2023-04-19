import java.util.Random;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void getInfo() {
        System.out.printf("на тарелке %d граммов еды\n",this.food);
    }
    public void addFood() {
        int pieceOfFood = new Random().nextInt(10,35);
        System.out.printf("добавили в тарелку %d граммов еды\n", pieceOfFood);
        setFood(food + pieceOfFood);
    }

}
