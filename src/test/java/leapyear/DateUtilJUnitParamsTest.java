package leapyear;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class DateUtilJUnitParamsTest {

    @Test
    @Parameters({
            "1992, true",
            "1997, false"
    })
    @TestCaseName("The year {0}, should have is leap as {1}")
    public void isLeapYear(int year, boolean shouldBeLeap) {
        assertThat(DateUtil.isLeapYear(year), is(shouldBeLeap));
    }
}
