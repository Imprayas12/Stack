package myExeptions;

public class SortError extends Throwable{
    public void check(int a,int b){
        if(a>b)
            System.out.print("Please enter in ascending order only");
    }
}
