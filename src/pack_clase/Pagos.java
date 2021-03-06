/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clase;

/**
 *
 * @author Nel
 */
public class Pagos {
    
     //atributos- difinen el estado
    public int codigo; 
    public String ape_nom;
    public String carreras;
    public int meses_pagos;

    public int getCodigo() {
        return codigo;
    }

    public String getApe_nom() {
        return ape_nom;
    }

    public String getCarreras() {
        return carreras;
    }

    public int getMeses_pagos() {
        return meses_pagos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setApe_nom(String ape_nom) {
        this.ape_nom = ape_nom;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    public void setMeses_pagos(int meses_pagos) {
        this.meses_pagos = meses_pagos;
    }
    
//metodos
    //constructiores: permite iniciar  un objetos del tipo venta 
    public Pagos(){
        
    }
    public Pagos (int codigo, String ape_nom, String carreras, int meses_pagos){
        //asignamos a los atributos  de la clase valores iniciales que pase  como parametro ,pueden llamarce diferente a los atributos
        //para java  reconozca  que estoy utilizando los atributos de l a clases, utilizaremos this
       
        this.codigo=codigo;
        this.ape_nom=ape_nom;
        this.carreras=carreras;
        this.meses_pagos=meses_pagos;
        
    }
   
    //operaciones :definen el comportamineto 
    public double ImporteCompra(){
        
       switch (carreras) {
           case "ADMINISTRACION DE NEGOCIOS INTERNACIONALES":
               return  700*meses_pagos;
           case "ADMINISTRACION DE GESTION COMERCIAL":
               return 600*meses_pagos;
           case "ADMINISTRACION DE EMPRESAS":
               return 800*meses_pagos;
           case "MARKETING":
               return 900*meses_pagos;
           case "ADMINISTRACION DE NEGOCIOS FINANCIEROS Y BANCARIOS":
               return 500*meses_pagos;
           case "CONTABILIDAD":
               return 800*meses_pagos;
           case "DISE??O Y DESARROLLO DE SOFTWARE":
               return 700*meses_pagos;
           case "ADMINISTRACION DE SISTEMAS":
               return 600*meses_pagos;
           case "DISE??O GRAFICO":
               return 700*meses_pagos;
           case "PUBLICIDAD":
               return 500*meses_pagos;
           default:
               return 0;
       } 
    }
 }
   
