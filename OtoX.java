public class OtoX {

    int OtoB(int O){
        int OtoB_B=0,OtoB_rm=0;
        double OtoB_i=0;
        while (O>0){
            OtoB_rm=O%10;
            O=O/10;
            DtoX objforOtoB=new DtoX();
            OtoB_B+=objforOtoB.DtoB(OtoB_rm)*Math.pow(1000,OtoB_i);
            OtoB_i++;
        }
        return OtoB_B;
    }

    int OtoD(int O){
        int OtoD_D=0;
        double OtoD_i=0;
        while (O>0){
            int rm=O%10;
            O=O/10;

            OtoD_D+= rm*Math.pow(8,OtoD_i);
            OtoD_i++;
        }
        return OtoD_D;
    }

    String OtoH(int O){

        String OtoH_H="";
        OtoX objforOtoH1 =new OtoX();
        int OtoH_B=objforOtoH1.OtoB(O);
        BtoX objforOtoH2 = new BtoX();
        OtoH_H=objforOtoH2.BtoH(OtoH_B);

        return OtoH_H;
    }

}

//class maiin{
//    public static void main(String[] args) {
//        OtoX obj1=new OtoX();
//       String te=obj1.OtoH(1234);
//        System.out.println(te);
//    }
//}