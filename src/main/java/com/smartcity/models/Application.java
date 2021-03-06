package com.smartcity.models;

public class Application {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.APPID
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.APPName
     *
     * @mbggenerated
     */
    private String appname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.DeveloperID
     *
     * @mbggenerated
     */
    private String developerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.Categary
     *
     * @mbggenerated
     */
    private String categary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.Description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.Logo
     *
     * @mbggenerated
     */
    private String logo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.Tags
     *
     * @mbggenerated
     */
    private String tags;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    public Application(String appid, String appname, String developerid, String url, String categary, String description, String logo, String tags) {
        this.appid = appid;
        this.appname = appname;
        this.developerid = developerid;
        this.url = url;
        this.categary = categary;
        this.description = description;
        this.logo = logo;
        this.tags = tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    public Application() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.APPID
     *
     * @return the value of application.APPID
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.APPID
     *
     * @param appid the value for application.APPID
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.APPName
     *
     * @return the value of application.APPName
     *
     * @mbggenerated
     */
    public String getAppname() {
        return appname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.APPName
     *
     * @param appname the value for application.APPName
     *
     * @mbggenerated
     */
    public void setAppname(String appname) {
        this.appname = appname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.DeveloperID
     *
     * @return the value of application.DeveloperID
     *
     * @mbggenerated
     */
    public String getDeveloperid() {
        return developerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.DeveloperID
     *
     * @param developerid the value for application.DeveloperID
     *
     * @mbggenerated
     */
    public void setDeveloperid(String developerid) {
        this.developerid = developerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.URL
     *
     * @return the value of application.URL
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.URL
     *
     * @param url the value for application.URL
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.Categary
     *
     * @return the value of application.Categary
     *
     * @mbggenerated
     */
    public String getCategary() {
        return categary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.Categary
     *
     * @param categary the value for application.Categary
     *
     * @mbggenerated
     */
    public void setCategary(String categary) {
        this.categary = categary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.Description
     *
     * @return the value of application.Description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.Description
     *
     * @param description the value for application.Description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.Logo
     *
     * @return the value of application.Logo
     *
     * @mbggenerated
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.Logo
     *
     * @param logo the value for application.Logo
     *
     * @mbggenerated
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.Tags
     *
     * @return the value of application.Tags
     *
     * @mbggenerated
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.Tags
     *
     * @param tags the value for application.Tags
     *
     * @mbggenerated
     */
    public void setTags(String tags) {
        this.tags = tags;
    }
}