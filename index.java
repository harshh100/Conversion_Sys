import java.util.Scanner;
public class index {

    public static void main(String[] args) {

        Scanner hp =new Scanner(System.in);
        int Ibase,Obase=0,Inumber=0;
        String Istring="";
        int flage_w=0;
        System.out.println("- - - - Enter the Your Base and your number - - - -");
        System.out.print("Original Base : ");
        Ibase= hp.nextInt();

        if(Ibase==16){
            System.out.print("Original Number : ");
            Istring= hp.next();
        }else {
            System.out.print("Original Number : ");
            Inumber= hp.nextInt();
        }

        if(Ibase!=2 && Ibase!=8 && Ibase!=10 && Ibase!=16){
            System.out.println("INVALID!!!,Your Original Base Should Be 2 or 8 or 10 or 16");
            flage_w=1;
        }else {
            System.out.println("- - - - Enter the Base in which you Want to convert your number - - - -");
            System.out.print("Converted Base : ");
            Obase= hp.nextInt();

            if(Obase!=2 && Obase!=8 && Obase!=10 && Obase!=16){
                System.out.println("INVALID!!!,Your Converted Base Should Be 2 or 8 or 10 or 16");

            }
            else {






       if(Ibase==2){
            int chB=Inumber;
            int chBrm;
            int warong=0;

            while (chB>0){
                chBrm=chB%10;
                chB=chB/10;
                if(chBrm>1){
                    warong=1;
                    System.out.println("Wrong Input !!!!,Enter valid Original Number according to Original Base");
                    break;

                }
            }
            if(warong==0){

                BtoX obj=new BtoX();
                if(Obase==8){
                    int Ans=obj.BtoO(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==10) {
                    int Ans= obj.BtoD(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==16) {
                    String Ans= obj.BtoH(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==2) {
                    System.out.println("Converted Number : "+Inumber);

                }

            }
        } else if (Ibase==10) {
            DtoX obj = new DtoX();
            if(Obase==2){
                int Ans=obj.DtoB(Inumber);
                System.out.println("Converted Number : "+Ans);
            } else if (Obase==8) {
               int Ans= obj.DtoO(Inumber);
                System.out.println("Converted Number : "+Ans);
            } else if (Obase==16) {
                String Ans= obj.DtoH(Inumber);
                System.out.println("Converted Number : "+Ans);
            } else if (Obase==10) {
                System.out.println("Converted Number : "+Inumber);
            }

        } else if (Ibase==8) {
            int chO=Inumber;
            int chOrm;
            int warong=0;
            while (chO>0){
                chOrm=chO%10;
                chO=chO/10;
                if(chOrm>8){
                    warong=1;
                    System.out.println("Wrong Input !!!!,Enter valid Original Number according to Original Base");
                    break;

                }
            }
            if(warong==0){

                OtoX obj =new OtoX();
                if(Obase==2){
                    int Ans=obj.OtoB(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==10) {
                    int Ans= obj.OtoD(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==16) {
                    String Ans= obj.OtoH(Inumber);
                    System.out.println("Converted Number : "+Ans);
                } else if (Obase==8) {
                    System.out.println("Converted Number : "+Inumber);

                }

            }
        } else if (Ibase==16) {
           HtoX obj = new HtoX();

           if(Obase==2){
               int Ans=obj.HtoB(Istring);
               System.out.println("Converted Number : "+Ans);
           } else if (Obase==8) {
               int Ans= obj.HtoO(Istring);
               System.out.println("Converted Number : "+Ans);
           } else if (Obase==10) {
               int Ans= obj.HtoD(Istring);
               System.out.println("Converted Number : "+Ans);
           } else if (Obase==16) {
               System.out.println("Converted Number : "+Inumber);
           }else {
               System.out.println("INVALID!!!,Your Converted Base Should Be 2 or 8 or 10 or 16");

           }
        }


      }
        }

    }
}
