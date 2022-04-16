package sml;

/**
 * Modified as part of task 8.
 *
 * @author Yathurshen Muralitharan (github username: yatu360)
 */
public interface Instruction {
  /**
   * Returns the label of the instruction.
   *
   * @return label of the instruction.
   */
  String getLabel();

  /**
   * Returns the instruction opcode.
   *
   * @return instruction opcode.
   */
  String getOpcode();

  /**
   * Execute this instruction on machine m.
   *
   * @param m the machine in which to execute the instruction.
   */
  void execute(Machine m);

}
