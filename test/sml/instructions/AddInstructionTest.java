package sml.instructions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sml.Machine;
import sml.Translator;

import static org.junit.jupiter.api.Assertions.*;

class AddInstructionTest {
  private Machine m;
  private Translator t;

  @BeforeEach
  void setUp() {
//    this.m = new Machine();
//    t = new Translator("test/sml/testData/add.sml");
//    t.readAndTranslate(m.getLabels(), m.getProg());
//
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void execute() {
    Machine machine = new Machine();
    Translator translator = new Translator("test/sml/testData/add.sml");
    translator.readAndTranslate(machine.getLabels(), machine.getProg());
    machine.execute();
    //assertEquals(97, machine.getRegisters().getRegister(0));
    System.out.println(machine.getRegisters().getRegister(0));
  }

  @Test
  void testToString() {
    System.out.println(m.toString());
  }
}