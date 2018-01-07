package com.blog.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blog_pictrue", schema = "blogdb")
public class BlogPictrue {
    private String id;
    private String picturePath;
    private Date createTime;
    private Byte valid;
    private String descripition;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "picture_path")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "valid")
    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "descripition")
    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogPictrue that = (BlogPictrue) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (picturePath != null ? !picturePath.equals(that.picturePath) : that.picturePath != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (descripition != null ? !descripition.equals(that.descripition) : that.descripition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (picturePath != null ? picturePath.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (descripition != null ? descripition.hashCode() : 0);
        return result;
    }
}
