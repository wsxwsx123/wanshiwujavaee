package com.cdvtc.pepsi.data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "tb_user", schema = "pepsi", catalog = "")
public class TbUser {
    private long id;
    private String userName;
    private long userId;
    private String password;
    private String passGuardIssueProblem;
    private String passGuardIssue;
    private Long passPhone;
    private Integer passQq;
    private String faceUrl;
    private Time birthdate;
    private String sex;
    private String recommendCode;
    private String othersRecommendCode;
    private Integer fansNumber;
    private Boolean ifAssessor;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
    @Column(name = "passGuardIssueProblem")
    public String getPassGuardIssueProblem() {
        return passGuardIssueProblem;
    }

    public void setPassGuardIssueProblem(String passGuardIssueProblem) {
        this.passGuardIssueProblem = passGuardIssueProblem;
    }

    @Basic
    @Column(name = "passGuardIssue")
    public String getPassGuardIssue() {
        return passGuardIssue;
    }

    public void setPassGuardIssue(String passGuardIssue) {
        this.passGuardIssue = passGuardIssue;
    }

    @Basic
    @Column(name = "passPhone")
    public Long getPassPhone() {
        return passPhone;
    }

    public void setPassPhone(Long passPhone) {
        this.passPhone = passPhone;
    }

    @Basic
    @Column(name = "passQq")
    public Integer getPassQq() {
        return passQq;
    }

    public void setPassQq(Integer passQq) {
        this.passQq = passQq;
    }

    @Basic
    @Column(name = "faceUrl")
    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    @Basic
    @Column(name = "Birthdate")
    public Time getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Time birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "recommendCode")
    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode;
    }

    @Basic
    @Column(name = "othersRecommendCode")
    public String getOthersRecommendCode() {
        return othersRecommendCode;
    }

    public void setOthersRecommendCode(String othersRecommendCode) {
        this.othersRecommendCode = othersRecommendCode;
    }

    @Basic
    @Column(name = "fansNumber")
    public Integer getFansNumber() {
        return fansNumber;
    }

    public void setFansNumber(Integer fansNumber) {
        this.fansNumber = fansNumber;
    }

    @Basic
    @Column(name = "ifAssessor")
    public Boolean getIfAssessor() {
        return ifAssessor;
    }

    public void setIfAssessor(Boolean ifAssessor) {
        this.ifAssessor = ifAssessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUser tbUser = (TbUser) o;

        if (id != tbUser.id) return false;
        if (userId != tbUser.userId) return false;
        if (userName != null ? !userName.equals(tbUser.userName) : tbUser.userName != null) return false;
        if (password != null ? !password.equals(tbUser.password) : tbUser.password != null) return false;
        if (passGuardIssueProblem != null ? !passGuardIssueProblem.equals(tbUser.passGuardIssueProblem) : tbUser.passGuardIssueProblem != null)
            return false;
        if (passGuardIssue != null ? !passGuardIssue.equals(tbUser.passGuardIssue) : tbUser.passGuardIssue != null)
            return false;
        if (passPhone != null ? !passPhone.equals(tbUser.passPhone) : tbUser.passPhone != null) return false;
        if (passQq != null ? !passQq.equals(tbUser.passQq) : tbUser.passQq != null) return false;
        if (faceUrl != null ? !faceUrl.equals(tbUser.faceUrl) : tbUser.faceUrl != null) return false;
        if (birthdate != null ? !birthdate.equals(tbUser.birthdate) : tbUser.birthdate != null) return false;
        if (sex != null ? !sex.equals(tbUser.sex) : tbUser.sex != null) return false;
        if (recommendCode != null ? !recommendCode.equals(tbUser.recommendCode) : tbUser.recommendCode != null)
            return false;
        if (othersRecommendCode != null ? !othersRecommendCode.equals(tbUser.othersRecommendCode) : tbUser.othersRecommendCode != null)
            return false;
        if (fansNumber != null ? !fansNumber.equals(tbUser.fansNumber) : tbUser.fansNumber != null) return false;
        if (ifAssessor != null ? !ifAssessor.equals(tbUser.ifAssessor) : tbUser.ifAssessor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (passGuardIssueProblem != null ? passGuardIssueProblem.hashCode() : 0);
        result = 31 * result + (passGuardIssue != null ? passGuardIssue.hashCode() : 0);
        result = 31 * result + (passPhone != null ? passPhone.hashCode() : 0);
        result = 31 * result + (passQq != null ? passQq.hashCode() : 0);
        result = 31 * result + (faceUrl != null ? faceUrl.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (recommendCode != null ? recommendCode.hashCode() : 0);
        result = 31 * result + (othersRecommendCode != null ? othersRecommendCode.hashCode() : 0);
        result = 31 * result + (fansNumber != null ? fansNumber.hashCode() : 0);
        result = 31 * result + (ifAssessor != null ? ifAssessor.hashCode() : 0);
        return result;
    }
}
