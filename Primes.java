public class Primes {
    public static void main(String[] args) {
        int counter = 0;
        int n = Integer.parseInt(args[0]);
        int p = 2;
        boolean[] elements = new boolean[n + 1];

        for (int i = 0; i < elements.length; i ++){
            elements[i] = (i > 1) ?  true : false;
        }
        while (p * p <= n) {
            for (int i = p + 1; i < elements.length; i++){
                if (i%p == 0) elements[i] = false;
            }
            for (int i = p + 1; i < elements.length; i++){
                if (elements[i]){
                    p = i;
                    break;
                }
            }
        }

        System.out.println("Prime numbers up to :" + n);
        for (int i = 0; i < elements.length; i ++){
            if (elements[i]){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (counter*100/n) +"% are primes)");
    }
}