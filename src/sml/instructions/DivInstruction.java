package sml.instructions;

import sml.Instruction;
import sml.Machine;

public class DivInstruction implements Instruction {
    private static final String OPCODE = "div";

    private String label;
    private int result;
    private int op1;
    private int op2;

    /**
     * Returns the label of the instruction.
     *
     * @return label of the instruction.
     */
    @Override
    public String getLabel() {
        return this.label;
    }

    /**
     * Returns the instruction opcode.
     *
     * @return instruction opcode.
     */
    @Override
    public String getOpcode() {
        return OPCODE;
    }

    /**
     * Execute the instruction and update the result register.
     *
     * @param m the machine under which the instruction executes
     */
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 / value2);
    }

    /**
     * String representation of the instruction
     *
     * @return representation of the operands and result
     */
    @Override
    public String toString() {
        return getLabel() + ": " + getOpcode() + " " + op1 + " / " + op2 + " to " + result;
    }
}
