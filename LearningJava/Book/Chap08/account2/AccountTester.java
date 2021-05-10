class Account {
    private String name;    //非公開アクセス
    private String no;      //非公開アクセス
    private long balance;   //非公開アクセス→データ隠蔽

    Account(String n, String num, long z) { //コンストラクタ
        name = n;
        no = num;
        balance = z;
    }

    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }

    long getBalance() {
        return balance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}

public class AccountTester {
    public static void main(String[] args) {
        Account yamada = new Account("山田太郎", "123456", 1000);
        Account suzuki = new Account("鈴木次郎", "654321", 200);

        yamada.withdraw(200);
        suzuki.deposit(100);

        System.out.println("◾山田君の口座");
        System.out.println(" 口座名義：" + yamada.getName());
        System.out.println(" 口座番号：" + yamada.getNo());
        System.out.println(" 預金残高：" + yamada.getBalance());

        System.out.println("◾鈴木君の口座");
        System.out.println(" 口座名義：" + suzuki.getName());
        System.out.println(" 口座番号：" + suzuki.getNo());
        System.out.println(" 預金残高：" + suzuki.getBalance());
    }
}
