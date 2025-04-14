package org.example;

public class CuentaCorrienteBuilder implements Builder {
int id;
double GiroDescubierto;

    public CuentaCorriente getCuentaCorriente(){
        return new CuentaCorriente();
    }
    @Override
    public void SetID(int id){this.id = id;}

    public void setGiroDescubierto(double giroDescubierto){GiroDescubierto = giroDescubierto;}

}
