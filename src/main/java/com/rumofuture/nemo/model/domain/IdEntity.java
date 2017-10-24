package com.rumofuture.nemo.model.domain;

import java.io.Serializable;

public class IdEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
