package intermediate_java_programs;

public class Depreciation_of_value {
    public static void main(String[] args) {
        long amount, depreciation,year,temp;
        amount=100000;
        depreciation =10;
        year=3;
        temp=amount;
        for(int i=0;i<year;i++)
            temp=((100- depreciation)*temp)/100;
        System.out.println("after depreciation = "+temp);
    }
}
