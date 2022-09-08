public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0 + 2; i < 17; i++) {
            System.out.println(i++);
        }
        for (int q=10; q>=-10; q=q-1) {
            System.out.println(q);
        }
        for (int w=2096; w<1904; w=w+4)
            if (w%4==0 && w%100!=0 || w%400==0)
            System.out.println("таким образом не читается код!!! ниже приведен по другому написанный код, который работает"+w);

        for (int o=1; o<10; o=o+5)
            System.out.println(o);

        for (int t=1904; t<2096; t=t+4)
            if (t%4==0 && t%100!=0 || t%400==0)
            System.out.println("высокосный год "+t);

        for (int r=7; r<=98; r+=7)
            System.out.println(r+" ");

        for (int e=2; e<=512; e=e*2)
            System.out.println(e);

        int salary=29000;
        int total=0;
        for (int i=1; i<=12; i=i+1) {
            total=total+salary;
            System.out.println(i+ " месяц итого " +total);
        }
        double pr=0;
        double percent=0.01;
        for (int i=1; i<=12; i=i+1) {
            pr=(pr+salary)*(1+percent);
            System.out.println("месяц "+i+" сумма накоплений "+pr+" рублей");
        }








    }



}


