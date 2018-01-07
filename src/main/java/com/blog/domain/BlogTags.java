package com.blog.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blog_tags", schema = "blogdb")
public class BlogTags {
    private String id;
    private String tagName;
    private String tagDesc;
    private Date createTime;
    private Byte valid;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Basic
    @Column(name = "tag_desc")
    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogTags blogTags = (BlogTags) o;

        if (id != null ? !id.equals(blogTags.id) : blogTags.id != null) return false;
        if (tagName != null ? !tagName.equals(blogTags.tagName) : blogTags.tagName != null) return false;
        if (tagDesc != null ? !tagDesc.equals(blogTags.tagDesc) : blogTags.tagDesc != null) return false;
        if (createTime != null ? !createTime.equals(blogTags.createTime) : blogTags.createTime != null) return false;
        if (valid != null ? !valid.equals(blogTags.valid) : blogTags.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        result = 31 * result + (tagDesc != null ? tagDesc.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
