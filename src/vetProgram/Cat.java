package vetProgram;

public class Cat {
    public String name;
    public int age;
    public String breed;
    public Owner owner;

    public Cat(String name, int age, String breed, Owner owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }
    public boolean sleep(boolean param){
        return param;
    }
    public boolean isIll(boolean param){
        return param;
    }
    public void eat(){
        System.out.println("Кот ест");
    }

    @Override
    public String toString() {
        return String.format("Кот {name: %s, breed: %s, age: %s}",name,breed,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat)
            return ((Cat) obj).name.equals(this.name) &&
                    ((Cat) obj).breed.equals(this.breed) &&
                    ((Cat) obj).age == this.age &&
                    ((Cat) obj).owner.equals(this.owner);
            else return false;
    }
}
