package leapyear;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DateUtilTest {

    @Test
    public void isLeapYear() {
        assertThat(DateUtil.isLeapYear(1992), is(true));
        assertThat(DateUtil.isLeapYear(1996), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(1900), is(false));
        assertThat(DateUtil.isLeapYear(2003), is(false));
    }
}
