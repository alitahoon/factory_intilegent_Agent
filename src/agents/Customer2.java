/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agents;

import factorywithagent.myProjectsTools;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jdk.nashorn.internal.ir.Block;

public class Customer2 extends Agent {

    private static String product;
    private static double prise;
    private static int Quantity;
//    
//    public Customer1(String product, double prise, int Quantity) {
//        this.product = product;
//        this.prise = prise;
//        this.Quantity = Quantity;
//    }
    private AID factoryID = new AID();

    @Override
    protected void setup() {
        System.out.println("Hello From customer agent");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aa = receive();
                if (aa != null) {
                    String con = aa.getContent();
                    myProjectsTools.msgbooks(con);
                    myProjectsTools.msgbooks(aa.getSender().toString());
                    ACLMessage a1 = aa.createReply();
                    a1.setPerformative(ACLMessage.INFORM);
                    a1.setContent(product + " " + prise + " " + Quantity);
                    send(a1);
                } else {
                    block();
                }
            }
        });

    }

    public void setProduct(String product) {
        this.product = product;

    }

    public void setPrise(double prise) {
        this.prise = prise;

    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;

    }

}
