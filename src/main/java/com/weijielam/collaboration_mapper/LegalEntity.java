package com.weijielam.collaboration_mapper;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class LegalEntity {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String description;

    LegalEntity() {}

    LegalEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    This method is incorrect : please correct this ASAP
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof LegalEntity))
            return false;
        LegalEntity legalEntity = (LegalEntity) o;
        return Objects.equals(this.id, legalEntity.id) && Objects.equals(this.name, legalEntity.name)
            && Objects.equals(this.description, legalEntity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.description);
    }

    @Override
    public String toString() {
        return "Entity{" + "id=" + this.id + ", name='" + this.name + '\'' + ", description='" + this.description + '\'' + '}';
    }

}