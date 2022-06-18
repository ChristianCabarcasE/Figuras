/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.IFigura;

/**
 *
 * @author BOG-A410-E-023
 */
public abstract class Figura  implements IFigura {
  protected String nombrefigura;
  public abstract double calculoPerimetro();
  

    public String getNombrefigura() {
        return nombrefigura;
    }

    public void setNombrefigura(String nombrefigura) {
        this.nombrefigura = nombrefigura;
    }
    
    
    
    
}
