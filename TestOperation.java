public class TestOperation {
    public static void main(String[] args){
        
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Operation s = new Soustraction(dix, six);
        System.out.println(s+ " = "+ s.valeur());
        Nombre cinq = new Nombre(5);
        Nombre cinq2 = new Nombre(5);
        Operation m = new Multiplication(cinq, cinq2);
        System.out.println(m+" = "+ m.valeur());
        Nombre zero = new Nombre(0);
        Nombre deux = new Nombre(2);
        Expression douze = new Nombre(12);
        Expression douze2 = new Nombre (12);
        Expression huit = new Nombre(8);
        
        try {
            Operation d = new Division(zero, deux);
            System.out.println(d+" = "+d.valeur());
        } catch (ArithmeticException e){
            System.out.println("Erreur: "+e.getMessage());
        }
        try {
            Operation d2 = new Division(deux, zero);
            System.out.println(d2 + " = "+d2.valeur());
        } catch (ArithmeticException e){
            System.out.println("Erreur: "+e.getMessage());
        }
        try {
            Expression Addition = new Addition(douze2, douze);
            Expression Soustraction = new Soustraction(douze, huit);
            Expression division = new Division(Addition, Soustraction);
            System.out.print(division + " ="+division.valeur());
        } catch (ArithmeticException e){
            System.out.println("Erreur: "+e.getMessage());
        }
       
    }
}