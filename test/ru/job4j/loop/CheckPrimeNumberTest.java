package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck37() {
        boolean x = CheckPrimeNumber.check(5);
        assertThat(x, is(true));
    }
    @Test
    public void whenCheck67() {
        boolean x = CheckPrimeNumber.check(67);
        assertThat(x, is(true));
    }
    @Test
    public void whenCheck43() {
        boolean x = CheckPrimeNumber.check(43);
        assertThat(x, is(true));
    }
    @Test
    public void whenCheck25() {
        boolean x = CheckPrimeNumber.check(25);
        assertThat(x, is(false));
    }
    @Test
    public void whenCheck33() {
        boolean x = CheckPrimeNumber.check(33);
        assertThat(x, is(false));
    }
    @Test
    public void whenCheck2() {
        boolean x = CheckPrimeNumber.check(2);
        assertThat(x, is(true));
    }

    @Test
    public void whenCheck4() {
        boolean x = CheckPrimeNumber.check(4);
        assertThat(x, is(false));
    }
    @Test
    public void whenCheck1() {
        boolean x = CheckPrimeNumber.check(1);
        assertThat(x, is(true));
    }

}