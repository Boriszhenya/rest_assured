package org.example;

import java.util.Objects;

public class Phone {


    private String id;
    private String name;
    private String createdAt;
    private String updatedAt;
    DataPhone data;


    // Getter Methods

    public String getName() {
        return name;
    }

    public DataPhone getData() {
        return data;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setData(DataPhone data) {
        this.data = data;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Phone phone = (Phone) obj;
        return Objects.equals(getName(), phone.getName());
    }

}
