package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 7:54 下午
 **/
public class DirectLeaderHandler extends AbstractTicketHandler {

    public DirectLeaderHandler(final String name) {
        this.handlerName = name;
    }

    @Override
    boolean handlerRequest(final EmployeeRequestTicket request) {
        if (request.getLeaveDays() <= DIRECT_DAY) {
            System.out.println("直接主管:" + handlerName + ",已经处理; 流程结束");
            return true;
        }
        return false;
    }
}
