public class Account {
    // Deklarasi atribut private sesuai instruksi
    private double balance;

    // Constructor untuk inisialisasi saldo awal
    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    // Menambahkan dana ke saldo jika jumlahnya positif
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    // Menarik dana jika saldo mencukupi
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}