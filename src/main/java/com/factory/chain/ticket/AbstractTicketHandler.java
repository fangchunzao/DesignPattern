package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 7:51 下午
 **/
abstract class AbstractTicketHandler {

    /**
     * 主管审批
     */
    public static final int DIRECT_DAY = 3;
    /**
     * 部门审批
     */
    public static final int DEPT_DAY = 7;
    /**
     * 经理审批
     */
    public static final int MANAGE_DAY = 30;

    /**
     * 名称
     */
    protected String handlerName;

    /**
     * 下一个处理节点
     */
    protected AbstractTicketHandler nextHandler;

    /**
     * 设置下一节点
     */
    protected void setNextHandler(final AbstractTicketHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 处理请求  子类实现
     */
    abstract boolean handlerRequest(final EmployeeRequestTicket request);

    public void process(final EmployeeRequestTicket request) {
        AbstractTicketHandler handler = this;
        while (handler != null && !handler.handlerRequest(request)) {
            handler = handler.nextHandler;
        }
        if (handler == null) {
            System.out.println("没人处理");
        }
    }

}
