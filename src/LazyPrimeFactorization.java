public class LazyPrimeFactorization implements Runnable{

    private Thread threadLazy;


    public LazyPrimeFactorization() {
        this.threadLazy = new Thread(this,"threadLazy");
    }

    public Thread getThreadLazy() {
        return threadLazy;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        findPrimeNumber();
    }

    public void findPrimeNumber(){
        for (int i = 2; i <= 10000 ; i++){
            if (checkPrimeNumber(i)){
                System.out.println("Prime by lazy: " + i);
            }
        }
    }

    public boolean checkPrimeNumber(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
