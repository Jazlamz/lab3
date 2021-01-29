public class MeanVariance {
    public static void main(String[] args) {
        double[] inputnums = new double[args.length];
        for (int i = 0; i < args.length; i++ ){
            inputnums[i] = Double.parseDouble(args[i]);
        }
        double meanofunms = mean(inputnums);
        System.out.println(meanofunms);
        double var = variance(inputnums, meanofunms);
        System.out.println(var);



    }
    public  static double mean(double[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];

        }
      double mean = total / (double) nums.length;
     return mean ;
    }
    public  static double variance(double[] nums, double mean) {
        double total = 0;
        for (int i = 0; i < nums.length; i++){
            total += Math.pow((nums[i] - mean), 2);

        }
        double var = total / (double) nums.length;
        return var;
    }
}
