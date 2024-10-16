package bt1_6;

public class Account {

        private String accountId;   // ID tài khoản
        private String accountHolder; // Tên chủ tài khoản
        private double balance;      // Số dư tài khoản

        // Constructor
        public Account(String accountId, String accountHolder, double initialBalance) {
            this.accountId = accountId;
            this.accountHolder = accountHolder;
            this.balance = Math.max(initialBalance, 0); // Đảm bảo số dư không âm
        }

        // Getter cho ID tài khoản
        public String getAccountId() {
            return accountId;
        }

        // Getter cho tên chủ tài khoản
        public String getAccountHolder() {
            return accountHolder;
        }

        // Getter cho số dư
        public double getBalance() {
            return balance;
        }

        // Phương thức nạp tiền (credit)
        public void credit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive.");
            }
            balance += amount;
        }

        // Phương thức rút tiền (debit)
        public void debit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive.");
            }
            if (amount > balance) {
                System.out.println("Amount exceeded balance");
            } else {
                balance -= amount;
            }
        }

        // Phương thức chuyển tiền
        public void transferTo(Account anotherAccount, double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Transfer amount must be positive.");
            }
            if (amount > balance) {
                System.out.println("Amount exceeded balance");
            } else {
                this.debit(amount); // Rút tiền từ tài khoản này
                anotherAccount.credit(amount); // Nạp tiền vào tài khoản khác
            }
        }

        // Phương thức toString để in thông tin tài khoản
        @Override
        public String toString() {
            return "Account[id=" + accountId + ",name=" + accountHolder +
                    ",balance=" + balance + "]";
        }
    }

