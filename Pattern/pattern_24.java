public class pattern_24 {
    public static void main(String[] args) {
         int n=5;
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n*2-1;j++)
             {
                 if(i==j || i+j==n*2 )
                 System.out.print("* ");//1 space
                 else 
                 System.out.print("  ");//2 space
             }
             System.out.println();
         }
    }
}
