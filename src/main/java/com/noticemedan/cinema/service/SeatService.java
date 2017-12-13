package com.noticemedan.cinema.service;

import com.noticemedan.cinema.entity.SeatEntity;

import java.util.List;

public class SeatService extends BaseService {
    public SeatService() { super(); }

    public void bookSeat(List<String> seatNumber, int showId, int orderId) {
        seatDao.bookSeat(seatNumber, showId, orderId);
    }

    public List<SeatEntity> getOrderSeats(int orderId) {
        return seatDao.getOrderSeats(orderId);
    }

    public List<SeatEntity> getBookedSeatsByShowId(int orderId) {
        return this.seatDao.getBookedSeatsByShowId(orderId);
    }
}
