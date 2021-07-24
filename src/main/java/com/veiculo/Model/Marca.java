package com.veiculo.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "marca")
public class Marca  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_marca;
    private String nome;

    public Marca() {

    }
    public Marca(String nome){
        this.nome = nome;
    }

    public int getId() {
        return id_marca;
    }

    public void setId(int id) {
        this.id_marca = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
