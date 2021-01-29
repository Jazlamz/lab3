public class ArrayRotate {
    public static void main(String[] args) {
   int[] nums  = new int[args.length];
   int[] copy = new int[nums.length];
   for (int i = 0 ; i < nums.length; i++){
       nums[i] = Integer.parseInt(args[i]);

   }
   for (int i = 0; i < nums.length; i++) {

     if (i == nums.length -1 ){
         copy[nums.length - 1] = nums[0];

                                } else  {
         copy[i] = nums[i + 1];
     }
   }
        for (int i = 0 ; i < nums.length; i++){
       System.out.print(copy[i] + " ");
   }
        System.out.println();
    }
}
