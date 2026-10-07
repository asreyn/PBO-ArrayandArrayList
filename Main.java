public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // nambah data nasabah
        bank.addCustomer("Rey", "Dynatha");
        bank.addCustomer("Iqbul", "Mauluddin");

        // ambil data nasabah pertama (indeks 0)
        Customer c1 = bank.getCustomer(0);
        
        // masukin beberapa akun ke list nasabah
        c1.setAccount(new Account(500000));
        c1.setAccount(new Account(1500000));

        // test print data nasabah
        System.out.println("Nasabah: " + c1.getFirstName() + " " + c1.getLastName());
        System.out.println("Punya " + c1.getNumOfAccounts() + " akun bank.");

        // test transaksi di akun pertama
        Account acc1 = c1.getAccount(0);
        System.out.println("Saldo awal: Rp" + acc1.getBalance());
        
        acc1.deposit(200000);
        System.out.println("Habis deposit: Rp" + acc1.getBalance());
        
        acc1.withdraw(150000);
        System.out.println("Habis ditarik 150rb: Rp" + acc1.getBalance());
    }
}