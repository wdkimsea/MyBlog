package com.zhy.model;

import lombok.Data;

import java.util.Date;

/**
 * @author: zhangocean
 * @Date: 2019/7/14 15:36
 * Describe:
 */
@Data
public class Reward {

    private int id;

    /**
     * 募捐人
     */
    private String fundRaiser;

    /**
     * 募捐来源
     */
    private String fundRaisingSources;

    /**
     * 募捐去处
     */
    private String fundraisingPlace;

    /**
     * 募捐金额
     */
    private float rewardMoney;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 募捐日期
     */
    private Date rewardDate;

    /**
     * 募捐证书url
     */
    private String rewardUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFundRaiser() {
        return fundRaiser;
    }

    public void setFundRaiser(String fundRaiser) {
        this.fundRaiser = fundRaiser;
    }

    public String getFundRaisingSources() {
        return fundRaisingSources;
    }

    public void setFundRaisingSources(String fundRaisingSources) {
        this.fundRaisingSources = fundRaisingSources;
    }

    public String getFundraisingPlace() {
        return fundraisingPlace;
    }

    public void setFundraisingPlace(String fundraisingPlace) {
        this.fundraisingPlace = fundraisingPlace;
    }

    public float getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(float rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getRewardDate() {
        return rewardDate;
    }

    public void setRewardDate(Date rewardDate) {
        this.rewardDate = rewardDate;
    }

    public String getRewardUrl() {
        return rewardUrl;
    }

    public void setRewardUrl(String rewardUrl) {
        this.rewardUrl = rewardUrl;
    }
}
