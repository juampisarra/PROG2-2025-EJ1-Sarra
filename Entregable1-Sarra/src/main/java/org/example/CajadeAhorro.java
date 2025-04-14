package org.example;

public class CajadeAhorro extends Cuenta implements IGestionSaldo{


public CajadeAhorro(int id){this.Id = id;}

    @Override
        public synchronized boolean agregarSaldo(double monto){
            Resultado res = new Resultado();
            CantidadMovimientos++;
            Saldo+=monto;
            res.Success= true;
            res.Message = "El monto a sido cargado";

            return res.Success;
    }

    @Override
    public synchronized boolean quitarSaldo(double monto) {
        Resultado res = new Resultado();


        if (monto <= Saldo) {
            CantidadMovimientos++;
            Saldo -= monto;
            res.Success = true;
            res.Message = "Se retiro dinero de su cuenta";
        } else {
            res.Success = false;
            res.Message = "El monto que se desea retirar es mayor al Saldo de su cuenta";
        }

        return res.Success;
    }

    @Override
    public synchronized double getSaldo(){
        CantidadMovimientos++;
        return Saldo;
    }

    @Override
    public synchronized int getOperaciones() {
        return CantidadMovimientos;
    }
}
