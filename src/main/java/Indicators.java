/**
 * Remember, you need a "Confluence of technical indicators" to establish the credibility for a trade
 */
public class Indicators {

    /**
     * Price is a common indicator and the favourite for many traders
     *
     * Remember, price is a lagging indicator.  If the 5 day moving average crosses the 20 day moving average to the
     * upside then you know that current price is increasing more rapidly.
     */
    public static class Price {

        public static class MovingAverage {}

        public static class Crossovers {}
    }

    /**
     * Strength and momentum indicators go together
     * Questions:
     * 1) is it a powerful move?
     * 2) how powerful is it?
     */
    public static class Strength {
        public static class Support {}
        public static class Resistence {}
    }

    /**
     * Gives you the strength of an up or down move
     */
    public static class Momentum {
        public static class Macd {}
    }

    /**
     * General condition of a market or stock
     */
    public static class Oscillators {
        // very good to watch
        public static class Rsi {}
        public static class Cci {}
        public static class PercentR {}
    }

    public static class VolatilityOrStatistical {
        // how much a stock has moved in ration to its standard deviation (moved too much to the upside / downside?)
        // great for reversal trades
        public static class BollingerBands {}
    }


    /**
     * Extremely important indicator BUT often under analysed
     */
    public static class Volume {
        // this is one of the best indicators
        public static class OnBalanceVolume{}
        public static class MoneyFlow{}
    }
}
