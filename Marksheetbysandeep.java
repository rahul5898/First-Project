
import java.util.Scanner;

class Marksheet {

    String name;
    String fname;
    String rollno;

    public Marksheet() {
    }

    public Marksheet(String name, String fname, String rollno) {
        this.name = name;
        this.fname = fname;
        this.rollno = rollno;

    }
}

class sem1 extends Marksheet {

    String sub[] = { "maths         ", "I.T           ", "bussines      ", "C.P           ", "intro of comp ",
            "statics       ",
            "practical 1   ", "practical 2   " };
    int marks[] = new int[8];
    boolean result[] = new boolean[8];
    String grade[] = new String[8];

    public sem1() {
    }

    public sem1(String name, String fname, String rollno) {
        super(name, fname, rollno);

    }
}

class sem2 extends Marksheet {

    public sem2() {
    }

    public sem2(String name, String fname, String rollno) {
        super(name, fname, rollno);

        String sub[] = { "maths              ", "Data Analysis      ", "Data Structure     ", "Database Management",
                "Digital Electronics",
                "bussiness management", "practical 1        ", "practical 2        " };
        int marks[] = new int[8];
        boolean result[] = new boolean[8];

    }
}

class sem3 extends Marksheet {
    public sem3() {
    }

    public sem3(String name, String fname, String rollno) {
        super(name, fname, rollno);

        String sub[] = { "maths               ", "Software Engineering", "Financial Accounting ",
                "Oops                ", "Computer Architecture",
                "Mobile  Development", "practical 1          ", "practical 2          " };
        int marks[] = new int[8];
        boolean result[] = new boolean[8];

    }
}

class sem4 extends Marksheet {
    public sem4() {
    }

    public sem4(String name, String fname, String rollno) {
        super(name, fname, rollno);

        String sub[] = { "Java Language    ", "Website Designing ", "Business Economics", "Net Programming   ",
                "Mobile Development", "Operating System ", "practical 1       ", "practical 2       " };
        int marks[] = new int[8];
        boolean result[] = new boolean[8];

    }
}

class sem5 extends Marksheet {
    public sem5() {
    }

    public sem5(String name, String fname, String rollno) {
        super(name, fname, rollno);

        String sub[] = { "UNIX and Shell Programming", "Computer Technologies     ", "PHP and MySQL          ",
                "Graphics and Animation   ", "Python Programming        ", "Operating System 2        ",
                "practical 1                ",
                "practical 2                " };
        int marks[] = new int[8];
        boolean result[] = new boolean[8];

    }
}

class sem6 extends Marksheet {
    public sem6() {
    }

    public sem6(String name, String fname, String rollno) {
        super(name, fname, rollno);

        String sub[] = { "Computer Graphics         ", " Cyber Security         ", "Internet Programming   ",
                "Artificial Intelligence", "Advanced Management     ", "Information Technology   ",
                "practical 1             ", "practical 2             " };
        int marks[] = new int[8];
        boolean result[] = new boolean[8];

    }
}

