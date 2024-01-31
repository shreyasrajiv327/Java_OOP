public class Commision {
    public static void main(String[] args)
    {
        double salesAmount = 0, commission;

        do {
            if (salesAmount > 10000)
                commission = (5000 * 0.08) + (5000 * 0.1) + ((salesAmount - 10000) * 0.12);

            else if (salesAmount > 5000)
                commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.1);

            else
                commission  = salesAmount * 0.08;

            salesAmount++;
        } while (commission < 30000);
        System.out.println("Minimum sales in order to make $30,000 : " + salesAmount);
    }
}