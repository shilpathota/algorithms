
class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    for(int i=0;i<n;i++){
        String str="";
        for(int j=0;j<n;j++){
            if(j<i+1){
            str="#"+str;
            }else{
                str=" "+str;
            }
        }
        System.out.println(str);
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
