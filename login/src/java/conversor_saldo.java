/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author TLG
 */
@Named(value = "saldo")
@Dependent
public class conversor_saldo {
int saldo= (int) 100.000;

    public conversor_saldo() {
        
        
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
