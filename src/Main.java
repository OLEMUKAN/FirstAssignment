 public class Main {
        static void Grading(int marks){
            if (marks<=100 && marks>=80){
                System.out.println(marks+" is a A");
            } else if (marks<=79 && marks>=75) {
                System.out.println(marks+" is a B+");
            } else if (marks<=74 && marks>=70) {
                System.out.println(marks+" is a B");
            } else if (marks<=69 && marks>=65) {
                System.out.println(marks+" is a C+");
            } else if (marks<=64 && marks>=60) {
                System.out.println(marks+" is a C");
            } else if (marks<=59 && marks>=50) {
                System.out.println(marks+" is a D");
            } else {
                System.out.println(marks+" is an F");
            }
        }

        static void ForLoopsFor3() {
            //loops for multiples of 3
            //for loop
            for (int i = 12; i >=3; i -= 3) {
                System.out.println(i);
            }
        }

        static void DoWhileFor3(){
            //do while loop
            int z=12;
            do {

                System.out.println(z);
                z-=3;
            }
            while(z>=3);
        }

        static void WhileFor3(){
            //while loop
            int x=12;
            while (x>=3){
                System.out.println(x);
                x-=3;
            }
        }

        static void ForLoopSkip9(){
            for (int a = 12; a >=3 ; a-=3) {
                if (a == 9) {
                    continue;
                }
                System.out.println(a);
            }
        }
        static void WhileSkip9(){
            int b = 12;
            while (b >=3){
                if (b == 9) {
                    b-=3;
                    continue;
                }
                System.out.println(b);
                b-=3;
            }
        }

        static void DoWhileSkip9(){
            int c=12;
            do {
                if (c == 9) {
                    c-=3;
                    continue;
                }
                System.out.println(c);
                c-=3;
            }while(c>=3);
        }

        public static void main(String[] args) {
            DoWhileSkip9();
        }
    }

