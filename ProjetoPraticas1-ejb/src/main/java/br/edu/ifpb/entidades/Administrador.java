package br.edu.ifpb.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Administrador extends Pessoa {

    public Administrador() {
    }
    
}
