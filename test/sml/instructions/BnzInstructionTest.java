package sml.instructions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sml.Machine;
import sml.Translator;

import static org.junit.jupiter.api.Assertions.*;

public class BnzInstructionTest {
    private Machine m;
    private Translator t;

    @BeforeEach
    void setUp() {
        m = new Machine();
        t = new Translator("test/sml/testInputData/bnzTestData.sml");
        t.readAndTranslate(m.getLabels(), m.getProg());
    }

    @Test
    void execute() {

        m.execute();
        assertEquals(6, m.getRegisters().getRegister(22));
        assertEquals(5, m.getPc());
        System.out.println(m.getProg());
        System.out.println(m.getPc());
    }

    @Test
    void testToString() {
        System.out.println(m.toString());
    }
}
