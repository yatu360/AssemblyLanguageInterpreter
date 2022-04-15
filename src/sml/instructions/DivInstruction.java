package sml.instructions;

import sml.Instruction;
import sml.Machine;

public class DivInstruction extends Instruction {
    /**
     * Constructor: an instruction with label l and opcode op
     * (op must be an operation of the language)
     *
     * @param l        label
     * @param op       operand
     * @param register
     * @param s1
     * @param s2
     */
    public DivInstruction(String l, String op, int register, int s1, int s2) {
        super(l, op, register, s1, s2);
    }

    @Override
    public void execute(Machine m) {

    }
}
