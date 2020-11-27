/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10.pkg10119916.dianarpian;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * 
 */
public class QUIZIF1010119916DIANARPIAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer cst    = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        cst.setName(scanner.next());
        System.out.print("Customer Email \t : ");
        cst.setEmail(scanner.next());
        
        sp.displayService();
        serviceItem = scanner.nextInt();
        sp.setpriceService(sp.getPrice(serviceItem));
        
        System.out.print("Are you Member (yes/no) : ");
        isMember = sp.checkMemberStatus(scanner.next());
        
        discount = sp.getSale(isMember, sp.getPriceService());
        
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction : " + cst.currentTime());
        System.out.println("Service Price : " + sp.getServicePrice());
        System.out.println("Discount : " + discount);
        System.out.println("Total Pay : " + sp.getTotalPay(sp.getPriceService(), discount));
    }
    
}
    

