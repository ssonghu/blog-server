package com.blog.domain;

import javax.persistence.*;

@Entity
@Table(name = "blog_tags_relationship", schema = "blogdb")
public class BlogTagsRelationship {
    private String id;
    private String aritcleId;
    private String tagId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "aritcle_id")
    public String getAritcleId() {
        return aritcleId;
    }

    public void setAritcleId(String aritcleId) {
        this.aritcleId = aritcleId;
    }

    @Basic
    @Column(name = "tag_id")
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogTagsRelationship that = (BlogTagsRelationship) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (aritcleId != null ? !aritcleId.equals(that.aritcleId) : that.aritcleId != null) return false;
        if (tagId != null ? !tagId.equals(that.tagId) : that.tagId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (aritcleId != null ? aritcleId.hashCode() : 0);
        result = 31 * result + (tagId != null ? tagId.hashCode() : 0);
        return result;
    }
}
