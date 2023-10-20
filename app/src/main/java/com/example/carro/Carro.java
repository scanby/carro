package com.example.carro;

public class Carro {
    public String color;
    public String marca;
    public String modelo;
    public int velocidad;
    public int volumen_tanque;
    public int gasolina = 0;
    public boolean encendido = false;

    public boolean isEncendido() {
        return encendido;
    }
    public void llenarTanque(){
        this.gasolina = this.volumen_tanque;
    }
    public void encenderCarro(){
        this.encendido = true;
    }
    public void apagarCarro(){
        this.encendido = false;
    }
}

    @Override
    public String toString() {
        return "Carro{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", volumen_tanque=" + volumen_tanque +
                ", gasolina=" + gasolina +
                ", encendido=" + encendido +
                '}';

}
}
