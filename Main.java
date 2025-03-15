public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202410370110308", "Waode Zaenab", 1000000);
        RekeningBank rekening2 = new RekeningBank("202410370110314", "Rizka", 500000);


        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();
        System.out.println();


        rekening1.setorUang(500000);
        rekening1.tarikUang(200000);
        rekening1.tarikUang(2000000);

        System.out.println();

        rekening2.setorUang(300000);
        rekening2.tarikUang(100000);
        rekening2.tarikUang(600000);
    }
}