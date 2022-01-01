
package leapyear;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class DateUtilParameterizedTest {
    @Parameter(0)
    public int year;
    @Parameter(1)
    public boolean isLeapYear;

    @Parameters(name = "The year {0,number,####}, should be leap year as {1}")
    public static Object[][] params() {
        return new Object[][]{
                {1992, true},
                {1900, false},
                {2000, true},
                {1991, false},
                {1996, true}

        };
    }

    @Test
    public void isLeapYear() {
        assertThat(DateUtil.isLeapYear(year), is(isLeapYear));
    }
}
