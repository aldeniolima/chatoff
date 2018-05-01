package modelos;

import java.util.ArrayList;

import modelos.compartilhado.EnumHumor;

public class Usuario {
    private String nomeDeUsuario;
    private int nota;
    private EnumHumor humor;
    private ArrayList<Mensagem> mensagens;


    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public EnumHumor getHumor() {
        return humor;
    }

    public void setHumor(EnumHumor humor) {
        this.humor = humor;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
