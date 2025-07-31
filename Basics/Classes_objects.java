public class Classes_objects {
      static class num{
        int x = 5;
         static int sqr(int input){
            return input*input;
        }
    }
    public static  void main(String args[]){
         num obj = new num();
         System.out.print(obj.x+" "+num.sqr(5));

    }
    
}
