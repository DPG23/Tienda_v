package com.tienda_v2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_credito")
  private long idCredito;
  private double limite;

    public Credito(double limite) {
        this.limite = limite;
    }
  
    
    public Credito (){
        
    }
}
