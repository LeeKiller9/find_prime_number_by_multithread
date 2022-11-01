public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        optimizedPrimeFactorization.getThreadOptimized().start();
        lazyPrimeFactorization.getThreadLazy().start();
    }
}