class Account {
    String name;
    String no;
    long balance;
}

public class AccountTester {
    public static void main(String[] args) {
        Account yamada = new Account();
        Account suzuki = new Account();

        yamada.name    = "山田太郎";
        yamada.no      = "123456";
        yamada.balance = 1000;

        suzuki.name    = "鈴木次郎";
        suzuki.no      = "654321";
        suzuki.balance = 200;

        yamada.balance -= 200;
        suzuki.balance += 100;

        System.out.println("◾山田君の口座");
        System.out.println(" 口座名義：" + yamada.name);
        System.out.println(" 口座番号：" + yamada.no);
        System.out.println(" 預金残高：" + yamada.balance);

        System.out.println("◾鈴木君の口座");
        System.out.println(" 口座名義：" + suzuki.name);
        System.out.println(" 口座番号：" + suzuki.no);
        System.out.println(" 預金残高：" + suzuki.balance);
        
    }
}
