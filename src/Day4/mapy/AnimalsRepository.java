package Day4.mapy;

public interface AnimalsRepository {

    void addAnimal(String owner, String animal);
    String getAnimals(String owner);
}
