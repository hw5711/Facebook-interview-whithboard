public class HelloWorld{

     public static void main(String []args){
         double income = 50000, tax = 0;
         double[] stage = {9700, 39475, 84200,1100000};
          double[] rate = {0.1, 0.12, 0.22,0.3};
          double residule = stage[0];
         for(int i=0; i<stage.length; i++){
             if(income > stage[i]){
                if(i==0){
                    tax += stage[i]*rate[i];
                    residule = income - stage[0];
                }else{
                    tax += (stage[i]-stage[i-1])*rate[i];
                    residule = residule - stage[i];
                }
             }else{
                if(i>0){
                tax += (income - stage[i-1]) *rate[i];
                    break;
                }
             }
         }
        System.out.println("tax is: " + tax);
     }
}