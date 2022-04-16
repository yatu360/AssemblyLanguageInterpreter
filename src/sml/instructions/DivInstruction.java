package sml.instructions;

import sml.Instruction;
import sml.Machine;

public class DivInstruction extends Instruction {
    /**
     * Constructor: an instruction with label l and opcode op
     * (op must be an operation of the language)
     *
     * @param l        label
     * @param register
     * @param s1
     * @param s2
     */
    public DivInstruction(String l, int register, int s1, int s2) {
        super(l, "div", register, s1, s2);
    }

    @Override
    public void execute(Machine m) {

    }
}
