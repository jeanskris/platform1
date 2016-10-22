package com.smartcity.dao;

import com.smartcity.models.Application;
import com.smartcity.models.ResponseJsonObject.APPResponse;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    @Delete({
        "delete from application",
        "where APPID = #{appid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String appid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    @Insert({
        "insert into application (APPID, APPName, ",
        "DeveloperID, URL, ",
        "Categary, Description, ",
        "Logo, Tags)",
        "values (#{appid,jdbcType=VARCHAR}, #{appname,jdbcType=VARCHAR}, ",
        "#{developerid,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{categary,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{logo,jdbcType=VARCHAR}, #{tags,jdbcType=VARCHAR})"
    })
    int insert(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    int insertSelective(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "APPID, APPName, DeveloperID, URL, Categary, Description, Logo, Tags",
        "from application",
        "where APPID = #{appid,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    Application selectByPrimaryKey(String appid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated
     */
    @Update({
        "update application",
        "set APPName = #{appname,jdbcType=VARCHAR},",
          "DeveloperID = #{developerid,jdbcType=VARCHAR},",
          "URL = #{url,jdbcType=VARCHAR},",
          "Categary = #{categary,jdbcType=VARCHAR},",
          "Description = #{description,jdbcType=VARCHAR},",
          "Logo = #{logo,jdbcType=VARCHAR},",
          "Tags = #{tags,jdbcType=VARCHAR}",
        "where APPID = #{appid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Application record);

    @Update({
            "update application",
            "set URL = #{url,jdbcType=VARCHAR},",
            "Categary = #{categary,jdbcType=VARCHAR},",
            "Description = #{description,jdbcType=VARCHAR},",
            "Logo = #{logo,jdbcType=VARCHAR},",
            "Tags = #{tags,jdbcType=VARCHAR}",
            "where APPID = #{appid,jdbcType=VARCHAR}"
    })
    int updatePartOfAPPByPrimaryKey(Application record);

    Application findByAppName(String AppName);
    List<String> findAPPNameByDevloperId(String DevloperID);
    String findAPPIDByAppName(String AppName);
    List<APPResponse> findAllAPPResponse();
}