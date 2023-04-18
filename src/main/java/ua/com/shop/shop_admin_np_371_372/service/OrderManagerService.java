package ua.com.shop.shop_admin_np_371_372.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.shop_admin_np_371_372.entity.Order;
import ua.com.shop.shop_admin_np_371_372.repository.OrderRepository;

import java.util.List;

@Service
public class OrderManagerService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderManagerService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findListOrderByStatus(boolean status){
        return orderRepository.findByStatusOrder(status);
    }

    public List<Order> findAllOrder(){
        return orderRepository.findAll();
    }


    public void updateOrderNewStatus(Order order){

        if(order.isStatusOrder()){
            order.setStatusOrder(false);
        } else {
            order.setStatusOrder(true);
        }

        orderRepository.save(order);
    }


}
