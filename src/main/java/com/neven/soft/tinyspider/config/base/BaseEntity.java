package com.neven.soft.tinyspider.config.base;

import javax.persistence.*;
import java.util.Date;

/**
 * 实体基类
 * Created by Neven on 2017/3/11.
 */
@MappedSuperclass
public class BaseEntity {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "insert_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date inertAt;

    public BaseEntity() {
        inertAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInertAt() {
        return inertAt;
    }

    public void setInertAt(Date inertAt) {
        this.inertAt = inertAt;
    }
}
