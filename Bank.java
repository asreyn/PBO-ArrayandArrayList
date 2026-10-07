public class Bank {
    // Array statis untuk menyimpan objek Customer
    private Customer[] customers;
    // Integer pelacak indeks array berikutnya
    private int numberOfCustomers;

    public Bank() {
        // Inisialisasi array dengan ukuran maksimal lebih dari 5
        customers = new Customer[10]; 
        numberOfCustomers = 0;
    }

    // Menginstansiasi Customer baru dan memasukannya ke array
    public void addCustomer(String f, String l) {
        // Cek agar tidak melebihi batas (ArrayIndexOutOfBounds)
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(f, l);
            numberOfCustomers++; // Increment pelacak
        } else {
            System.out.println("Kapasitas bank sudah penuh!");
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // Mengembalikan objek Customer sesuai indeks yang dicari
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}