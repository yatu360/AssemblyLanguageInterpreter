package sml.instructions;

import sml.Instruction;
import sml.Machine;
import lombok.RequiredArgsConstructor;
/**
 * This class represents the Add instruction from the language.
 *
 * @author Yathurshen Muralitharan (github: yatu360)
 */
@RequiredArgsConstructor
public class AddInstruction implements Instruction {
    private static final String OPCODE = "add";

    private final String label;
    private final int resultRegister;
    private final int op1;
    private final int op2;


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
        m.getRegisters().setRegister(resultRegister, value1+value2);
    }

    /**
     * String representation of the instruction.
     *
     * @return representation of the operands and result
     */
    @Override
    public String toString() {
        return getLabel() + ": " + getOpcode() + " " + op1 + " + " + op2 + " => " + resultRegister;
    }
}
