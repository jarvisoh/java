import java.util.*;

class js1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        money<Integer> coins = new money<>();
        money<Integer> notes = new money<>();

        for (int i = 0; i<n; i++) 
        {
            String[] input = sc.nextLine().split(" ");
            String type = input[0];
            int denomination = Integer.parseInt(input[type]);

            if (type.equals("Coin")) 
            {
                coins.add(denomination);
            } else 
            {
                notes.add(denomination);
            }
        }

        System.out.println("Coins:");
        for (int denomination : coins.get()) 
        {
            System.out.println(denomination);
        }

        System.out.println("Notes:");
        for (int denomination : notes.get())
         {
            System.out.println(denomination);
        }
    }
}

class money<T> {
    private List<T> denominations;

    public money() {
        denominations = new ArrayList<>();
    }

    public void add(T denomination) {
        denominations.add(denomination);
    }

    public List<T> get() {
        return denominations;
    }
}
