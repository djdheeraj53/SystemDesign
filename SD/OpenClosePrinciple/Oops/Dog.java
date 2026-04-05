class DogClass {
    private name;
    int age;

    DogClass() {
        this.name = 0;
        this.age = 0;
    }

    public DogClass(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public DogClass(DogClass dog) {
        this.name = dog.name;
        this.age = dog.age;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getAge() {
        System.out.println(this.age);
    }
}

public class Dog {
    public static void main (String args[]) {
        DogClass defaultDog = new DogClass();
        DogClass myDog = new DogClass(1, 5);
        myDog.getName();
        myDog.getAge();
        DogClass copyDog = new DogClass(myDog);
        copyDog.getName();
        copyDog.getAge();
        defaultDog.getName();
        defaultDog.getAge();
        System.out.println(defaultDog.name);
        System.out.println(defaultDog.age);

    }
}