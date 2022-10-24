package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;

class SampleTest {

    @Test
    void add_of_3_and_2_equals_5() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 3, 2)).isEqualTo(5);
    }

    @Test
    void add_of_minus_2_and_3_equals_1() {
    Sample sample = new Sample();
    Assertions.assertThat(sample.op(Sample.Operation.ADD, 3, -2)).isEqualTo(1);
    }

    @Test
    void fact_of_5_should_return_120() {
        int parameter = 5;
        Sample sample = new Sample();
        int result = sample.fact(parameter);
        Assertions.assertThat(result).as("fact of 5").isEqualTo(120);
    }

    @Test
    void fact_by_a_negative_number_should_produce_an_exeption() {
        int parameter = -45;
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(parameter));
    }
}