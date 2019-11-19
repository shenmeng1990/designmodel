package com.alibaba.openandcloseprinciple.service.impl;

/**
 * @Author shenmeng
 * @Date 2019/11/18
 **/

public class FinanceBenzCar extends BenzCar {
    public FinanceBenzCar(String name, Double price) {
        super(name, price);
    }


    @Override
    public Double getPrice() {
        Double price = super.getPrice();
        if(price>=100){
            return price+price*0.05;
        }else if(price<100 && price>50){
            return price+price*0.1;
        }else{
            return price;
        }
    }
}
