class RekeningBank {

    private String nomorRekening;
    private String namaPemilik;
    private double saldo;


    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }


    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }


    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor Uang: " + jumlah);
            System.out.println("Transaksi berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setor harus positif.");
        }
    }

    // Metode untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah > 0) {
            if (jumlah <= saldo) {
                saldo -= jumlah;
                System.out.println("Tarik Uang: " + jumlah);
                System.out.println("Transaksi berhasil. Saldo sekarang: " + saldo);
            } else {
                System.out.println("Saldo tidak cukup untuk menarik uang sebesar: " + jumlah);
            }
        } else {
            System.out.println("Jumlah tarik harus positif.");
        }
    }
}