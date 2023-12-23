import java.util.Scanner;

abstract class Marksheet {
        static String red = "\u001B[31m";
        static String re = "\u001B[37m";
        private String name, collegename, fathername, rollno, enrollno;
        private String status;

        public Marksheet(String name, String collegename, String fathername, String rollno, String enrollno,
                        String status) {
                this.name = name;
                this.collegename = collegename;
                this.fathername = fathername;
                this.rollno = rollno;
                this.enrollno = enrollno;
                this.status = status;
        }

        public Marksheet() {

        }

        public String getcollegename() {
                return collegename;
        }

        public String getname() {
                return name;
        }

        public String getrollno() {
                return rollno;
        }

        abstract public void exam();

        public void display(int submarks[], int sem, String result) {
                int sum = 0;
                System.out.println(
                                " ___________________________________________________________________________________________________________________");
                System.out.println(
                                "|        * * *                               DEVI AHILYA VISHWAVIDYALAYA, INDORE                                    |");
                System.out.println(
                                "|      *       *                                      STATEMENT OF MARKS                                            |");
                System.out.println(
                                "|    *   DAVV    *                                                                                                  |");
                System.out.println(
                                "|    *           *                        (GRADE 'A+' UNIVERSITY, ACCREDITED BY NAAC)                               |");
                System.out.println(
                                "|      *       *                                                                                                    |");
                System.out.println(
                                "|        * * *                                                                                                      |");
                System.out.println("|            B.C.A   SEM - " + sem
                                + "                                                                                        |");
                System.out.println(
                                "|                                   Name           :  Rahul Vishwakarma                                             |");
                System.out.println(
                                "|                                   Father name    :  Balram                                                        |");
                System.out.println(
                                "|                                   College name   :  PMB Gujrati Science College                                   |");
                System.out.println(
                                "|                                   Roll No        :  90070176                                                      |");
                System.out.println(
                                "|                                   Enrollment No  :  DX1910488                                                     |");
                System.out.println(
                                "|                                   Status        :   Regular                                                       |");
                System.out.println(
                                "|___________________________________________________________________________________________________________________|");
                System.out.println(
                                "|       SUBJECT                                         MARKS        TOTAL         MARKS OBTAINED         TOTAL     |");
                System.out.println(
                                "|___________________________________________________________________________________________________________________|");
                for (int i = 0; i < submarks.length; i++) {
                        if (i < 6) {
                                if (submarks[i] < 23) {
                                        System.out.println(
                                                        "|      SUBJECT-" + (i + 1)
                                                                        + "                                         70          70                 "
                                                                        + red + submarks[i] + re + "                 "
                                                                        + red + submarks[i] + re + "       |");
                                } else {
                                        System.out.println(
                                                        "|      SUBJECT-" + (i + 1)
                                                                        + "                                         70          70                 "
                                                                        + submarks[i] + "                 "
                                                                        + submarks[i] + "       |");
                                }
                        }

                        else {
                                if (submarks[i] < 15) {
                                        System.out.println(
                                                        "|      PRACTICAL-" + (i + 1)
                                                                        + "                                       30          30                 "
                                                                        + red + submarks[i] + re + "                 "
                                                                        + red + submarks[i] + re + "       |");
                                } else {
                                        System.out.println(
                                                        "|      PRACTICAL-" + (i + 1)
                                                                        + "                                       30          30                 "
                                                                        + submarks[i] + "                 "
                                                                        + submarks[i] + "       |");
                                }

                        }
                        sum = sum + submarks[i];

                }
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|___________________________________________________________________________________________________________________|");
                System.out.println(
                                "|                                       |                  480    |  Grand Total         |            "
                                                + sum + "           |");
                System.out.println(
                                "|_______________________________________|_________________________|_____________________ |__________________________|");
                System.out.println(
                                "|   I Yr    |    II Yr   |    III Yr    |    Total Marks | Result |    Division          |  Attempt                 |");
                System.out.println(
                                "|___________|____________|______________|________________|________|______________________|__________________________|");
                if (result.equals("PASS")) {
                        System.out.println(
                                        "| Obt.| Max | Obt. | Max | Obt. |  Max  |   Obj. |   Max |   " + result
                                                        + "                             1                     |");
                } else {
                        System.out.println(
                                        "| Obt.| Max | Obt. | Max | Obt. |  Max  |   Obj. |   Max |   " + red + result
                                                        + re
                                                        + "                             1                     |");
                }

                System.out.println(
                                "|___________|____________|______________|________________|__________________________________________________________|");
                System.out.println(
                                "|                                          " + sum
                                                + "       480                                                            |");
                System.out.println(
                                "|___________________________________________________________________________________________________________________|");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|  Result Uploaded on : 27-02-23                                                                                    |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|      Not Official Copy                                            http://results.dauniv.ac.in                     |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                               @ Devi Ahiliya Vishwavidyalaya, Indore - 452017, India                              |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                           Disclaimer                                                              |");
                System.out.println(
                                "| DAVV is not responsible for any inadvertent error that may have crept in the results being published on           |");
                System.out.println(
                                "|   Net. The results published on net are for immediate information to the examinees. These cannot be               |");
                System.out.println(
                                "|   treated as original mark sheets. Original mark sheets are being issued by the University separately.            |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|                                                                                                                   |");
                System.out.println(
                                "|___________________________________________________________________________________________________________________|");

        }
}
class Sem1 extends Marksheet{
    private int submarks1[];
    private boolean flag1[];
    public Sem1(String name, String collegename, String fathername, String rollno, String enrollno,String status,int submarks1,boolean flag[]){
        super(name, collegename, fathername, rollno, enrollno, status);
    }
    public Sem1(){

    }
    public void exam(){
        Scanner sc= new Scanner(System.in);
        int submarks1[] = new int[8];
        boolean flag1[] = new boolean[8];
        int count1=0;
        for (int j = 0; j < submarks1.length; j++) {
            if (j < 6) {
                    System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                    submarks1[j] = sc.nextInt();
                    if (submarks1[j] <= 70 && submarks1[j] >= 0) {
                            continue;
                    } else {
                            while (submarks1[j] >= 70 || submarks1[j] < 0) {
                                    System.out.println("Invalid entered marks please re-enter");
                                    submarks1[j] = sc.nextInt();
                            }
                    }
            } else {
                    System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                    submarks1[j] = sc.nextInt();
                    if (submarks1[j] <= 30 && submarks1[j] >= 0) {
                            continue;
                    } else {
                            while (submarks1[j] >= 30 || submarks1[j] < 0) {
                                    System.out.println("Invalid entered marks please re-enter");
                                    submarks1[j] = sc.nextInt();
                            }
                    }
            }
            for(int i=0; i<submarks1.length; i++){
                if(i<6){
                    if(submarks1[i]<23){
                        count1++;
                        flag1[i] = false;
                    }
                    else{
                        flag1[i] = true;
                    }
                }
                else{
                    if(submarks1[i]<15){
                        count1++;
                    }
                    else{
                        flag1[i] = true; 
                    }
                }
            }
            if(count1>2){
                while(count1<=2){
                    

                }
            }
    }
    }
}
