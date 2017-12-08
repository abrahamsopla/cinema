package com.noticemedan.cinema.controller;

import com.noticemedan.cinema.entity.OrderEntity;
import com.noticemedan.cinema.entity.SeatEntity;
import com.noticemedan.cinema.service.OrderService;

import java.util.List;

public class OrderController {
    private OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService();
    }

    public List<OrderEntity> getCostumerOrders(String phoneNumber, int orderId) {
        return orderService.getCostumerOrders(orderId, phoneNumber);
    }
}
