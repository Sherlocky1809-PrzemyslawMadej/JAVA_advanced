package Day4.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalsRepositoryImpl implements AnimalsRepository {

    Map<String, List<String>> multiMap = new HashMap<>();

    @Override // Jan Burek
    public void addAnimal(String owner, String animal) {

        List<String> animals = multiMap.get(owner);
        if(animals == null) {
            //        dziala w przypadku pierwszego zwierzecia
           List<String> newAnimals = new ArrayList<>();
            newAnimals.add(animal);
            multiMap.put(owner, newAnimals); //odpowiednik add z arraylistow.
        } else {
            animals.add(animal);
        }
    }

    @Override
    public String getAnimals(String owner) {
        return null;
    }

    @Override
    public String toString() {
        return multiMap.toString();
    }
}
