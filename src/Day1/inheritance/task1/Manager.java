package Day1.inheritance.task1;

public class Manager extends Employee {

    private int bonus;


    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void makeSpeech() {
        System.out.println("You're winner!");
    }

    public void makeSpeech(String additionalMessage) {
        makeSpeech();
        System.out.println(additionalMessage);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

}