class Marksheet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Student :");
        String name = "Sandeep";
        // sc.nextLine();
        System.out.println("Enter FatherName :");
        String fan = "Kailsh ji";
        // sc.nextLine();
        System.out.println("Enter rollno of Student :");
        String roll = "123";
        // sc.nextLine();

        sem1 obj = new sem1(name, fan, roll);

        int sem1supplycount;
        int sem1supplyIndex[] = new int[8];
        int total = 0;
        while (true) {
            while (true) {
                for (int i = 0; i < obj.sub.length; i++) {
                    System.out.print("Enter marks of" + " " + obj.sub[i] + ":");
                    obj.marks[i] = sc.nextInt();
                    if (i < 4) {
                        if (obj.marks[i] <= 0 || obj.marks[i] > 100) {
                            System.out
                                    .println(" Invalid marks,please re-Enter the marks less than  100" + " "
                                            + obj.sub[i]);
                            i--;
                            continue;
                        }
                        if (obj.marks[i] > 33) {
                            obj.result[i] = true;
                            obj.grade[i] = "";
                        } else {
                            obj.result[i] = false;
                            obj.grade[i] = "ATKT";
                        }
                        // total = total + obj.marks[i];
                    } else if (i > 3 && i < 6) {
                        if (obj.marks[i] <= 0 || obj.marks[i] > 70) {
                            System.out.println(
                                    " Invalid marks,please re-Enter the marks less than 70" + " " + obj.sub[i]);
                            i--;
                            continue;
                        }

                        if (obj.marks[i] > 25) {
                            obj.result[i] = true;
                           obj.grade[i] = "";
                        } else {
                            obj.result[i] = false;
                            obj.grade[i] = "ATKT";
                        }
                        // total = total + obj.marks[i];
                    }

                    else if (i > 5 && i <= 7) {
                        if (obj.marks[i] <= 0 || obj.marks[i] > 25) {
                            System.out.println(
                                    " Invalid marks,please re-Enter the marks less than 30 " + " " + obj.sub[i]);
                            i--;
                            continue;
                        }

                        if (obj.marks[i] >= 12) {
                            obj.result[i] = true;
                            obj.grade[i] = "";
                        } else {
                            obj.result[i] = false;
                            obj.grade[i] = "ATKT";
                        }
                        // total = total + obj.marks[i];
                    }
                }
                for (int i = 0; i < obj.sub.length; i++) {
                    System.out.println(obj.sub[i] + ":" + obj.marks[i] + "-" + obj.result[i]);
                    total = total + obj.marks[i];
                }

                sem1supplycount = 0;

                for (int i = 0; i < obj.result.length; i++) {
                    if (obj.result[i] == false) {
                        sem1supplyIndex[sem1supplycount] = i;
                        sem1supplycount++;
                    }
                }

                if (sem1supplycount > 2) {
                    System.out.println();
                    System.out.println(" You are fail in exam ,so again give exam");
                } else {
                    if (sem1supplycount <= 2) {
                        System.out.println(sem1supplycount + " subject have ATKT in BCA - you are promote in sem-2");

                        for (int i = 0; i < sem1supplycount; i++) {
                            System.out.println(obj.sub[sem1supplyIndex[i]] + ":" + obj.marks[sem1supplyIndex[i]]);
                        }
                    } else {
                        System.out.println("you Pass in all subject,promote to sem-2");
                    }
                    break;
                }
            }
            System.out.println("_________________________");
            System.out.println("|          || DEVI AHILYA VISHAVAVIDHALAY,INDORE ||                     |");
            System.out.println("|                     STATEMENTS OF MARKS                               |");
            System.out.println("|\t\t\tBCA- SEM " + "Sem 1" + "\t\t\t\t    \t|");
            System.out
                    .println("|  ROLLNO.        :- " + roll + "        " + "       NAME        :- " + name + "           |");
            System.out.println("|  ENROLLMENT NO. :- 12ADG67J9         " + " F/N         :- " + fan + "        |");
            System.out.println("|  CATEGORY       :- REGULAR           " + " D.O.B       :-" + "04/02/2001        |");
            System.out.println("|  COLLEGE        :- R.P.L.MAHESHWARI MAHAVIDYALAYA,INDORE              |");
            System.out.println("|_________________________|");
            System.out.println("|_________________________|");
            System.out.println("|    SUBJECTS  |      SCHEME OF MARKS    |     MARKS OBTAINED           |");
            System.out.println("|    /PAPERS   |    MIN    |   MAX       |       Total                  |");
            System.out.println("|_____|___|____|__________|");

            for (int i = 0; i < obj.sub.length; i++) {

                if (i < 4) {
                    System.out.println("|" + obj.sub[i] + "|     33    |    100      |" + "\t\t" + obj.marks[i]
                            + "\t" + obj.grade[i] + "\t|");
                } else if (i >= 4 && i < 6) {
                    System.out.println("|" + obj.sub[i] + "|     30    |     70      |" + "\t\t" + obj.marks[i] +
                            "\t" +
                            obj.grade[i] + "\t|");
                } else if (i >= 6 && i < 8) {
                    System.out.println("|" + obj.sub[i] + "|     12    |     30      |" + "\t\t" + obj.marks[i] + "\t"
                            + obj.grade[i] + "\t|");
                }

            }
            System.out.println("|_____|___|____|__________|");
            System.out.println("| Total Marks  |                                      600               |");
            System.out.println("|_____|__________________ |");
            System.out.println("|Sem    | Sem1     | Sem2  | Sem3  | Sem4   | Sem5   | Sem6             | ");
            System.out.println("|       | Marks    | Marks | Marks | Marks  | Marks  | Marks            |");
            System.out.println("|__|___|__|__|___|__|_______|");
            System.out.println("|Total  |" + total + "/600   |       |       |        |        |                  |");
            System.out.println("|__|___|__|__|___|__|__|____|");
            System.out.println("|Result |          |       |       |        |        |                  | ");
            System.out.println("|__|___|__|__|___|__|__|____|");
            if (sem1supplycount >= 1 && sem1supplycount <= 2) {
                System.out.println("Subjects you have AtkT in BCA - you promote in sem-2");
                for (int i = 0; i < sem1supplycount; i++) {
                    System.out.println(obj.sub[sem1supplyIndex[i]] + "-" + obj.marks[sem1supplyIndex[i]]);
                }
            } else {
                System.out.println("You Pass in all subjects,promote to sem-2");
            }
        }
    }
}