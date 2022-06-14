package agents;

import factorywithagent.mainForm;
import static factorywithagent.mainForm.*;
import factorywithagent.myProjectsTools;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali Tahoon
 */
public class factory extends Agent {

    @Override
    protected void setup() {
//        addBehaviour(new OneShotBehaviour() {
//            @Override
//            public void action() {
//                factoryProjectWithAgentsController f=new factoryProjectWithAgentsController();
//                f.setTblData("orandJuse", 4.5, 6);
//            }
//        });
        String reciever = JOptionPane.showInputDialog("Enter customer ID");
        System.out.println("Factory start sending massege.... ");
        ACLMessage acl = new ACLMessage();
        acl.addReceiver(new AID("Customer" + reciever, false));
        acl.setContent("hello " + "Customer" + reciever + " form factory *** Choose What you want...");
        acl.setPerformative(ACLMessage.INFORM);
        send(acl);
        //reseive order
        System.out.println("Hello From customer2" + reciever);
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage aa = receive();
                if (aa != null) {
                    String con = aa.getContent();

                    StringTokenizer st = new StringTokenizer(con);
                    String productName = "";
                    double balance = 0;
                    int Quantity = 0;
                    while (st.hasMoreTokens()) {

                        productName = st.nextToken();

                        balance = Double.parseDouble(st.nextToken());

                        Quantity = Integer.parseInt(st.nextToken());

                    }
//                    System.out.println(productName);
//                    System.out.println(balance);
//                    System.out.println(Quantity);
                    /**
                     * يسطا احنا عملنا ابديت للكميه والفلوس اللي مع بيشتري
                     * عاوزين لما يشتري ال جي يو اي يختفي ويظهر واحد جديد فيه
                     * القيم الجديده اللي اتعدلت
                     */
                    /**
                     * update values borrow money
                     */
                    if ("kiwi".equals(productName)) {
                        if (balance == 0) {
                            myProjectsTools.msgbooks("you do not have monay , but you can borrow ..." + (Quantity * price1));
                        } else if (balance < 0) {
                            myProjectsTools.msgbooks("Pay the money you owe .. and it's " + Math.abs(balance));
                        } else if ((Quantity * price1) > balance) {
                            myProjectsTools.msgbooks("you do not have enough monay , but you can borrow ..." + ((Quantity * price1) - balance));
                        } else {
                            balance -= (Quantity * price1);
                            new mainForm().amount1 -= Quantity;
                            myProjectsTools.msgbooks("ok");
                        }
                    } else if ("orange".equals(productName)) {
                        if (balance == 0) {
                            myProjectsTools.msgbooks("you do not have monay , but you can borrow ..." + (Quantity * price2));
                        } else if (balance < 0) {
                            myProjectsTools.msgbooks("Pay the money you owe ..and it's " + Math.abs(balance));
                        } else if ((Quantity * price2) > balance) {
                            myProjectsTools.msgbooks("you do not have enough monay , but you can borrow ..." + ((Quantity * price2) - balance));
                        } else {
                            balance -= (Quantity * price2);
                            new mainForm().amount2 -= Quantity;
                            myProjectsTools.msgbooks("ok");
                        }
                    } else if ("apple".equals(productName)) {
                        if (balance == 0) {
                            myProjectsTools.msgbooks("you do not have monay , but you can borrow ..." + (Quantity * price3));
                        } else if (balance < 0) {
                            myProjectsTools.msgbooks("Pay the money you owe .. and it's " + Math.abs(balance));
                        } else if ((Quantity * price3) > balance) {
                            myProjectsTools.msgbooks("you do not have enough monay , but you can borrow ..." + ((Quantity * price3) - balance));
                        } else {
                            balance -= (Quantity * price3);
                            new mainForm().amount3 -= Quantity;
                            myProjectsTools.msgbooks("ok");
                        }
                    }
                }
            }
        }
        );
    }
}
