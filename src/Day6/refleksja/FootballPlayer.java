package Day6.refleksja;

public class FootballPlayer {

    private String name;
    private String surname;

    public FootballPlayer(String name) {
        this.name = name;
        this.surname = "Rambo";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
