package Part2;

public class WhaleWatcher {
    public static void main(String[] args) {
        Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
        Whale w2 = new Whale("Blue", "Pacific" ,2001, 23, 16);
        Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
        Whale w4 = new Whale("Humpback","Antarctic", 919, 13, 13);

        Whale[] whales = {w1,w2,w3,w4};

        displayAll(whales);

        byMainOcean(whales, "Atlantic");

        swimsFastest(whales);

        averageLength(whales);

        heaviest(whales);
    }

    private static void heaviest(Whale[] whales) {
        int heaviest = whales[0].getWeight();
        String name;
        for (int loop = 0; loop < whales.length; loop++) {
            if (whales[loop].getWeight() >= heaviest) {
                name = whales[loop].getName();
                System.out.println("The heaviest whale is " + name);
            }
        }
        System.out.println();
    }

    private static void averageLength(Whale[] whales) {
        int total = 0;
        double avg = 0.0;
        int counter = 0;

        for (int loop = 0; loop < whales.length; loop++) {
            total += whales[loop].getLength();
            counter++;
        }
        avg = total / counter;
        System.out.printf("The average length is %.2f\n",avg);
    }

    private static void swimsFastest(Whale[] whales) {
        int fastest = whales[0].getMaxSpeed();
        String name = whales[0].getName();
        for (int loop = 0; loop < whales.length; loop++) {
            if (whales[loop].getMaxSpeed() > fastest) {
                fastest = whales[loop].getMaxSpeed();
                name = whales[loop].getName();
            }
        }
        System.out.println("The fastest whales is " + name);
        System.out.println();
    }

    private static void byMainOcean(Whale[] whales, String mainOcean) {
        String w = mainOcean;
        String name;
        for (int loop = 0; loop < whales.length; loop++) {
            if (w.equalsIgnoreCase(whales[loop].getMainOcean())){
                name = whales[loop].getName();
                System.out.println(name + " swims mainly in the " + w + " ocean");
            }
        }
        System.out.println();
    }

    private static void displayAll(Whale[] whales) {
        System.out.println("Displaying all cities ");
        for (Whale whale : whales) {
            System.out.println(whale.toString());
        }
        System.out.println();
    }
}
