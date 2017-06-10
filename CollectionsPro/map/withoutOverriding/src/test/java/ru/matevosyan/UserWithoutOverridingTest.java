package ru.matevosyan;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Was created to test User class.
 * Created on 07.05.2017.
 * @author Matevosyan Vardan
 * @version 1.0
 */


public class UserWithoutOverridingTest {
    @Test
    public void whenCreateTwoSameObjectThanCheckTheResultOfComparing() {
        Calendar c = new GregorianCalendar(2017, Calendar.JUNE, 8);
        WithoutOverridingUser first = new WithoutOverridingUser("first", 3, c);
        WithoutOverridingUser second = new WithoutOverridingUser("first", 3, c);
        Map<WithoutOverridingUser, Object> map = new HashMap<>();

        map.put(first, new String("User"));
        map.put(second, new String("User"));

        System.out.println(map);
        assertThat(first.equals(second), is(false));
    }
}