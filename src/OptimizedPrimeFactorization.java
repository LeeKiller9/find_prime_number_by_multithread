public class OptimizedPrimeFactorization implements Runnable{
    private Thread threadOptimized;

    public OptimizedPrimeFactorization() {
        this.threadOptimized = new Thread(this,"threadOptimized");
    }

    public Thread getThreadOptimized() {
        return threadOptimized;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        findPrimeNumber();
    }

    public void findPrimeNumber(){
        for (int i = 2; i <= 10000 ; i++){
            if (checkPrimeNumber(i)){
                System.out.println("Prime by optimized: " + i);
            }
        }
    }

    public boolean checkPrimeNumber(double num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
