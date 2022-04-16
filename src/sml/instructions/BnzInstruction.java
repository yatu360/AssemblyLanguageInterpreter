package sml.instructions;

import sml.Instruction;
import sml.Machine;

public class BnzInstruction extends Instruction{

    /**
     * Constructor: an instruction with label l and opcode op
     * (op must be an operation of the language)
     *
     * @param l        label
     * @param register
     * @param s1
     * @param s2
     */
    public BnzInstruction(String l, int register, int s1, int s2) {
        super(l, "bnz", register, s1, s2);
    }

    @Override
    public void execute(Machine m) {

    }
}
