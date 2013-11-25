
package br.com.pousada.App;

import br.com.pousada.View.JanelaLogin;



public class Principal {
    
    public static void main(String[] args) {
        
         //Chamar janela Login
        JanelaLogin jl = new JanelaLogin();
        //aparecer janela centralizada
        jl.setLocationRelativeTo(null);
        //tornar visivel a janela
        jl.setVisible(true);  
    }    
}
