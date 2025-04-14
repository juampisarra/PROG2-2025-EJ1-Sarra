package org.example;

public class CuentaCorriente extends Cuenta implements IGestionSaldo {

    double giroDescubierto;

    public void setGiroDescubierto(Double monto) {
        giroDescubierto=monto;
    }

    public void CuentaCorriente(int id, double giroDescubierto){
        Id = id;
        this.giroDescubierto = giroDescubierto;
    }

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


        if (Saldo - monto <= giroDescubierto) {
            CantidadMovimientos++;
            Saldo -= monto;
            res.Success = true;
            res.Message = "Se retiro dinero de su cuenta";
        } else {
            res.Success = false;
            res.Message = "No se puede realizar la operacion";
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
