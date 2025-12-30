package ex_07_Array_Programs;

public class P03_Even_odds_Count {
    static void main() {
        int a[] = {0,1,2,3,4,5,6,7,8,9,10};
        int even=0;
        int odd=0;

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("In a Array there are "+even+" even numbers and "+odd+" odd numbers");
    }
}
