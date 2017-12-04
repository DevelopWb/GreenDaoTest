package com.greendaotest1204.bean;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;

/**
 * Author:wang_sir
 * Time:2017/12/4 10:19
 * Description:This is A
 */
@Entity
public class A {
    @Id
    private Long id;
    @Unique
    private String transportNo;//配送单号
    @Convert(columnType = String.class, converter = B_Converter.class)
    private List<B> transportDescriptions;
    @NotNull
    private String transportType;//物流类型
    private String transportPeople;//配送人
    private String transportPeopleMobile;//配送人电话
    private String transportTime;//配送时间
    private String transportInfo;//配送详情
    private String petName;//会员名
    private String mobile;//会员电话
    private String address;//收货地址
    private String residualIntegral;//剩余积分
    private String relayBoxNo;//中转箱编号
    private String operatingPeople;//操作人
    private String operateTime;//操作时间
    private String noteInfo;//noteInfo
    @Generated(hash = 1782933374)
    public A(Long id, String transportNo, List<B> transportDescriptions,
            @NotNull String transportType, String transportPeople,
            String transportPeopleMobile, String transportTime,
            String transportInfo, String petName, String mobile, String address,
            String residualIntegral, String relayBoxNo, String operatingPeople,
            String operateTime, String noteInfo) {
        this.id = id;
        this.transportNo = transportNo;
        this.transportDescriptions = transportDescriptions;
        this.transportType = transportType;
        this.transportPeople = transportPeople;
        this.transportPeopleMobile = transportPeopleMobile;
        this.transportTime = transportTime;
        this.transportInfo = transportInfo;
        this.petName = petName;
        this.mobile = mobile;
        this.address = address;
        this.residualIntegral = residualIntegral;
        this.relayBoxNo = relayBoxNo;
        this.operatingPeople = operatingPeople;
        this.operateTime = operateTime;
        this.noteInfo = noteInfo;
    }
    @Generated(hash = 2349630)
    public A() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTransportNo() {
        return this.transportNo;
    }
    public void setTransportNo(String transportNo) {
        this.transportNo = transportNo;
    }
    public List<B> getTransportDescriptions() {
        return this.transportDescriptions;
    }
    public void setTransportDescriptions(List<B> transportDescriptions) {
        this.transportDescriptions = transportDescriptions;
    }
    public String getTransportType() {
        return this.transportType;
    }
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    public String getTransportPeople() {
        return this.transportPeople;
    }
    public void setTransportPeople(String transportPeople) {
        this.transportPeople = transportPeople;
    }
    public String getTransportPeopleMobile() {
        return this.transportPeopleMobile;
    }
    public void setTransportPeopleMobile(String transportPeopleMobile) {
        this.transportPeopleMobile = transportPeopleMobile;
    }
    public String getTransportTime() {
        return this.transportTime;
    }
    public void setTransportTime(String transportTime) {
        this.transportTime = transportTime;
    }
    public String getTransportInfo() {
        return this.transportInfo;
    }
    public void setTransportInfo(String transportInfo) {
        this.transportInfo = transportInfo;
    }
    public String getPetName() {
        return this.petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getResidualIntegral() {
        return this.residualIntegral;
    }
    public void setResidualIntegral(String residualIntegral) {
        this.residualIntegral = residualIntegral;
    }
    public String getRelayBoxNo() {
        return this.relayBoxNo;
    }
    public void setRelayBoxNo(String relayBoxNo) {
        this.relayBoxNo = relayBoxNo;
    }
    public String getOperatingPeople() {
        return this.operatingPeople;
    }
    public void setOperatingPeople(String operatingPeople) {
        this.operatingPeople = operatingPeople;
    }
    public String getOperateTime() {
        return this.operateTime;
    }
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }
    public String getNoteInfo() {
        return this.noteInfo;
    }
    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }

}
