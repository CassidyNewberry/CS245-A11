public class Judge{

    public static int findJudge(int N, int[][] trust) {

        final int length = trust.length;

        final int[] degree = new int[N + 1]; //the degree should be n-1

        for (int i = 0; i < length; i++) {
            
            int[] itemInTrust = trust[i];

            //decrease the degree by 1
            degree[itemInTrust[0]]--;

            //increase degree by 1
            degree[itemInTrust[1]]++;
        }

        //iterate though the degree to find the index having degree as N-1
        for (int i = 1; i <= N; i++) {
            if (degree[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String [] args){
        //this is a test to make sure the findJudge is working
        int [][] trust= new int [2][2];

        trust[0][0]=1;
        trust[0][1]=3;
        trust[1][0]=2;
        trust[1][1]=3;

        int N=3;
        

        System.out.println(findJudge(N,trust));
    

        
    }
}
