package intermediate_java_programs;

public class ncr_npr {
    public static void main(String[] args) {
        int n =7, r =2, n_factorial =1, r_factorial=1, n_r_factorial=1;
        int fact_num = n-r;
//        System.out.println(fact_num);

        for(int i = 1; i<=n;i++){
            n_factorial*=i;
        }
        for(int i =1; i<= r; i++){
            r_factorial*=i;
        }
        for(int i =1; i<=fact_num;i++){
            n_r_factorial*=i;
        }
//        System.out.println(n_factorial);
//        System.out.println(r_factorial);
//        System.out.println(n_r_factorial);

        int ncr = n_factorial/(r_factorial*n_r_factorial);
        System.out.println("nCr is- " +ncr);
        int npr = n_factorial/n_r_factorial;
        System.out.println("nPr is- " +npr);

    }
}
