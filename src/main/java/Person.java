public class Person {

    private String vorname;
    private String nachname;
    static int instancen = 0;


    Person(String vorname,String nachname){
        this.vorname = vorname;
        this.nachname = nachname;

        instancen++;
    }
}
