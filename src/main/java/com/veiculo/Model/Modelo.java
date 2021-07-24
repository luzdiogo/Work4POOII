package com.veiculo.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "modelo")
public class Modelo implements Serializable {
    @Id
    @Column (name = "id_modelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modelo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "potencia")
    private int potencia;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca")
    private Marca marca;

    public Modelo(String descricao, int potencia, Marca marca) {
        this.descricao = descricao;
        this.potencia = potencia;
        this.marca = marca;
    }

    public Modelo() {

    }

    public int getId() {
        return id_modelo;
    }

    public void setId(int id) {
        this.id_modelo = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
