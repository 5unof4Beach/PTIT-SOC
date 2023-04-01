/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duc;

import com.database.MysqlCon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.OrderStatus;

/**
 *
 * @author suckm
 */
@WebService(serviceName = "SOC")
public class SOC {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "checkOrderStatus")
    public String checkOrderStatus(@WebParam(name="ordNo") String OrderNumber,@WebParam(name="comId") String companyID){
        System.out.println("com.duc.SOC.checkOrderStatus()");
        MysqlCon db = new MysqlCon();
        Connection con = db.connector();
        String query = "Select * from orders where order_id = '"+OrderNumber+"' and company_id = '"+companyID+"'";
//        String query = "Select * from orders";
        System.out.println(query);
        List<OrderStatus> list = new ArrayList<>();
        try {
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(query);
            while(rs.next()){
                list.add(new OrderStatus(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
        }
        if(list.isEmpty())
            return "Khong tim thay thong tin don hang";
        else
            return list.get(0).show();
    }
}
