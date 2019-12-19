package com.johncadena.stash.models;

import javax.persistence.*;

@Entity
@Table(name="stashes")
public class Stash {
    @Id
    @Column(name = "id")
    private long id;

    @OneToOne
    @MapsId
    private User user;

        // One to one: user to stash
    // One to many: stash to cuts
    // Many to many: stashes to projects

//    @OneToMany(mappedBy = "cut")
//    private List<Cut> cuts;


}
