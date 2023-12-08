public class Cat {
    String nameCat;
    int yearOfBirth, weight;
    public Cat(String nameCat, int yearOfBirth, int weight){
        this.nameCat = nameCat;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return String.format("%s %d %d ", this.nameCat, this.yearOfBirth, this.weight);
    }


}