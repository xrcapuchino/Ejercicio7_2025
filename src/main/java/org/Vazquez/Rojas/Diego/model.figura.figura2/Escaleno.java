package org.Vazquez.Rojas.Diego.model.figura.figura2;

import org.Vazquez.Rojas.Diego.util.ReadUtil;
import org.Vazquez.Rojas.Diego.vista.Menu;

public class Escaleno extends Isosceles
{
    private double lado3;

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3)
    {
        super(base, altura, lado1, lado2);
        this.lado3 = lado3;
    }

    public Escaleno() {

    }

    public double getLado3()
    {
        return lado3;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
        Menu.menuLado3();
        lado3 = ReadUtil.getInstance().leerInt();

    }
}
