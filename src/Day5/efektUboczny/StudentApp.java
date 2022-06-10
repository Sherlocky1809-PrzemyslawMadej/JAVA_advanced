package Day5.efektUboczny;

public class StudentApp {

    public static void main(String[] args) {


    Student rocky = new Student("Rocky", 777);
        System.out.println(rocky);

        rocky.setIndex(234234342);

        StudentHelper.updateStatusIndex(rocky); // efekt uboczny
        System.out.println(rocky);


}
}
