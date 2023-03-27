package kaffemachine;

public class SizePreis {
    public static void main(String[] args)

    {

    }

        public static double sizePreisOfAmericano(int numberA){

            double secim = 0;

            double [] AmericanoPreisList1 = {1.00,1.50,2.00,2.50};

            secim=AmericanoPreisList1[numberA-1];
            return secim;
        }
        public static double sizePreisOfCappucino(int numberB){
            double secim = 0;
            double [] CappucinoCappucinoList1 = {1.50,2.00,2.50,3.50};


            secim=CappucinoCappucinoList1[numberB-1];
            return secim;
        }

        public static double sizePreisOfEspresso(int numberC){
            double secim = 0;
            double [] EspressoPreisList1 = {1.50,2.00,2.50,3.00};


            secim=EspressoPreisList1[numberC-1];
            return secim;
        }
        public static double sizePreisOfLatte(int numberD) {
            double secim = 0;
            double[] LattePreisList1 = { 2.00, 2.50,3.00,3.50};


            secim = LattePreisList1[numberD - 1];
            return secim;
        }
        public static double sizePreisOfMocha(int numberE) {
            double secim = 0;
            double[] MochaPreisList1 = {2.00, 2.50,3.00,3.50};


            secim = MochaPreisList1[numberE - 1];
            return secim;
        }
        public static double sizePreisOfMacchiato(int numberF) {
            double secim = 0;
            double[] MacchiatoPreisList1 = {2.00, 2.50,3.00,3.50};


            secim = MacchiatoPreisList1[numberF - 1];
            return secim;
        }
        public static double sizePreisOfDecaf(int numberG) {
            double secim = 0;
            double[] DecafPreisList1 = {1.50,2.00,2.50,3.00};
            // sayilar degisecek

            secim = DecafPreisList1[numberG - 1];
            return secim;
        }


    }

