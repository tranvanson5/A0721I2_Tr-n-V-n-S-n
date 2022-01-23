package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static Map<Integer,Customer> customerMap;
    static {
        customerMap=new HashMap<>();
        customerMap.put(1,new Customer(1,"Tran Van Son","17-03-2001","Quang Nam","https://media.thethao247.vn/origin_850x0/upload/anhtuan/2020/09/23/mu-gia-han-hop-dong-du-khong-con-can-lingard-150338-1.jpg"));
        customerMap.put(2,new Customer(2,"Tran Van Son","17-03-2001","Quang Nam","https://media.thethao247.vn/origin_850x0/upload/anhtuan/2020/09/23/mu-gia-han-hop-dong-du-khong-con-can-lingard-150338-1.jpg"));
        customerMap.put(3,new Customer(3,"Tran Van Son","17-03-2001","Quang Nam","https://media.thethao247.vn/origin_850x0/upload/anhtuan/2020/09/23/mu-gia-han-hop-dong-du-khong-con-can-lingard-150338-1.jpg"));
        customerMap.put(4,new Customer(4,"Tran Van Son","17-03-2001","Quang Nam","https://media.thethao247.vn/origin_850x0/upload/anhtuan/2020/09/23/mu-gia-han-hop-dong-du-khong-con-can-lingard-150338-1.jpg"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }
}
