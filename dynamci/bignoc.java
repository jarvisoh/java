class js{
    public static int fib(int n,Map<Integer,Long> memo)

    {
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }
    }
}