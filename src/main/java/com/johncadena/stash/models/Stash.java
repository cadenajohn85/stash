package com.johncadena.stash.models;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "fabricName")
    private List<Cut> cuts;

    public Stash() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Cut> getCuts() {
        return cuts;
    }

    public void setCuts(List<Cut> cuts) {
        this.cuts = cuts;
    }
}
