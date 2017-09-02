import java.util.LinkedList;
import java.util.List;

public class AnimalsDataBase {
        public static void main(String[] args) {


                List<Variables> dataBase = new LinkedList<>();

                Variables dog1 = new Dogs();
                dog1.owner = "Kowalski";
                dog1.category = "Pies";
                dog1.breed = "Jamnik";
                dog1.name = "Roxy";
                dog1.age = 4;
                dataBase.add(dog1);

                Variables dog2 = new Dogs();
                dog2.owner = "Borowicz";
                dog2.category = "Pies";
                dog2.breed = "Kundel";
                dog2.name = "Maks";
                dog2.age = 2;
                dataBase.add(dog2);

                Variables dog3 = new Dogs();
                dog3.owner = "Karaś";
                dog3.category = "Pies";
                dog3.breed = "Dog niemiecki";
                dog3.name = "Azor";
                dog3.age = 7;
                dataBase.add(dog3);

                Variables cat1 = new Cats();
                cat1.owner = "Ridel";
                cat1.category = "Kot";
                cat1.breed = "Syjamski";
                cat1.name = "Mruczek";
                cat1.age = 12;
                dataBase.add(cat1);

                Variables cat2 = new Cats();
                cat2.owner = "Walińska";
                cat2.category = "Kot";
                cat2.breed = "Egipski";
                cat2.name = "Pazurek";
                cat2.age = 3;
                dataBase.add(cat2);

                Variables cat3 = new Cats();
                cat3.owner = "Adamiakowa";
                cat3.category = "Kot";
                cat3.breed = "Wielorasowiec";
                cat3.name = "Puszek";
                cat3.age = 1;
                dataBase.add(cat3);

                Variables others1 = new Others();
                others1.owner = "Pokraka";
                others1.category = "Inne";
                others1.breed = "Jaszczurka";
                others1.name = "Max";
                others1.age = 2;
                dataBase.add(others1);

                Variables others2 = new Others();
                others2.owner = "Malinowicka";
                others2.category = "Inne";
                others2.breed = "Pająk";
                others2.name = "TupaTupatuś";
                others2.age = 2;
                dataBase.add(others2);




        }

}
