package dev.anto;

public class Planeta {
    
     String nombre=null;
     int cantSatelites = 0;
     double masa= 0;
     double volumen =0;
     int diametro =0;
     int distanciamediaSol= 0;
     enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
     tipoPlaneta tipo;
     boolean observable =false;
     int periodoOrbital=0;
     int rotacion=0;


   


public Planeta(String nombre, int cantSatelites, double masa, double volumen, int diametro, int distanciamediaSol,
            tipoPlaneta tipo, boolean observable, int periodoOrbital, int rotacion) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciamediaSol = distanciamediaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.rotacion = rotacion;
    }


void imprimir() {
System.out.println("Nombre del planeta = " + nombre);
System.out.println("Cantidad de satélites = " + cantSatelites);
System.out.println("Masa del planeta = " + masa);
System.out.println("Volumen del planeta = " + volumen);
System.out.println("Diámetro del planeta = " + diametro);
System.out.println("Distancia al sol = " + distanciamediaSol);
System.out.println("Tipo de planeta = " + tipo);
System.out.println("Es observable = " + observable);
System.out.println("Periodo orbital en años = " + observable);
System.out.println("Rotacion en dias = " + observable);
}


double calcularDensidad(){
    return masa/volumen;
}

boolean esExterior(){
    float limite = (float)(149597870 * 3.4);

    if(distanciamediaSol > limite){
        return true;
    }else{
        return false;
    }
}

public static void main(String args[]) {

    
        Planeta planeta1 = new Planeta("planeta1",1,5.9736E24,1.00000
        ,12000,150000000,tipoPlaneta.TERRESTRE,true,365,24);
        planeta1.imprimir();
        Planeta planeta2 = new Planeta("planeta2",1,6.0036E24,2.00000
        ,20000,200000000,tipoPlaneta.GASEOSO,false,400,40);
        planeta2.imprimir();

        System.out.println("La densidad del planeta1 es "+planeta1.calcularDensidad());
        System.out.println("La densidad del planeta2 es "+planeta2.calcularDensidad());
        System.out.println("¿el planeta1 es considerado exterior? "+planeta1.esExterior());
        System.out.println("¿el planeta2 es considerado exterior? "+planeta2.esExterior());

}

}
