
import java.util.Scanner;

abstract class Marksheet {
        static String red = "\u001B[31m";
        static String re = "\u001B[37m";
        static String white = "\u001b[47m";
        static String b = "\u001b[40m";
        static String black = "\u001b[30m";
        static String Green = "\u001b[32m";
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
        public String getenrollno(){
                return enrollno;
        }

        abstract public void exam();

        public void display(int submarks[], int sem, String result) {
                int sum = 0;
                System.out.println(
                                " ___________________________________________________________________________________________________________________");
                System.out.println(black + white +
                                "|        * * *                               DEVI AHILYA VISHWAVIDYALAYA, INDORE                                    |"
                                + b);
                System.out.println(white +
                                "|      *       *                                      STATEMENT OF MARKS                                            |"
                                + b);
                System.out.println(white +
                                "|    *   DAVV    *                                                                                                  |"
                                + b);
                System.out.println(white +
                                "|    *           *                        (GRADE 'A+' UNIVERSITY, ACCREDITED BY NAAC)                               |"
                                + b);
                System.out.println(white +
                                "|      *       *                                                                                                    |"
                                + b);
                System.out.println(white +
                                "|        * * *                                                                                                      |"
                                + b);
                System.out.println(white + "|            B.C.A   SEM - " + sem
                                + "                                                                                        |"
                                + b);
                System.out.println(white +
                                "|                                   Name           :  Rahul Vishwakarma                                             |"
                                + b);
                System.out.println(white +
                                "|                                   Father name    :  Balram                                                        |"
                                + b);
                System.out.println(white +
                                "|                                   College name   :  PMB Gujrati Science College                                   |"
                                + b);
                System.out.println(white +
                                "|                                   Roll No        :  90070176                                                      |"
                                + b);
                System.out.println(white +
                                "|                                   Enrollment No  :  DX1910488                                                     |"
                                + b);
                System.out.println(white +
                                "|                                   Status        :   Regular                                                       |"
                                + b);
                System.out.println(white +
                                "|___________________________________________________________________________________________________________________|"
                                + b);
                System.out.println(white +
                                "|       SUBJECT                                         MARKS        TOTAL         MARKS OBTAINED         TOTAL     |"
                                + b);
                System.out.println(white +
                                "|___________________________________________________________________________________________________________________|"
                                + b);
                for (int i = 0; i < submarks.length; i++) {
                        if (i < 6) {
                                if (submarks[i] < 25) {
                                        System.out.println(white +
                                                        "|      SUBJECT-" + (i + 1)
                                                        + "                                         70          70                 "
                                                        + red + submarks[i] + re + "                 "
                                                        + red + submarks[i] + re + "       |" + b);
                                } else {
                                        System.out.println(white +
                                                        "|      SUBJECT-" + (i + 1)
                                                        + "                                         70          70                 "
                                                        + submarks[i] + "                 "
                                                        + submarks[i] + "       |" + b);
                                }
                        }

                        else {
                                if (submarks[i] < 15) {
                                        System.out.println(white +
                                                        "|      PRACTICAL-" + (i + 1)
                                                        + "                                       30          30                 "
                                                        + red + submarks[i] + re + "                 "
                                                        + red + submarks[i] + re + "       |" + b);
                                } else {
                                        System.out.println(white +
                                                        "|      PRACTICAL-" + (i + 1)
                                                        + "                                       30          30                 "
                                                        + submarks[i] + "                 "
                                                        + submarks[i] + "       |" + b);
                                }

                        }
                        sum = sum + submarks[i];

                }
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|___________________________________________________________________________________________________________________|"
                                + b);
                System.out.println(white +
                                "|                                       |                  480    |  Grand Total         |            "
                                + sum + "           |" + b);
                System.out.println(white +
                                "|_______________________________________|_________________________|_____________________ |__________________________|"
                                + b);
                System.out.println(white +
                                "|   I Yr    |    II Yr   |    III Yr    |    Total Marks | Result |    Division          |  Attempt                 |"
                                + b);
                System.out.println(white +
                                "|___________|____________|______________|________________|________|______________________|__________________________|"
                                + b);
                if (result.equals("PASS")) {
                        System.out.println(white +
                                        "| Obt.| Max | Obt. | Max | Obt. |  Max  |   Obj. |   Max |   " + result
                                        + "                             1                     |" + b);
                } else {
                        System.out.println(white +
                                        "| Obt.| Max | Obt. | Max | Obt. |  Max  |   Obj. |   Max |   " + red + result
                                        + re
                                        + "                             1                     |" + b);
                }

