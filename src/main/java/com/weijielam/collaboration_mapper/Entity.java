package com.weijielam.collaboration_mapper;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Entity {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String description;

    Entity() {}

    Entity(String name, String description) {
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
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Entity))
            return false;
        Entity entity = (Entity) o;
        return Objects.equals(this.id, entity.id) && Objects.equals(this.name, entity.name)
            && Objects.equals(this.role, entity.description);
    }

    @Override
    public int HashCode() {
        return Objects.hash(this.id, this.name, this.description);
    }

    @Override
    public String toString() {
        return "Entity{" + "id=" + this.id + ", name='" + this.name + '\'' + ", description='" + this.description '\'' + '}';
    }

}