package Day5.lambdaAnother;

public class Player {

    private int ranking;
    private int age;
    private String name;

    public Player(int ranking, int age, String name) {
        this.ranking = ranking;
        this.age = age;
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return
                "ranking=" + ranking +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
