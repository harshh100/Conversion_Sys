public class HtoX {

    int CtoI(char c) {
        switch (c) {
            case '1':
                return 1;

            case '2':
                return 2;

            case '3':
                return 3;

            case '4':
                return 4;

            case '5':
                return 5;

            case '6':
                return 6;

            case '7':
                return 7;

            case '8':
                return 8;

            case '9':
                return 9;

            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;

            case 'E':
                return 14;

            case 'F':
                return 15;

        }
        return 0;
    }


        int HtoB (String H){

            char[] char_a = H.toCharArray();
            int B = 0;
            int[] int_a = new int[char_a.length];
            for (int i = char_a.length - 1; i >= 0; i--) {

                int_a[i] = CtoI(char_a[i]);

                DtoX objforHtoB = new DtoX();

                B += objforHtoB.DtoB(int_a[i]) * Math.pow(10000, char_a.length - i - 1);
            }
            return B;
        }


        int HtoD(String H){
            char[] char_a = H.toCharArray();
            int D = 0;
            int[] int_a = new int[char_a.length];
            for (int i = char_a.length - 1; i >= 0; i--) {

                int_a[i] = CtoI(char_a[i]);

                D+=int_a[i]*Math.pow(16, char_a.length - i - 1);

            }
        return D;
        }

        int HtoO(String H){

            int HtoO_B=HtoB(H);
            BtoX objforHtoO = new BtoX();
            int O = objforHtoO.BtoO(HtoO_B);
            return O;

        }



}






//class maiin{
//    public static void main(String[] args) {
//        HtoX obj1=new HtoX();
//       int te=obj1.HtoO("2D");
//        System.out.println(te);
//    }
//}

