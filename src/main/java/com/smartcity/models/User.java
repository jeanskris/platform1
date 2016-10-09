package com.smartcity.models;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PrivateID
     *
     * @mbggenerated
     */
    private Integer privateid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UUID
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.IDCardNumber
     *
     * @mbggenerated
     */
    private String idcardnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UserName
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PhoneNum
     *
     * @mbggenerated
     */
    private String phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Attachment
     *
     * @mbggenerated
     */
    private String attachment;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User(Integer privateid, String uuid, String idcardnumber, String username, String phonenum, String password, String sex, String attachment) {
        this.privateid = privateid;
        this.uuid = uuid;
        this.idcardnumber = idcardnumber;
        this.username = username;
        this.phonenum = phonenum;
        this.password = password;
        this.sex = sex;
        this.attachment = attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PrivateID
     *
     * @return the value of user.PrivateID
     *
     * @mbggenerated
     */
    public Integer getPrivateid() {
        return privateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PrivateID
     *
     * @param privateid the value for user.PrivateID
     *
     * @mbggenerated
     */
    public void setPrivateid(Integer privateid) {
        this.privateid = privateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UUID
     *
     * @return the value of user.UUID
     *
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UUID
     *
     * @param uuid the value for user.UUID
     *
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.IDCardNumber
     *
     * @return the value of user.IDCardNumber
     *
     * @mbggenerated
     */
    public String getIdcardnumber() {
        return idcardnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.IDCardNumber
     *
     * @param idcardnumber the value for user.IDCardNumber
     *
     * @mbggenerated
     */
    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UserName
     *
     * @return the value of user.UserName
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UserName
     *
     * @param username the value for user.UserName
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PhoneNum
     *
     * @return the value of user.PhoneNum
     *
     * @mbggenerated
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PhoneNum
     *
     * @param phonenum the value for user.PhoneNum
     *
     * @mbggenerated
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Password
     *
     * @return the value of user.Password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Password
     *
     * @param password the value for user.Password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Sex
     *
     * @return the value of user.Sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Sex
     *
     * @param sex the value for user.Sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Attachment
     *
     * @return the value of user.Attachment
     *
     * @mbggenerated
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Attachment
     *
     * @param attachment the value for user.Attachment
     *
     * @mbggenerated
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
    @Override
    public String toString(){
        return  this.getPrivateid()+","+this.getUuid()+","+this.getUsername()+","+this.getIdcardnumber()+","+this.getPhonenum()+","+this.getSex()+","+this.getPassword();
    }
}