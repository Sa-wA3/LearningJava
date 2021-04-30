import java.util.Scanner;

public class FindingMissingCards {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //正解データの準備
        String fullCards[] = new String [13];

        for (int i = 0; i < fullCards.length; i++) { //正解データを配列に代入

            if (i >= 0 && i <= 12) {
                fullCards[i] = i + 1;
                System.out.print(fullCards[i] + " ");
            }else if (i >= 13 && i <= 25) {
                fullCards[i] = i + 1 - 13;
                System.out.print(fullCards[i] + " ");
            }else if (i >= 26 && i <= 38) {
                fullCards[i] = i + 1 - 26;
                System.out.print(fullCards[i] + " ");
            }else {
                fullCards[i] = i + 1 - 39;
                System.out.print(fullCards[i] + " ");
            }

        }

        int cardsNum = sc.nextInt();

        int cards[] = new int[cardsNum];

        for (int j = 0; j < cards.length; j++) {



        }
        


  

    }

}
