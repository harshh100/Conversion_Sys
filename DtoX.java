
public class DtoX {

    int DtoB(int D){
        int DtoB_B=0,DtoB_rm;
        double DtoB_i=0;

        while (D>0){
            DtoB_rm=D%2; //1   0   0   1   1
            D=D/2;  //12  6   3   1   0
            DtoB_B+=DtoB_rm*(int)Math.pow(10,DtoB_i);  //1   1   1   1001   11001
            DtoB_i++;
        }

        return DtoB_B;
    }

    int DtoO(int D){
        int DtoO_O=0,DtoO_rm;
        double DtoO_i=0;

        while (D>0){
            DtoO_rm=D%8;
            D=D/8;
            DtoO_O+=DtoO_rm*(int)Math.pow(10,DtoO_i);
            DtoO_i++;
        }

        return DtoO_O;

    }

    String DtoH(int D){
         int DtoH_rm;
         String DtoH_H="";
        while (D>0){
            DtoH_rm=D%16;
            D=D/16;
            if(DtoH_rm==10){
                DtoH_H= "A" + DtoH_H;
            } else if (DtoH_rm==11) {
                DtoH_H= "B" + DtoH_H;
            } else if (DtoH_rm==12) {
                DtoH_H= "C" +DtoH_H;
            } else if (DtoH_rm==13) {
                DtoH_H= "D" + DtoH_H;
            } else if (DtoH_rm==14) {
                DtoH_H= "E" + DtoH_H;
            } else if (DtoH_rm==15) {
                DtoH_H= "F" + DtoH_H;
            }
            else {
                DtoH_H=Integer.toString(DtoH_rm)+DtoH_H;
            }

        }
        return DtoH_H;

    }
}

//class maiin{
//    public static void main(String[] args) {
//        DtoX obj1=new DtoX();
//       int te=obj1.DtoB(7);
//        System.out.println(te);
//    }
//}