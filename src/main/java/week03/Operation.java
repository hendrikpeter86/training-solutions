package week03;

public class Operation {
    private int leftOperand;
    private int rightOperand;

    public Operation(String expression) {
        String left = expression.substring(0, expression.indexOf("+"));
        left = left.trim();
        leftOperand = Integer.parseInt(left);

        //  leftOperand = Integer.parseInt(expression.substring(0, expression.indexOf("+"));  így is lehetne, egyben írva, de elején mindenképpen jobbb lépésenként haladni

        String right = expression.substring(expression.indexOf("+") + 1);
        right = right.trim();
        rightOperand = Integer.parseInt(right);


    }

    public int getResult(){
        return leftOperand + rightOperand;
    }
}
