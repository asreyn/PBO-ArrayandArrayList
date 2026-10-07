import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    // Menggunakan ArrayList untuk menyimpan banyak akun
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<Account>(); // Inisialisasi list kosong
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Menambahkan objek Account baru ke dalam ArrayList
    public void setAccount(Account acct) {
        accounts.add(acct);
    }

    // Mengambil akun spesifik berdasarkan indeks
    public Account getAccount(int account_index) {
        if (account_index >= 0 && account_index < accounts.size()) {
            return accounts.get(account_index);
        }
        return null;
    }
    
    // Metode tambahan untuk mengetahui jumlah akun yang dimiliki
    public int getNumOfAccounts() {
        return accounts.size();
    }
}