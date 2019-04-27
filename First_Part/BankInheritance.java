class Bank{ //Super Class
    void RateofInterest(){
        System.out.println("Default ROI is 10.0%");
    }
}
class FirstBank extends Bank{ //FirstBank inherits Bank
    void RateofInterest(){
        System.out.println("FirstBank rate of interest: 7.3");
    }
}
class GTBank extends Bank{ //GTBank inherits Bank
    void RateofInterest(){
        System.out.println("GTBank rate of interest: 8.4");
    }
}
class UBA extends Bank{ //UBA inherits Bank
    void RateofInterest(){
    System.out.println("UBA rate of interest: 9.7");
    }
}
class BankInheritance{ 
    public static void main(String[] args){
        //instantializing objects
        Bank fbn = new FirstBank();
        Bank gtb = new GTBank();
        Bank ubbank = new UBA();
        //calling methods
        fbn.RateofInterest();
        gtb.RateofInterest();
        ubbank.RateofInterest();
    }
}