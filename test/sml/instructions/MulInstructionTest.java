package sml.instructions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sml.Machine;
import sml.Translator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MulInstructionTest {
    private Machine m;
    private Translator t;

    @BeforeEach
    void setUp() {
        m = new Machine();
        t = new Translator("test/sml/testInputData/mul.sml");
        t.readAndTranslate(m.getLabels(), m.getProg());
    }

    @Test
    void execute() {

        m.execute();
        assertEquals(60, m.getRegisters().getRegister(2));

    }

    @Test
    void testToString() {
        System.out.println(m.toString());
    }
}
