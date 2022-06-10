package Enumy.task2;

public class Main {

    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackageSize(-5, 0);
        System.out.println(packageSize);

        PackageSize packageSize2 = PackageSize.getPackageSize(30, 35);
        System.out.println(packageSize2);
    }
}
