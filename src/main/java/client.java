import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class client {
    public static void main(String[] args) {
        BanqueService ghs=new BanqueWS().getBanqueServicePort();
        System.out.println(" Conversion $ >>"+ghs.conversion(549502));
        List<Compte> compteList = ghs.listofComptes();
        for (Compte c: compteList) {
            System.out.println(c.getCode()+"<<Code "+c.getSolde()+" <<Solde ");
        }
    }
}
