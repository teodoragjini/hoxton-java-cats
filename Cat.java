public class Cat {
    public String name;
    public int age;
    public boolean likeCuddles;

    public Cat(String name, int age, boolean likeCuddles) {
        this.name = name;
        this.age = age;
        this.likeCuddles = likeCuddles;
    }

    void showCatInfo() {
        if (this.likeCuddles) {

            System.out.println("He is " + this.name + " and  is  " + this.age + " year old "
                    + " and he likes to cuddle a lottt");
        } else {
            System.out.println("She is " + this.name + " and  is " + this.age + " and she does not likes cuddles");
        }
    }

}