
public class Main {
    public static void main(String[] args) {

        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Meow");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!" );


        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkanInfo();
        System.out.println();
        System.out.println("Informasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}
