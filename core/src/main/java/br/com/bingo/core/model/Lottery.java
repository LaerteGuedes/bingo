package br.com.bingo.core.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by laerteguedes on 19/11/17.
 */
@Entity
@Table(name = "lotteries")
public class Lottery implements Model, Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
