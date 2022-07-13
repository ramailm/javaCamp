public class Math {

    public long factorial(int n){
        if(n <= 1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public long fibonacci(int n){
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public void printPyramidNumbers(int n){
        for(int i = 1;i <=n;i++){
            for(int j =1;j < i ;j++)
                System.out.print(j + " ");
            System.out.println("");
        }
    }

    public int gcd(int a,int b){
        if(a == 0 || b == 0)
            return a > b ? a:b;
        else if(a > b)
            return gcd(a-b,b);
        else if(a < b)
            return gcd(a,b-a);
        else if(a == b)
            return a;
        else
            return -1;
    }

    public int lengthOfCollatzSeq(int n) {
        int count = 0;
        while (true) {
            count++;
            if (n % 2 == 0)
                n /= 2;
            else if (n == 1)
                break;
            else
                n = 3 * n + 1;
        }

        return count;
    }

        public static void main(String[] args){
        Math m = new Math();
        System.out.println(m.lengthOfCollatzSeq(27));

        }





}
