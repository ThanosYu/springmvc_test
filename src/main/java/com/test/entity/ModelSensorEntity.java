package com.test.entity;

import javax.persistence.*;

/**
 * @author Thanos Yu
 * @date 10/9/2018 1:27 PM
 */
@Entity
@Table(name = "model_sensor", schema = "thanos", catalog = "")
public class ModelSensorEntity {
    private long id;
    private String sensor;
    private Long modelId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sensor")
    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @Basic
    @Column(name = "model_id")
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelSensorEntity that = (ModelSensorEntity) o;

        if (id != that.id) return false;
        if (sensor != null ? !sensor.equals(that.sensor) : that.sensor != null) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (sensor != null ? sensor.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        return result;
    }
}