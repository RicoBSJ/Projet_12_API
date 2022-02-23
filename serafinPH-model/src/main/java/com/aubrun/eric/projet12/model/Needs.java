package com.aubrun.eric.projet12.model;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name="needs_id_generator", sequenceName = "needs_id_seq", allocationSize=1)
@Table(name = "NEEDS")
public class Needs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "needs_id_generator")
    @Column(name = "needs_id")
    Integer needsId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custom_needs")
    Custom customNeeds;

    public Needs(Integer needsId, Custom customNeeds) {
        this.needsId = needsId;
        this.customNeeds = customNeeds;
    }

    public Needs() {
    }

    public Integer getNeedsId() {
        return needsId;
    }

    public void setNeedsId(Integer needsId) {
        this.needsId = needsId;
    }

    public Custom getCustomNeeds() {
        return customNeeds;
    }

    public void setCustomNeeds(Custom customNeeds) {
        this.customNeeds = customNeeds;
    }

    @Override
    public String toString() {
        return "Needs{" +
                "needsId=" + needsId +
                ", customNeeds=" + customNeeds +
                '}';
    }
}
