package com.blog.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "blog_aritcle", schema = "blogdb", catalog = "")
public class BlogAritcle {
    private String id;
    private String title;
    private byte[] content;
    private byte[] author;
    private Date createTime;
    private Date updateTime;
    private String descripition;
    private Integer praise;
    private String showRole;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Basic
    @Column(name = "author")
    public byte[] getAuthor() {
        return author;
    }

    public void setAuthor(byte[] author) {
        this.author = author;
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
    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "praise")
    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    @Basic
    @Column(name = "show_role")
    public String getShowRole() {
        return showRole;
    }

    public void setShowRole(String showRole) {
        this.showRole = showRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogAritcle that = (BlogAritcle) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (!Arrays.equals(content, that.content)) return false;
        if (!Arrays.equals(author, that.author)) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (descripition != null ? !descripition.equals(that.descripition) : that.descripition != null) return false;
        if (praise != null ? !praise.equals(that.praise) : that.praise != null) return false;
        if (showRole != null ? !showRole.equals(that.showRole) : that.showRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + Arrays.hashCode(author);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (descripition != null ? descripition.hashCode() : 0);
        result = 31 * result + (praise != null ? praise.hashCode() : 0);
        result = 31 * result + (showRole != null ? showRole.hashCode() : 0);
        return result;
    }
}
