import java.util.Scanner;

public class BVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] candidateScore = new int[3];
        int voter;
        //------------------||--------------------
        System.out.println("Vote President of Clubx");
        System.out.println();

        System.out.println("#1 Maria");
        System.out.println("#2 Gerry");
        System.out.println("#3 Mary");
        System.out.println();
        //------------------||---------------------

        System.out.println("Enter the number of voter: ");
        voter = scan.nextInt();

        for(int i = 0; i < voter; i ++){
            System.out.println("Voter no " +(i + 1)+ ", Enter voter type (M)ahasiswa or (D)osen: ");
            String voterType = scan.next();

            System.out.println("Enter the candidate choice(1/2/3)" );
            int candidateChoice = scan.nextInt();

            switch(voterType.charAt(0)){
                case 'M':
                case 'm':
                    candidateScore[candidateChoice -1] += 1;
                    break;

                case 'D':
                case 'd':
                    candidateScore[candidateChoice -1] += 5;
                    break;
                default:
                    System.out.println("Invalid voter type!!");
            }
        }

        //find the winning candidate
        int maxScore = candidateScore[0];
        int winnerCandidate = 1;
        for(int i = 1; i < candidateScore.length; i ++){
            if(candidateScore[i] > maxScore){
                maxScore = candidateScore[i];
                winnerCandidate = i + 1;
            }

        }

        System.out.println("The winning candidate is candidate " + winnerCandidate + " with score of " + maxScore + ".");
    }
}
