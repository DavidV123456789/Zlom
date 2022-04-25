package ZLOMOK;




public class Zlomok {
    private int m;
    private int n;

    static class Exception_n extends Exception
    {
        private final String info;
        Exception_n (String ret)
        {
            info = ret;
        }
        String getInfo()
        {
            return info;
        }
        public String toString()
        {
            return "Zle zadaný citatel";
        }
    }
    static class Exception_m extends Exception
    {
        private final String info;
        Exception_m(String ret)
        {
            info = ret;
        }
        String getInfo()
        {
            return info;
        }
        public String toString()
        {
            return "Zle zadany menovatel";
        }
    }
    static class Exception_lomeno extends Exception
    {
        private final String info;
        Exception_lomeno (String ret)
        {
            info = ret;
        }
        String getInfo()
        {
            return info;
        }
        public String toString()
        {
            return "Zle zadana zlomkova ciara";
        }
    }
    /*

Trieda ZLOMOK{}
Zlomok("3/4")//výnimky
index of(/)
matica trojuholníkova
zlomky: +;-;*;/;
Prevod na cele čislo
 */


    public void dajZlomok(String zlomok) {
        //substring()- berie od určitého bodu do určítého bodu
        //strchr//hlada znak v retazci
        //strstr//hlada retazec v retazci
        //atd

        int d = strlen(zlomok);
        int i;
        int z = 0;
        int zz=0;
        for (i = 0; i < d; i++) {
            if (zlomok[i] == '/') {
                z = i;
                zz++;
            }
        }
        try {
            if (z == 1) {
                int decal = 1;
                for (i = z; i >= 0; i--) {
                    int c;
                    decal *= 10;
                    switch (zlomok[i]) {
                        case "1":
                            c = 1;
                        case "2":
                            c = 2;
                        case "3":
                            c = 3;
                        case "4":
                            c = 4;
                        case "5":
                            c = 5;
                        case "6":
                            c = 6;
                        case "7":
                            c = 7;
                        case "8":
                            c = 8;
                        case "9":
                            c = 9;
                        default:
                            c = 0;throw new Exception_n("Zle zadaný citatel");//urob tiedy
                    }
                    n = c * decal;
                }
                decal = 1;
                for (i = d - 1; i >= z; i--) {
                    int c;
                    decal *= 10;
                    switch (zlomok[i]) {
                        case "1":
                            c = 1;
                        case "2":
                            c = 2;
                        case "3":
                            c = 3;
                        case "4":
                            c = 4;
                        case "5":
                            c = 5;
                        case "6":
                            c = 6;
                        case "7":
                            c = 7;
                        case "8":
                            c = 8;
                        case "9":
                            c = 9;
                        default:
                            c = 0;throw new Exception_m("Zle zadany menovatel");//urob tiedy ;
                    }
                    m = c * decal;
                }
                //...
            } else if (z == 0) {
                int decal = 1;
                for (i = d - 1; i >= 0; i--) {
                    int c;
                    decal *= 10;
                    switch (zlomok[i]) {
                        case "1":
                            c = 1;
                        case "2":
                            c = 2;
                        case "3":
                            c = 3;
                        case "4":
                            c = 4;
                        case "5":
                            c = 5;
                        case "6":
                            c = 6;
                        case "7":
                            c = 7;
                        case "8":
                            c = 8;
                        case "9":
                            c = 9;
                        default:
                            c = 0;throw new Exception_n("Zle zadana zlomkova ciara");//urob tiedy ;
                    }
                    n = c * decal;
                    m = 1;
                }
            } else {
                throw new Exception_lomeno("");//urob tiedy
            }
        }
        catch (Exception_n ex)
        {
            System.out.println(ex);
        }
        catch (Exception_m ex)
        {
            System.out.println(ex);
        }
        catch (Exception_lomeno ex)
        {
            System.out.println(ex);
        }
    }



}
