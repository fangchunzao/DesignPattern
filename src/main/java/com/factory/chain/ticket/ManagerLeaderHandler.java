package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 8:02 下午
 **/
public class ManagerLeaderHandler extends AbstractTicketHandler {

    public ManagerLeaderHandler(final String name) {
        this.handlerName = name;
    }

    @Override
    boolean handlerRequest(final EmployeeRequestTicket request) {
        if (request.getLeaveDays() > DEPT_DAY && request.getLeaveDays() <= MANAGE_DAY) {
            System.out.println("总经理:" + handlerName + ",已经处理; 流程结束");
            return true;
        }
        return false;
    }
}
