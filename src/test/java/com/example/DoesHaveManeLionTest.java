package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoesHaveManeLionTest {

        private final String checkedText;
        private final boolean expected;

        public DoesHaveManeLionTest(String checkedText, boolean expected) {
            this.checkedText = checkedText;
            this.expected = expected;
        }

        @Mock
        Feline feline;

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }

        @Test
        public void testDoesHaveMane() throws Exception {
            Lion lion = new Lion(checkedText,feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        }

}
