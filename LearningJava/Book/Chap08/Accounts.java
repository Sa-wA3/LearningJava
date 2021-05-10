public class Accounts {
    
    public static void main(String[] args) {
        String yamadaAccountName  = "山田太郎";
        String yamadaAccountNo    = "123456";
        long yamadaAccountBalance = 1000;

        String suzukiAccountName  = "鈴木次郎";
        String suzukiAccountNo    = "654321";
        long suzukiAccountBalance = 200;

        yamadaAccountBalance -= 200;
        suzukiAccountBalance += 100;

        System.out.println("◾山田君の口座");
        System.out.println(" 口座名義：" + yamadaAccountName);
        System.out.println(" 口座番号：" + yamadaAccountNo);
        System.out.println(" 預金残高：" + yamadaAccountBalance);

        System.out.println("◾鈴木君の口座");
        System.out.println(" 口座名義：" + suzukiAccountName);
        System.out.println(" 口座番号：" + suzukiAccountNo);
        System.out.println(" 預金残高：" + suzukiAccountBalance);

    }
}
