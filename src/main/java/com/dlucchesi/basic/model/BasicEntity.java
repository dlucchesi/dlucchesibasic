package com.dlucchesi.basic.model;

import jakarta.persistence.Column;

public interface BasicEntity {


    @Column(nullable = false, unique = true, updatable = false)
    boolean canEqual(Object obj);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();

    Long getId();

    Boolean getIsDeleted();

    Boolean getIsActive();

    void setId(Long id);

    void setIsDeleted(Boolean isDeleted);

    void setIsActive(Boolean isActive);

    java.util.UUID getUuid();

    void setUuid(java.util.UUID uuid);
}
