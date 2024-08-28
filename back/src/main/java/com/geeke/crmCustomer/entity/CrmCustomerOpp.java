package com.geeke.crmCustomer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.geeke.common.persistence.DataEntity;

/**
 * 客户管理Entity
 * @author
 * @version
 */

public class CrmCustomerOpp extends DataEntity<CrmCustomerOpp> {

    private static final long serialVersionUID = 1713619331797369420L;

    private String cusId; // 客户Id


    private String oppId;



    // 构造方法
    public CrmCustomerOpp() {
        super();
    }

    public CrmCustomerOpp(String id) {
        super(id);
    }


    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusId() {
        return cusId;
    }

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    /**
     * 获取实体对应表名
     */
    @Override
    @JsonIgnore
    public String getBusTableName() {
        return "crm_customer_opp";
    }

    /**
     * 获取实体对应Id
     */
    @Override
    @JsonIgnore
    public String getBusTableId() {
        return "1713619331797369420";
    }

    /**
     * 获取实体对应描述
     */
    @Override
    @JsonIgnore
    public String getBusTableComments() {
        return "客户管理-沟通记录";
    }

    /**
     * 获取实体表中是否存在del_flag字段
     */
    @JsonIgnore
    public boolean getBusTableHasDelFlag() {
        return true;
    }

}