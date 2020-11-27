/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10.pkg10119916.dianarpian;

/**
 *
 * @author DIAN
 */
public class ServicePrice implements ServiceItem {
    float priceService;
    float discount;

    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
    }

    @Override
    public float getPrice(int serviceItem) {
        if(serviceItem ==1 ){
            return 45;
        }else if (serviceItem ==2){
            return 55;
        }else if (serviceItem ==3){
            return 15;
        }
        
        return 0;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("Member")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
         if(isMember)
         {
        
            return (float) (parServicePrice * 0.1);
        }
        else
        {
            return 0;
        }
    }
     public float getTotalPay(float priceService, float discount)
    {
        return priceService - discount;
    }

    void setpriceService(float price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    float getPriceService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getServicePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}