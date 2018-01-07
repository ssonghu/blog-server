package com.blog.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blog_friendly_link", schema = "blogdb")
public class BlogFriendlyLink {
    private String id;
    private String logoPath;
    private String descripition;
    private Byte valid;
    private Date createTeime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "logo_path")
    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    @Basic
    @Column(name = "descripition")
    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
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
    @Column(name = "create_teime")
    public Date getCreateTeime() {
        return createTeime;
    }

    public void setCreateTeime(Date createTeime) {
        this.createTeime = createTeime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogFriendlyLink that = (BlogFriendlyLink) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (logoPath != null ? !logoPath.equals(that.logoPath) : that.logoPath != null) return false;
        if (descripition != null ? !descripition.equals(that.descripition) : that.descripition != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (createTeime != null ? !createTeime.equals(that.createTeime) : that.createTeime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (logoPath != null ? logoPath.hashCode() : 0);
        result = 31 * result + (descripition != null ? descripition.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (createTeime != null ? createTeime.hashCode() : 0);
        return result;
    }
}
