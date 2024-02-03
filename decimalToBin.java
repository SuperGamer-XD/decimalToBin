public class decimalToBin {
    public static void main(String[] args) {
        int convertedNum = convertToBin(8);
        System.out.println(convertedNum);
    }
    public static int convertToBin(int num)
    {
        int n = 0;
        int k = 1;
        while(num!=0){
                n+= k*(num%2);
                num/=2;
                k*=10;
            }
        return n;
    }
}