package homework5;

public class Main {
    public static void main(String[] args) {

        Employe[] persArray = new Employe[5];
        persArray[0] = new Employe("Иван", "Сергеевич", "Иванов", "Директор", "ivan1@mail.ru", "79966661122", 20000, 26);
        persArray[1] = new Employe("Иван", "Иванович", "Сергеев", "Директор", "ivan2@mail.ru", "79966661127", 20001, 24);
        persArray[2] = new Employe("Иван", "Александрович", "Сиротин", "Директор", "ivan3@mail.ru", "79966661126", 20002, 23);
        persArray[3] = new Employe("Иван", "Максимович", "Колбасин", "Директор", "ivan4@mail.ru", "79966661125", 20003, 22);
        persArray[4] = new Employe("Иван", "Адамович", "Замятин", "Директор", "ivan5@mail.ru", "79966661124", 20004, 21);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }
}
