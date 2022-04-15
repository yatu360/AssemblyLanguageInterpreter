package sml.instructions;

import sml.Instruction;
import sml.Machine;

/**
 * This class represents the Add instruction from the language.
 *
 * @author ...
 */
public class AddInstruction extends Instruction {

    public AddInstruction(String label, int register, int s1, int s2){
        super(label, "ADD", register, s1, s2);
    }

    /**
     * Execute the instruction and update the result register.
     *
     * @param m the machine under which the instruction executes
     */
    @Override
    public void execute(Machine m) {

    }
}
