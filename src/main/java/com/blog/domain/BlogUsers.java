package com.blog.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "blog_users", schema = "blogdb")
public class BlogUsers {
    private String id;
    private String username;
    private String password;
    private String nickName;
    private Date lastCommentTime;
    private Date lastLoginTime;
    private Date createTime;
    private String role;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "last_comment_time")
    public Date getLastCommentTime() {
        return lastCommentTime;
    }

    public void setLastCommentTime(Date lastCommentTime) {
        this.lastCommentTime = lastCommentTime;
    }

    @Basic
    @Column(name = "last_login_time")
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

        BlogUsers blogUsers = (BlogUsers) o;

        if (id != null ? !id.equals(blogUsers.id) : blogUsers.id != null) return false;
        if (username != null ? !username.equals(blogUsers.username) : blogUsers.username != null) return false;
        if (password != null ? !password.equals(blogUsers.password) : blogUsers.password != null) return false;
        if (nickName != null ? !nickName.equals(blogUsers.nickName) : blogUsers.nickName != null) return false;
        if (lastCommentTime != null ? !lastCommentTime.equals(blogUsers.lastCommentTime) : blogUsers.lastCommentTime != null)
            return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(blogUsers.lastLoginTime) : blogUsers.lastLoginTime != null)
            return false;
        if (createTime != null ? !createTime.equals(blogUsers.createTime) : blogUsers.createTime != null) return false;
        if (role != null ? !role.equals(blogUsers.role) : blogUsers.role != null) return false;
        if (valid != null ? !valid.equals(blogUsers.valid) : blogUsers.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (lastCommentTime != null ? lastCommentTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BlogUsers{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", lastCommentTime=" + lastCommentTime +
                ", lastLoginTime=" + lastLoginTime +
                ", createTime=" + createTime +
                ", role='" + role + '\'' +
                ", valid=" + valid +
                '}';
    }
}
