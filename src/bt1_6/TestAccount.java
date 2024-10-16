package bt1_6;

public class TestAccount {

        public static void main(String[] args) {
            // Tạo các tài khoản
            Account account1 = new Account("A101", "Tan Ah Teck", 88);
            Account account2 = new Account("A102", "Kumar", 0);

            // In thông tin tài khoản
            System.out.println(account1);
            System.out.println(account2);

            // In chi tiết tài khoản 1
            System.out.println("ID: " + account1.getAccountId());
            System.out.println("Name: " + account1.getAccountHolder());
            System.out.println("Balance: " + account1.getBalance());

            // Nạp tiền vào tài khoản 1
            account1.credit(100);
            System.out.println(account1); // In thông tin sau khi nạp tiền

            // Rút tiền từ tài khoản 1
            account1.debit(50);
            System.out.println(account1); // In thông tin sau khi rút tiền

            // Cố gắng rút nhiều hơn số dư
            account1.debit(200); // In ra "Amount exceeded balance"
            System.out.println(account1); // Xem thông tin tài khoản sau khi cố gắng rút

            // Chuyển tiền từ tài khoản 1 sang tài khoản 2
            account1.transferTo(account2, 100); // In ra "Amount exceeded balance"
            System.out.println(account1);
            System.out.println(account2);

            // Chuyển tiền hợp lệ
            account1.transferTo(account2, 50);
            System.out.println(account1);
            System.out.println(account2);
        }
    }

