package com.dfsek.paralithic.node.binary.number;

import com.dfsek.paralithic.node.Node;
import com.dfsek.paralithic.node.binary.BinaryNode;
import com.dfsek.paralithic.node.Constant;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.DREM;

public class ModuloNode extends BinaryNode {
    public ModuloNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public void applyOperand(MethodVisitor visitor, String generatedImplementationName) {
        visitor.visitInsn(DREM);
    }

    @Override
    public Op getOp() {
        return Op.MODULO;
    }

    @Override
    public Constant constantSimplify() {
        return Constant.of(((Constant) left).getValue() % ((Constant) right).getValue());
    }
}
