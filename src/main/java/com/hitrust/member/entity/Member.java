package com.hitrust.member.entity;
import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import  org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "tb_member")
public class Member implements  Serializable{
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message="用户名不能为空")
    private String username;
    @NotEmpty(message="密码不能为空")
    /*@Pattern(regexp = "\\w{6,16}", message ="密码格式错误！")*/
    private String password;
    @Pattern(regexp = "^1[3578]\\d{9}$",message = "手机号码格式错误！")
    private String phone;
    private String email;
    private Date created;
    private Date updated;
    private String source_type;
    private String nick_name;
    private String name;
    private String status;
    private String head_pic;
    private String qq;
    private Integer account_balance;
    private String is_mobile_check;
    private String is_email_check;
    @NotEmpty(message = "性别不能为空")
    private String sex;
    @NotNull(message = "会员等级不能为空")
    @Max(value=2)
    @Min(value=1)
    private Integer user_level;
    private Integer points;
    @NotNull(message ="经验值不能为空")
    private Integer experience_value;
    private Date birthday;
    private Date last_login_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHead_pic() {
        return head_pic;
    }

    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(Integer account_balance) {
        this.account_balance = account_balance;
    }

    public String getIs_mobile_check() {
        return is_mobile_check;
    }

    public void setIs_mobile_check(String is_mobile_check) {
        this.is_mobile_check = is_mobile_check;
    }

    public String getIs_email_check() {
        return is_email_check;
    }

    public void setIs_email_check(String is_email_check) {
        this.is_email_check = is_email_check;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUser_level() {
        return user_level;
    }

    public void setUser_level(Integer user_level) {
        this.user_level = user_level;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getExperience_value() {
        return experience_value;
    }

    public void setExperience_value(Integer experience_value) {
        this.experience_value = experience_value;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", source_type='" + source_type + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", head_pic='" + head_pic + '\'' +
                ", qq='" + qq + '\'' +
                ", account_balance=" + account_balance +
                ", is_mobile_check='" + is_mobile_check + '\'' +
                ", is_email_check='" + is_email_check + '\'' +
                ", sex='" + sex + '\'' +
                ", user_level=" + user_level +
                ", points=" + points +
                ", experience_value=" + experience_value +
                ", birthday=" + birthday +
                ", last_login_time=" + last_login_time +
                '}';
    }
}
