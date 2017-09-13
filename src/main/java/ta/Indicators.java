package ta;

/**
 * Remember, you need a "Confluence of technical indicators" to establish the credibility for a trade.
 * You need 2 or 3 indicators to go confidently into a trade...and to know what your outlook is (e.g. one week?
 * one month).  You might change your outlook to suit the chart.
 *
 * Chart analysis is the key because you need to have some basis for taking a trade (bullish or bearish).  You need
 * to have an outlook that is based on certain facts.  TA / chart analysis is ONE of those facts.
 *
 * Millions of folks (and bots!) are looking at charts and are expecting behaviour...it becomes a self fulfilling
 * prophecy.  Your goal is therefore to know what they are thinking...and win.
 *
 * Patterns, like head and shoulders often don't pan out...and so the pattern becomes invalidated.  For instance, if the
 * right shoulder pierces through the head.
 *
 * With head and shoulders, you get the neck line by connecting the left and right low points of the head to create a
 * trendline.
 *
 * Remember, this is herd mentality...someone large enough gets spooked then 10 respond...then 100 respond...then
 * 1 million respond.  Typically, a "significant" catalyst starts the market off...then crowd psychology takes over.
 *
 * Fundamental events change price - and given those events TA is largely irrelevant.  TA works, however, ~60% of the
 * time.  Fibonacci, MACD etc. DO NOT MAKE SENSE during fundamental events!  Do not listen to the fool.
 *
 * How to set up your terminal.
 *
 *   |=============|===================|
 *   | Price / MA  | Price / Bollinger |
 *   ----------------------------------
 *   |    Volume   |       MACD        |
 *   |=================================|
 *
 * When looking at a stock you are looking for multiple confirmations.  Such as, the RSI is indicating overbought, the
 * MACD is crossing into a downward trend and the five day moving average is going below the 20 day.
 * That, sir, is heading south so you get out!
 * Your choice is to choose which signal you act on depending on how aggressive you are...perhaps act as it is about to
 * hit the 20 day moving average.
 */
public class Indicators {

    /**
     * Price is a common indicator and the favourite for many traders
     *
     * Remember, price is a lagging indicator.  If the 5 day moving average crosses the 20 day moving average to the
     * upside then you know that current price is increasing more rapidly.
     *
     * When looking at price you might notice support and resistance at certain levels.  Support is the bottom and
     * resistance is the top.  If the volume is low and there is a reversal (e.g. it is going down then back up) then it
     * just confirms that there isn't much pressure downwards.
     * You can find those levels by limiting to places of high volume.  Once found you can draw a trend line as, say,
     * a support point.  With regard to breaking resistance - you will only be able to do that with sufficient volume to
     * break through.  Just before meeting those resistance points you can make an educated guess as to whether it will
     * break through.  You will also typically see a long candle breaking through in one day...where if successful it
     * will establish a new resistance level above it.  You can keep these levels (lines) to maintain better
     * situational awareness.
     */
    public static class Price {

        /**
         * Look at this depending on your outlook.  Your outlook might be long, in which case you might consider
         * 200 day and 50 day moving averages.
         * If you are a swing trader then you might consider 10 and 30 days moving averages...or 5 and 20 days.
         */
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

        /**
         * Takes in a 12n moving average and a 26n moving average.  12 is the fast moving average and the 26 is the
         * slow moving average.  It then draws the 9n period as a signal.  n is usually days.
         *
         * When looking at the lines, if the signal line (fast average) is moving away from the lagging average then you
         * know there is good momentum.  The histogram shows you that momentum.
         * Please note that looking at this alone isn't good enough - the price, for instance, might be maintaining
         * momentum (upwards) and yet the indicator remains fairly flat.  The indicator shows you change in momentum.
         * You should be looking at signal lines that move consistently from below the average to above the average,
         * where you can wait a while (e.g. day) for confirmation of the trend.
         */
        public static class Macd {}
    }

    /**
     * General condition of a market or stock
     */
    public static class Oscillators {
        // very good to watch

        /**
         * The Relative Strength Index (RSI) oscillates between two lines (top and bottom) and sometimes pierces them.
         * Typically, the values 30 and 70 are used to indicate oversold and overbought conditions, respectively.
         *
         * Keep a close on the RSI.  You might switch between this and the MACD to get an idea of what is happening.
         *
         * You cannot use RSI on its own because the indicator can suggest overbought or oversold for a long period -
         * you need confirmation from other indicators, such as the moving average, MACD, bollinger bands or support
         * and resistance etc.  To be conservative, you can use 20 and 80 - it will give you fewer alerts then.
         *
         * When you see a sharp change in the RSI (e.g. top to middle) that is a strong signal that there is a reversal.
         */
        public static class Rsi {}
        public static class Cci {}
        public static class PercentR {}
    }

    public static class VolatilityOrStatistical {

        /**
         * Bollinger Bands gives an idea of the stock movement on a standard deviation basis.
         *
         * It is how much a stock has moved in relation to its standard deviation - (moved too much to the upside /
         * downside?)
         *
         * It is great for reversal trades.
         *
         * Imagine a bell curve.  68% of values fall within one Standard Deviation (movement from the mean).
         * A bollinger band shows one standard deviation +- on the chart.  You should expect price to fall within that
         * 68% of the time.
         *
         * You can also put 2 standard deviation band - statistically price will then fall within the band 95% of the
         * time.
         *
         * Remember, just because it pierces a band at the bottom DOES NOT mean you should get it - it can continue to
         * slide down for some time.  You are waiting for signs of a reversal!  That is the reversal signal.
         *
         * Given a flat(ish) band you will note that Smart Money does a test before instigating an upward move.
         * Before an up move there has to be a test - they are verifying there are no more sellers at a given price.
         */
        public static class BollingerBands {}
    }


    /**
     * Extremely important indicator BUT often under analysed.
     *
     * Look at the charts and pick out the low points.  Look at the volume indicator and SEE where the low points are.
     * You need to see the volume on those low points - high volume suggests a lot of support.  Look for the few with
     * high volume - they are the true support points.  But remember, just because it was support does not mean that it
     * IS supported.
     * Given that, you can then draw a horizontal line for the support line for your analysis.
     *
     * Volume shows what the BIG PLAYERS and the SMART MONEY is doing.  These are hedge funds, institutional investors,
     * trading syndicates, banks etc.  Their behaviour is indicated by volume.
     *
     * When pushing through resistance levels you will see a "battle" - think of volume as fuel.  You typically need a
     * lot of volume to push through these levels.  Just because you break through a level doesn't mean that you can
     * sustain that level.
     *
     * Volume Analysis: this is the study of Smart Money, Big Players, Hedge Funds etc.  There are many well known
     * phrases such as "follow the smart money, swim with the tide etc." - knowing when smart money gets in or out
     * gives you insight.
     *
     * To learn more look at the Richard Wyckoff Methodology (~100 years ago) http://richardwyckoff.org/wyckoff.asp
     */
    public static class Volume {
        // this is one of the best indicators
        public static class OnBalanceVolume{}
        public static class MoneyFlow{}
    }
}