                System.out.println(white +
                                "|___________|____________|______________|________________|__________________________________________________________|"
                                + b);
                System.out.println(white +
                                "|                                          " + sum
                                + "       480                                                            |" + b);
                System.out.println(white +
                                "|___________________________________________________________________________________________________________________|"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|  Result Uploaded on : 27-02-25                                                                                    |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|      Not Official Copy                                            http://results.dauniv.ac.in                     |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                               @ Devi Ahiliya Vishwavidyalaya, Indore - 452017, India                              |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                           Disclaimer                                                              |"
                                + b);
                System.out.println(white +
                                "| DAVV is not responsible for any inadvertent error that may have crept in the results being published on           |"
                                + b);
                System.out.println(white +
                                "|   Net. The results published on net are for immediate information to the examinees. These cannot be               |"
                                + b);
                System.out.println(white +
                                "|   treated as original mark sheets. Original mark sheets are being issued by the University separately.            |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|                                                                                                                   |"
                                + b);
                System.out.println(white +
                                "|___________________________________________________________________________________________________________________|"
                                + b + re);

        }
}

class Semester extends Marksheet {
        private int submarks[];
        private int sem;
        private String result;
        private boolean[] flag;

        public Semester(String name, String collegename, String fathername, String rollno, String enrollno,
                        String status, int submarks[], int sem, boolean[] flag, String result) {
                super(name, collegename, fathername, rollno, enrollno, status);
                this.submarks = submarks;
                this.sem = sem;
                this.flag = flag;
                this.result = result;
        }

        public Semester() {

        }

        public void exam() {
                super.display(submarks, sem, result);

        }
}

class Degree extends Marksheet {
        public Degree(String name, String collegename, String fathername, String rollno, String enrollno,
                        String status) {
                super(name, collegename, fathername, rollno, enrollno, status);
        }

        public Degree() {
        }

        public void exam() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Issue Date");
                String date = sc.nextLine();
                System.out.println(
                                "__________________________________________________________________________________________");
                System.out.println(
                                "|                                                                                         |");
                System.out.println("|     Roll No. " + getrollno()
                                + "                                       ENGLISH TRANSLATION         |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                   FORMERLY KNOWN AS UNIVERSITY OF INDORE                |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                   DEVI AHILIYA VISHWAVIDYALAYA, INDORE                  |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                             * * *                                       |");
                System.out.println(
                                "|                                           *       *                                     |");
                System.out.println(
                                "|                                          *         *                                    |");
                System.out.println(
                                "|                                          *  DAVV   *                                    |");
                System.out.println(
                                "|                                          *         *                                    |");
                System.out.println(
                                "|                                           *       *                                     |");
                System.out.println(
                                "|                                             * * *                                       |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                   Bachelor of Computer Application                      |");
                System.out.println(
                                "|                                         Foreign Trade)                                  |");
                System.out.println("|                Certificate   that   ____________" + getname()
                                + "________________       |");
                System.out.println(
                                "|           Obtained  the  Degree   of    BACHELOR    OF    COMPUTER    APPLICATION       |");
                System.out.println(
                                "|           (Foreign Trade)   from   the   university   at    the   Examination           |");
                System.out.println(
                                "|            held   in   ______May 2025___________ and   was   placed   in   the          |");
                System.out.println(
                                "|           First Division.                                                               |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println("|           Name of the Institution : " + getcollegename()
                                + "                         |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println("|       Dated : " + date
                                + "                                             Vice Chancellor    |");
                System.out.println(
                                "|     ______Date of Issue______                                                           |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|                                                                                         |");
                System.out.println(
                                "|_________________________________________________________________________________________|");
        }
        public void migration(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Current Year");
                String year = sc.nextLine();
                System.out.println("Enter Issue Date ");
                String date = sc.nextLine();
                System.out.println(Green+" ______________________________________________________________________________________"+re);
                System.out.println(Green+"|                                                                                      |"+re);
                System.out.println(Green+"|                   DEVI AHILIYA VISHWAVIDHYALYA, INDORE (M.P.)                        |"+re);
                System.out.println(Green+"|                                                                                      |"+re);
                System.out.println(Green+"|         MIGRATION CERTIFICATE - "+year+"                                                 |"+re);
                System.out.println(Green+"|                                                                                      |"+re);
                System.out.println(Green+"|   Mr./Mrs. "+getname()+"                          Enrollment No. "+getenrollno()+"       |"+re);
                System.out.println(Green+"|    is informed  that  this University  has  no   Objection   to  his/her              |"+re);
                System.out.println(Green+"|   Migrating  to  another  University.  He/She  has  graduated   as   a                |"+re);
                System.out.println(Green+"|   student  at Bachelor  of  Computer   Appilication   Examination.                    |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|     University  House                                             signatue            |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|      Indore - 452001                              Date : "+date+ "                    |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|                                                                                       |"+re);
                System.out.println(Green+"|_______________________________________________________________________________________|"+re);
        }
}

