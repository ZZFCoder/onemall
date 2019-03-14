package cn.iocoder.mall.pay.biz.mq;

import cn.iocoder.mall.pay.biz.dataobject.PayTransactionDO;

/**
 * {@link cn.iocoder.mall.pay.biz.constant.MQConstant#TOPIC_PAY_TRANSACTION_PAY_SUCCESS} 的消息对象
 */
public class PayTransactionPaySuccessMessage {

    /**
     * 编号，自增
     */
    private Integer id;
    /**
     * 交易编号
     *
     * {@link PayTransactionDO#getId()}
     */
    private Integer transactionId;
    /**
     * 应用编号
     */
    private String appId;
    /**
     * 应用订单编号
     */
    private String orderId;
    /**
     * 当前通知次数
     */
    private Integer notifyTimes;
    /**
     * 通知地址
     */
    private String notifyUrl;

    public Integer getId() {
        return id;
    }

    public PayTransactionPaySuccessMessage setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public PayTransactionPaySuccessMessage setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public PayTransactionPaySuccessMessage setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getNotifyTimes() {
        return notifyTimes;
    }

    public PayTransactionPaySuccessMessage setNotifyTimes(Integer notifyTimes) {
        this.notifyTimes = notifyTimes;
        return this;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public PayTransactionPaySuccessMessage setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public PayTransactionPaySuccessMessage setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

}