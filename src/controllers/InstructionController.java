package controllers;

import contracts.InstructionStatus;
import misc.UnsupportedStatusTransitionException;
import models.Instruction;

/**
 * Handles generating the next instruction. 
 * @author heshamsalman
 *
 */
public class InstructionController {
	private Instruction instr;
	
	InstructionController() {
		InstructionStatus p = InstructionStatus.getRandomStatus();
		instr = new Instruction(p);
	}
	
	public void nextInstruction() {
		InstructionStatus p = InstructionStatus.getRandomStatus();
		if (p != instr.getStatus()) {
			instr.setStatus(p);
		}
	}
}
