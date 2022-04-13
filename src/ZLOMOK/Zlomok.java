package ZLOMOK;



public class Zlomok {
    private int m;
    private int n;

    /*

Trieda ZLOMOK{}
Zlomok("3/4")//výnimky
index of(/)
matica trojuholníkova
zlomky: +;-;*;/;
Prevod na cele čislo
 */

    public boolean dajZlomok(String zlomok) {
        //substring()- berie od určitého bodu do určítého bodu
        //strchr//hlada znak v retazci
        //strstr//hlada retazec v retazci
        //atd
        int d = strlen(zlomok);
        int i;
        int z = 0;
        for (i = 0; i < d; i++) {
            if (zlomok[i] == '/') {
                z = i;
            }
        }

        for (i = z; i >= 0; i--) {
            int c;
            int d=
            switch(zlomok[i])
            {
                case"1":c=1;
                case"2":c=2;
                case"3":c=3;
                case"4":c=4;
                case"5":c=5;
                case"6":c=6;
                case"7":c=7;
                case"8":c=8;
                case"9":c=9;
                default:/*vynimka(throw)*/;
            }
            n=c*d;
        }

    }


}
