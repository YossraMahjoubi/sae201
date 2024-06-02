public class Division extends Operation{

    public Division(Expression operande1, Expression operande2){
        super(operande1, operande2);
    }

    public double valeur(){
        if (operande2.valeur() == 0) {
            throw new ArithmeticException("Changez de dénominateur, division par 0 imposible !");
        }
        return operande1.valeur() / operande2.valeur();
    }

    public String toString(){ 
        return "( " + operande1 + " ÷ "+ operande2 + ")";
    }
}