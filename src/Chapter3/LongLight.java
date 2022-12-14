package Chapter3;

public class LongLight {
    public static void main(String[] args) {
        int lightspeed;

        long days;

        long seconds;

        long distance;
        // մոտավորապես լույսի արագությունը միլերով
        lightspeed =186000;
        days = 1000; // օրերի քանաակն է
        seconds = days * 24 * 60 * 60; // վերափոխում է վայկյանների
        distance = lightspeed * seconds;{
            System.out.print(" " + days);
            System.out.print(" լուսային օրում կանցնի ");
            System.out.println(distance + " մղոն։ ");
        }

    }
}
