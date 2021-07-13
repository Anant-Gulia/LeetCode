class FibonacciNumber {
    public int fib(int n) {
        if(n == 1)
            return n;
        int a = 0, b = 1, answer = 0;
        for(int i = 0; i < n-1; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;
    }
}