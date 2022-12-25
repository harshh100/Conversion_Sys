public class BtoX {

    int BtoD(int B){
    int BtoD_D=0;
    double BtoD_i=0;
    while (B>0){
        int BtoD_rm=B%10;
        B=B/10;

        BtoD_D+= BtoD_rm*Math.pow(2,BtoD_i);
        BtoD_i++;
    }
    return BtoD_D;
    }


    int BtoO(int B){
        int BtoO_O=0;
        double BtoO_i=0;
        while (B>0){
            int BtoO_rm=B%1000;
            B=B/1000;
            BtoX objforBtod =new BtoX();
            BtoO_O+=objforBtod.BtoD(BtoO_rm)*(int)Math.pow(10,BtoO_i);
            BtoO_i++;
        }
        return BtoO_O;

    }

    String BtoH(int B){
        String BtoH_H="";
        double BtoH_i=0;
        while (B>0){
            int BtoH_rm=B%10000;
            B=B/10000;
            BtoX objforBtoH =new BtoX();
            int BtoH_Brm =objforBtoH.BtoD(BtoH_rm);
           // String BtoH_temp=Integer.toString(objforBtoH.BtoD(BtoH_rm));
            if(BtoH_Brm==10){
                BtoH_H= "A" + BtoH_H;
            } else if (BtoH_Brm==11) {
                BtoH_H= "B" + BtoH_H;
            } else if (BtoH_Brm==12) {
                BtoH_H= "C" +BtoH_H;
            } else if (BtoH_Brm==13) {
                BtoH_H= "D" + BtoH_H;
            } else if (BtoH_Brm==14) {
                BtoH_H= "E" + BtoH_H;
            } else if (BtoH_Brm==15) {
                BtoH_H= "F" + BtoH_H;
            }
            else {
                BtoH_H=Integer.toString(BtoH_Brm)+BtoH_H;
            }
            //BtoH_H=BtoH_temp+BtoH_H;
            BtoH_i++;
        }
        return BtoH_H;

    }

}

//class maiin{
//    public static void main(String[] args) {
//        BtoX obj1=new BtoX();
//       String te=obj1.BtoH(101010);
//        System.out.println(te);
//    }
//}
