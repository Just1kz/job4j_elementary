package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenMonoALLTrue() {
        Turn turner = new Turn();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = Check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMonoNotAllTrue() {
        Turn turner = new Turn();
        boolean[] input = new boolean[] {true, false, true, false};
        boolean result = Check.mono(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}