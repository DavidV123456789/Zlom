package ZLOMOK;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//názov súboru a názov hlavnej triedy musia byť rovnaké(Main.java , public class Main)
public class Main {

    public static void main(String[] args) {

        //TRI METODY NACITAVNIA DAT

        //buffrovaný vtup, výrazne urýchli načítanie dát. Používa sa vtedy, ake je rýchlosť dôležitá resp. je dát veľmi veľa
        BufferedReader br= null;
        try
        {
            br= new BufferedReader(new FileReader("data.in"));
                    //buffovaný načíta celý riadok ako retazec, ak potrebujem jednotlive slova, musim retazec na ne rozdelit
                    //napr. pomocou split a urceneho oddelovaca
            String riadok;
            while((riadok=br.readLine())!=null)
            {
                System.out.println(riadok);
                String[] slova= riadok.split("[\s]+");
                for(String slovo : slova){
                    System.out.println(slovo);
                }
            }
            //v pripade, ak sa pokusate nacitat zo suboru cisla, stale ich dostanete ako retazec.
            //Preto ich nezabudnite pred pouzitim previest na cisla
            //Pouzite napr. Interger.parseInt()
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nedalo otvorit");
        }
        catch (IOException e)
        {
            System.out.println("Chyba pri uzatvarani suborov");
        }
        //finally sa vždy uskutoční/vykonná na konci
        finally {
            try
            {
                if(br!= null)
                {
                    br.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Chyba pri uzatvoreni suboru");
            }
        }



        //filereader načítava zo suboru po znaku bez bufovania. Vracia nám bajtovú hodnou(t.j číslo)
        FileReader fr= null;
        try
        {
            fr= new FileReader("data.in");
            int i;
            while((i= fr.read())!=-1){
                System.out.println((char) i);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nedalo otvorit");
        }
        catch (IOException e)
        {
            System.out.println("Chyba pri uzatvarani suborov");
        }
        //finally sa vždy uskutoční/vykonná na konci
        finally {
            try
            {
                if(fr!= null)
                {
                    fr.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Chyba pri uzatvoreni suboru");
            }
        }




        //Scanner je jediny sposov nacitacania, pri ktorom ihned prebieha parsovanie na jednotlive typy dat
        //má to však aj vedľajší dôsledok: jeho použitier je pomalé a preto sa nhodí tam, kde potrebujem načítať veľke
        //množstvo nástrojov a kde záleží na rýchlosti načítavania. V nasledujucom priklade sa nacitavaju cele riadky ako retazzce
        //ak chceme v intoch potom sc.nextInt()
        Scanner sc= null;
        try
        {
            sc= new Scanner(new FileReader("data.in"));
            String veta;
            while(sc.hasNextLine()){//testuje, ci je k dispozicii vstp moze to byt napr. aj hasNextInt() a pod. V takomto pripade nemusime osetrovat vynimku nevhodneho vstupu
                veta= sc.nextLine();
                System.out.println(veta);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nedalo otvorit");
        }
        finally {
                if(sc!= null)
                {
                    sc.close();
                }
        }



    }
}

/*

Trieda ZLOMOK{}
Zlomok("3/4")//výnimky
index of(/)
matica trojuholníkova (stringsplit()- od určitého znaku rozdeľuje string)
zlomky: +;-;*;/;
Prevod na cele čislo
 */
