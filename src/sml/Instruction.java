package sml;

/**
 * This class represents an abstract instruction
 *
 * @author ...
 */
public abstract class Instruction {
  private String label;
  private String opcode;
  protected int register;
  protected int s1;
  protected int s2;

  /**
   * Constructor: an instruction with label l and opcode op
   * (op must be an operation of the language)
   *
   * @param l  label
   * @param op operand
   */
  public Instruction(String l, String op, int register, int s1, int s2 ) {
    setLabel(l);
    setOpcode(op);
    this.register = register;
    this.s1 = s1;
    this.s2 = s2;
  }

  public final String getLabel() {
    return label;
  }

  public final void setLabel(String lab) {
    this.label = lab;
  }

  public final String getOpcode() {
    return opcode;
  }

  public final void setOpcode(String op) {
    this.opcode = op;
  }

  public abstract void execute(Machine m);

  // =

  @Override
  public String toString() {
    return getLabel() + ": " + getOpcode();
  }

}
