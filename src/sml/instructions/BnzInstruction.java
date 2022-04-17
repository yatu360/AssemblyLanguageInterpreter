package sml.instructions;

import lombok.RequiredArgsConstructor;
import sml.Instruction;
import sml.LabelsBridge;
import sml.Machine;

/**
 * This class represents the Branch Not Zero instruction from the language.
 *
 * @author Yathurshen Muralitharan (GitHub: yatu360)
 */
@RequiredArgsConstructor
public class BnzInstruction implements Instruction {
    private static final String OPCODE = "bnz";

    private final String label;
    private final int register;
    private final String goToLabel;

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
     * Execute the instruction and update PC if register value is not zero.
     *
     * @param m the machine under which the instruction executes
     */
    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(register) != 0) {
            var t = new LabelsBridge(m.getLabels());
            m.setPc(t.indexOf(goToLabel));
        }
    }

    /**
     * String representation of the instruction
     *
     * @return representation of the operands and result
     */
    @Override
    public String toString() {
        return getLabel() + ": " + getOpcode() + " if the contents of register " + register + " is not zero, " +
                "then make the statement labeled " + goToLabel + " the next one to execute";

    }
}
