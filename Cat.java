public class Cat {
    private String name;
    private int appetite;
   private boolean full;

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
//    public int catEat(){
//        return this.appetite;
//    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int catEat(int food) {
        if (this.full) {
            System.out.printf("котик %s сыт\n", this.name);
            return 0;
        } else if (this.appetite <= food) {
            System.out.printf("котик %s покушал %d граммов еды\n", this.name, this.appetite);
            this.full = true;
            return this.appetite;
        } else {
            System.out.printf("котик %s не покушал, мало еды\n", this.name);
            return 0;

        }
    }

}
