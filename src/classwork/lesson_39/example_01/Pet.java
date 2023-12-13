package classwork.lesson_39.example_01;

public class Pet extends Object {
    private String name;
    private int sex;
    private double age;
    private String furColor;

    public Pet(String name, int sex, double age, String furColor) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.furColor = furColor;
    }



    public void makeSound(){
        System.out.println(name + "make some sounds!");
        }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSex(int sex) {

        this.sex = sex;
    }

    public void setAge(double age) {

        this.age = age;
    }

    public void setFurColor(String furColor) {

        this.furColor = furColor;
    }

    public int getSex() {
        return sex;
    }

    public double getAge() {

        return age;
    }

    public String getFurColor() {

        return furColor;
    }

    @Override
    public String toString() {
        return "name:" + this.name + "  "
                + "sex" + this.sex + "   "
                + "age" + this.age + "   "
                + "furColor" + this.furColor + "   ";
    }
}

