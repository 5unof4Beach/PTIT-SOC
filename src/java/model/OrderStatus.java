/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author suckm
 */
public class OrderStatus {

    private String OrderNumber, companyID, status;

    public OrderStatus(String OrderNumber, String companyID, String status) {
        this.OrderNumber = OrderNumber;
        this.companyID = companyID;
        this.status = status;
    }

    public String show() {
        return "<ul>"+
                "<li> Order Number: "+OrderNumber + "</li>"+
                "<li> Company ID: "+companyID + "</li>"+
                "<li> Status: "+status + "</li>"
               +"</ul>" ;
    }
}
