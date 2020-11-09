package com.github.hcsp.service;

import com.github.hcsp.anno.Cache;
import com.github.hcsp.dao.OrderDao;
import com.github.hcsp.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private OrderDao orderDao;

    @Cache
    public List<Order> getGoodsRankByDesc() {
        return orderDao.getGoodsRankByDesc();
    }
}
