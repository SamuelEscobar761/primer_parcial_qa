public class Descuentos {
    public static int calcularDescuentos(int salario) throws SalarioInvalidoException {
        if(salario <= 0) {
            throw new SalarioInvalidoException("El salario no puede ser negativo");
        }

        int salarioBasico = 2000;
        int descuento = 0;

        if (salario > salarioBasico && salario <= (salarioBasico*2)){
            descuento =  0.05;
        }else if(salario > salarioBasico*2){
            descuento = 0.15;
        }
        return salario - salario*descuento;
    }
}

class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensaje){
        super(mensaje);
    }
}