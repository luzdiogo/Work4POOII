package com.veiculo.veiculo;

import com.veiculo.Model.Automovel;
import com.veiculo.Model.Marca;
import com.veiculo.Model.Modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        Marca marca = new Marca("Chevrolet");
        Modelo modelo = new Modelo("Classic",89,marca);
        Automovel automovel = new Automovel(2011,2011,"carro 1.0", 190000, 216000, modelo);
        try {
            EntityManagerFactory pers = Persistence.createEntityManagerFactory("veiculo");
            EntityManager em = pers.createEntityManager();

            em.getTransaction().begin();
            em.persist(automovel);
            em.getTransaction().commit();
            em.close();
            pers.close();

        }catch (Exception e){
            System.out.println(">>>>>>>");
            System.out.println(e);
        }

    }
}