class TestMain {
        public static void main(String[] args) {
                String re = "\u001B[37m";
                String b = "\u001b[40m";
                Scanner sc = new Scanner(System.in);
                System.out.println(b + re + "Enter your name ");
                String name = sc.nextLine();

                System.out.println("Enter your father name");
                String fathername = sc.nextLine();

                System.out.println("Enter your colleage name");
                String collegename = sc.nextLine();

                System.out.println("Enter your roll no. ");
                String rollno = sc.nextLine();

                System.out.println("Enter your enrollment no. ");
                String enrollno = sc.nextLine();

                System.out.println("Enter your status");
                String status = sc.nextLine();

                int count2 = 0;
                boolean flag1[] = new boolean[8];
                boolean flag2[] = new boolean[8];
                boolean flag3[] = new boolean[8];
                boolean flag4[] = new boolean[8];
                boolean flag5[] = new boolean[8];
                boolean flag6[] = new boolean[8];
                int atktmarks1[] = new int[8];
                int atktmarks2[] = new int[8];
                int atktmarks3[] = new int[8];
                int atktmarks4[] = new int[8];
                int atktmarks5[] = new int[8];
                int atktmarks6[] = new int[8];
                boolean flag = true;
                for (int i = 0; i < 6; i++) {
                        int semmarks1[] = new int[8];
                        int sem = i + 1;
                        String result = "";
                        int count=0;
                        System.out.println("~~~~~Now your " + sem + " sem exam started~~~~~");
                        flag = true;
                        int atktcount1 = 0,atktcount2 = 0,atktcount3 = 0,atktcount4 = 0,atktcount5 = 0,atktcount6 = 0;     
                        while(flag){
                                for (int j = 0; j < semmarks1.length; j++) {
                                        if (j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                semmarks1[j] = sc.nextInt();
                                                if (semmarks1[j] <= 70 && semmarks1[j] >= 0) {
                                                        continue;
                                                } else {

                                                        while (semmarks1[j] >= 70 || semmarks1[j] < 0) {
                                                                System.out.println("Invalid entered marks please re-enter");
                                                                semmarks1[j] = sc.nextInt();
                                                        }
                                                }
                                        } else {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                semmarks1[j] = sc.nextInt();
                                                if (semmarks1[j] <= 30 && semmarks1[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (semmarks1[j] >= 30 || semmarks1[j] < 0) {
                                                                System.out.println("Invalid entered marks please re-enter");
                                                                semmarks1[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<semmarks1.length; j++){
                                        if(j<6){
                                                if(semmarks1[j]<25){
                                                        count++;
                                                }
                                        }
                                        else{
                                                if(semmarks1[j]<15){
                                                        count++;
                                                }
                                        }
                                }
                                if(count==0){
                                        result = "PASS";
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, semmarks1, sem, flag6, result);
                                        obj.exam();
                                        if(i<5){
                                                System.out.println("~~~~~You are promoted for " +(i+2)+" sem~~~~~");
                                        }
                                        count2++;
                                        flag = false;
                                }
                                else if(count>2){
                                        result = "FAIL";
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, semmarks1, sem, flag6, result);
                                        obj.exam();
                                        flag = true;
                                        System.out.println("~~~~Sorry you are failed~~~~");
                                        System.out.println("~~~~Again your " +(i+1)+" sem exam start~~~~");
                                }
                                else{
                                        result = "ATKT";
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, semmarks1, sem, flag6, result);
                                        obj.exam();
                                        flag = false;
                                        if(i<5){
                                                System.out.println("~~~~~You are promoted for " +(i+2)+" sem~~~~~");
                                        }
                                }
                        }
                        if (i == 0) {
                                for(int j=0; j<atktmarks1.length; j++){
                                        atktmarks1[j] = semmarks1[j];
                                }  
                                for(int j=0; j<flag1.length; j++){
                                        if(j<6){
                                                if(atktmarks1[j]<25){
                                                        flag1[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks1[j]<15){
                                                        flag1[j] = true;
                                                }
                                        }
                                }  
                        }
                        if (i == 1) {
                                for(int j=0; j<atktmarks2.length; j++){
                                        atktmarks2[j] = semmarks1[j];
                                }
                                for(int j=0; j<flag2.length; j++){
                                        if(j<6){
                                                if(atktmarks2[j]<25){
                                                        flag2[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks2[j]<15){
                                                        flag2[j] = true;
                                                }
                                        }
                                }  
                        }
                        if (i == 2) {
                                for(int j=0; j<atktmarks3.length; j++){
                                        atktmarks3[j] = semmarks1[j];
                                }
                                for(int j=0; j<flag3.length; j++){
                                        if(j<6){
                                                if(atktmarks3[j]<25){
                                                        flag3[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks3[j]<15){
                                                        flag3[j] = true;
                                                }
                                        }
                                }  
                        }
                        if (i == 3) {
                                for(int j=0; j<atktmarks4.length; j++){
                                        atktmarks4[j] = semmarks1[j];
                                }
                                for(int j=0; j<flag4.length; j++){
                                        if(j<6){
                                                if(atktmarks4[j]<25){
                                                        flag4[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks4[j]<15){
                                                        flag4[j] = true;
                                                }
                                        }
                                }  
                        }
                        if (i == 4) {
                                for(int j=0; j<atktmarks5.length; j++){
                                        atktmarks5[j] = semmarks1[j];
                                }
                                for(int j=0; j<flag5.length; j++){
                                        if(j<6){
                                                if(atktmarks5[j]<25){
                                                        flag5[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks5[j]<15){
                                                        flag5[j] = true;
                                                }
                                        }
                                }  
                        }
                        if (i == 5) {
                                for(int j=0; j<atktmarks6.length; j++){
                                        atktmarks6[j] = semmarks1[j];
                                }
                                for(int j=0; j<flag6.length; j++){
                                        if(j<6){
                                                if(atktmarks6[j]<25){
                                                        flag6[j] = true;
                                                }
                                        }
                                        else{
                                                if(atktmarks6[j]<15){
                                                        flag6[j] = true;
                                                }
                                        }
                                }  
                        }
                        for (int j = 0; j < atktmarks1.length; j++) {
                                if (flag1[j] && j < 6) {
                                        if (atktmarks1[j] < 25) {
                                                flag1[j] = true;
                                                atktcount1++;
                                        } else {
                                                flag1[j] = false;
                                                atktcount1--;
                                        }
                                } else if (flag1[j] && j < 8) {
                                        if (atktmarks1[j] < 15) {
                                                flag1[j] = true;
                                                atktcount1++;
                                        } else {
                                                flag1[j] = false;
                                                atktcount1--;
                                        }
                                }
                        }
                        for (int j = 0; j < atktmarks2.length; j++) {
                                if (flag2[j] && j < 6) {
                                        if (atktmarks2[j] < 25) {
                                                flag2[j] = true;
                                                atktcount2++;
                                        } else {
                                                flag2[j] = false;
                                                atktcount2--;
                                        }
                                } else if (flag2[j] && j < 8) {
                                        if (atktmarks2[j] < 15) {
                                                flag2[j] = true;
                                                atktcount2++;
                                        } else {
                                                flag2[j] = false;
                                                atktcount2--;
                                        }
                                }
                        }
                        for (int j = 0; j < atktmarks3.length; j++) {
                                if (flag3[j] && j < 6) {
                                        if (atktmarks3[j] < 25) {
                                                flag3[j] = true;
                                                atktcount3++;
                                        } else {
                                                flag3[j] = false;
                                                atktcount3--;
                                        }
                                } else if (flag3[j] && j < 8) {
                                        if (atktmarks3[j] < 15) {
                                                flag3[j] = true;
                                                atktcount3++;
                                        } else {
                                                flag3[j] = false;
                                                atktcount3--;
                                        }
                                }
                        }
                        for (int j = 0; j < atktmarks4.length; j++) {
                                if (flag4[j] && j < 6) {
                                        if (atktmarks4[j] < 25) {
                                                flag4[j] = true;
                                                atktcount4++;
                                        } else {
                                                flag4[j] = false;
                                                atktcount4--;
                                        }
                                } else if (flag4[j] && j < 8) {
                                        if (atktmarks4[j] < 15) {
                                                flag4[j] = true;
                                                atktcount4++;
                                        } else {
                                                flag4[j] = false;
                                                atktcount4--;
                                        }
                                }
                        }
                        for (int j = 0; j < atktmarks5.length; j++) {
                                if (flag5[j] && j < 6) {
                                        if (atktmarks5[j] < 25) {
                                                flag5[j] = true;
                                                atktcount5++;
                                        } else {
                                                flag5[j] = false;
                                                atktcount5--;
                                        }
                                } else if (flag5[j] && j < 8) {
                                        if (atktmarks5[j] < 15) {
                                                flag5[j] = true;
                                                atktcount5++;
                                        } else {
                                                flag5[j] = false;
                                                atktcount5--;
                                        }
                                }
                        }
                        for (int j = 0; j < atktmarks6.length; j++) {
                                if (flag6[j] && j < 6) {
                                        if (atktmarks6[j] < 25) {
                                                flag6[j] = true;
                                                atktcount6++;
                                        } else {
                                                flag6[j] = false;
                                                atktcount6--;
                                        }
                                } else if (flag6[j] && j < 8) {
                                        if (atktmarks6[j] < 15) {
                                                flag6[j] = true;
                                                atktcount6++;
                                        } else {
                                                flag6[j] = false;
                                                atktcount6--;
                                        }
                                }
                        }
                        if(atktcount1>0){
                                int num=1;
                                System.out.println("~~~Now your 1 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks1.length; j++) {
                                        if (flag1[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks1[j] = sc.nextInt();
                                                if (atktmarks1[j] <= 70 && atktmarks1[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks1[j] >= 70 || atktmarks1[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks1[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag1[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks1[j] = sc.nextInt();
                                                if (atktmarks1[j] <= 30 && atktmarks1[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks1[j] >= 30 || atktmarks1[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks1[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks1.length; j++){
                                        if(flag1[j] && j<6){
                                                if( atktmarks1[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag1[j] && j<8){
                                                if(atktmarks1[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                }
                                        }
                                        
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks1, num, flag6, result);
                                        obj.exam();
                                }     
                        }
                        if(atktcount2>0){
                                int num=2;
                                System.out.println("~~~Now your 2 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks2.length; j++) {
                                        if (flag2[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks2[j] = sc.nextInt();
                                                if (atktmarks2[j] <= 70 && atktmarks2[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks2[j] >= 70 || atktmarks2[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks2[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag2[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks2[j] = sc.nextInt();
                                                if (atktmarks2[j] <= 30 && atktmarks2[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks2[j] >= 30 || atktmarks2[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks2[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks2.length; j++){
                                        if(flag2[j] && j<6){
                                                if( atktmarks2[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag2[j] && j<8){
                                                if(atktmarks2[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }       
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks2, num, flag2, result);
                                        obj.exam();
                                }         
                        }
                        if(atktcount3>0){
                                int num=3;
                                System.out.println("~~~Now your 3 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks3.length; j++) {
                                        if (flag3[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks3[j] = sc.nextInt();
                                                if (atktmarks3[j] <= 70 && atktmarks3[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks3[j] >= 70 || atktmarks3[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks3[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag3[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks3[j] = sc.nextInt();
                                                if (atktmarks3[j] <= 30 && atktmarks3[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks3[j] >= 30 || atktmarks3[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks3[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks3.length; j++){
                                        if(flag3[j] && j<6){
                                                if( atktmarks3[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag3[j] && j<8){
                                                if(atktmarks3[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks3, num, flag3, result);
                                        obj.exam();
                                }    
                        }
                        if(atktcount4>0){
                                int num=4;
                                System.out.println("~~~Now your 4 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks4.length; j++) {
                                        if (flag4[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks4[j] = sc.nextInt();
                                                if (atktmarks4[j] <= 70 && atktmarks4[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks4[j] >= 70 || atktmarks4[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks4[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag4[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks4[j] = sc.nextInt();
                                                if (atktmarks4[j] <= 30 && atktmarks4[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks4[j] >= 30 || atktmarks4[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks4[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks4.length; j++){
                                        if(flag4[j] && j<6){
                                                if( atktmarks4[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag4[j] && j<8){
                                                if(atktmarks4[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }       
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks4, num, flag4, result);
                                        obj.exam();
                                }      
                        }
                        if(atktcount5>0){
                                int num = 5;
                                System.out.println("~~~Now your 5 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks5.length; j++) {
                                        if (flag5[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks5[j] = sc.nextInt();
                                                if (atktmarks5[j] <= 70 && atktmarks5[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks5[j] >= 70 || atktmarks5[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks5[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag5[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks5[j] = sc.nextInt();
                                                if (atktmarks5[j] <= 30 && atktmarks5[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks5[j] >= 30 || atktmarks5[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks5[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks5.length; j++){
                                        if(flag5[j] && j<6){
                                                if( atktmarks5[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag5[j] && j<8){
                                                if(atktmarks5[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }       
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks5, num, flag5, result);
                                        obj.exam();
                                }    
                        }
                        if(atktcount6>0){
                                int num=6;
                                System.out.println("~~~Now your 6 sem ATKT exam start~~~");
                                for (int j = 0; j < atktmarks6.length; j++) {
                                        if (flag6[j] && j < 6) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 70");
                                                atktmarks6[j] = sc.nextInt();
                                                if (atktmarks6[j] <= 70 && atktmarks6[j] >= 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks6[j] >= 70 || atktmarks6[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks6[j] = sc.nextInt();
                                                        }
                                                }
                                        } else if (flag6[j] && j < 8) {
                                                System.out.println("Enter " + (j + 1) + " subject marks out of 30");
                                                atktmarks6[j] = sc.nextInt();
                                                if (atktmarks6[j] <= 30 && atktmarks6[j] > 0) {
                                                        continue;
                                                } else {
                                                        while (atktmarks6[j] >= 30 || atktmarks6[j] < 0) {
                                                                System.out.println(
                                                                                "Invalid entered marks please re-enter");
                                                                atktmarks6[j] = sc.nextInt();
                                                        }
                                                }
                                        }
                                }
                                for(int j=0; j<atktmarks6.length; j++){
                                        if(flag6[j] && j<6){
                                                if( atktmarks6[j]>25){
                                                result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }
                                        else if(flag6[j] && j<8){
                                                if(atktmarks6[j]>15){
                                                        result = "PASS";
                                                }
                                                else{
                                                        result = "ATKT";
                                                        break;
                                                }
                                        }      
                                }
                                if(result=="PASS"){
                                        count2++;
                                }
                                System.out.println("Do you want to see your ATKT result");
                                System.out.println("Enter : Yes/y and No/n");
                                char ch = sc.next().charAt(0);
                                if(ch=='y'){
                                        Semester obj = new Semester(name, collegename, fathername, rollno, enrollno, status, atktmarks6, num, flag6, result);
                                        obj.exam();
                                }
                        }         
                }
                if(count2==6){
                        System.out.println("Do you want to take Degree");
                        System.out.println("Enter : Yes/y or No/n");
                        char c = sc.next().charAt(0);
                        if(c=='y'){
                                Degree deg = new Degree(name, collegename, fathername, rollno, enrollno, status);
                                deg.exam();
                        }
                        System.out.println("Do you want to take Migration");
                        System.out.println("Enter : Yes/y or No/n");
                        char chh = sc.next().charAt(0);
                        if(chh=='y'){
                                Degree deg = new Degree(name, collegename, fathername, rollno, enrollno, status);
                                deg.migration();
                        }
                }
        }
}
