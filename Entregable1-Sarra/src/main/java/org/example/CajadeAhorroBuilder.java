package org.example;

public abstract class CajadeAhorroBuilder implements Builder{
int id;

@Override
public void setID(int id){this.id = id;};

public CajadeAhorro getCajaDeAhorro(){
    return new CajadeAhorro(id);
}

}
