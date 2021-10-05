package HomeWork2;

public class Main {
    public static void main(String[] args) {
        createObject("Limb").print();
        createObject("Lust").print();
        createObject("Gluttony").print();

    }

    public static DanteHell createObject(String className) {
        switch (className) {
            case "Limb":
                return new Limb("Лимб",
                        " томятся некрещенные младенцы и нехристиане, которые обречены на безбольную скорбь",
                        "Харон");

            case "Lust":
                return new Lust("Похоть",
                        " обитают блюдники и страстные любовники, которых истязают бурей в кромешней тьме",
                        "Минос");

            case "Gluttony":
                return new Gluttony("Чревоугодие",
                        " проживают обжоры и гурманы, котрые гниют под солнцем и ледяным дождем",
                        "Цербер");

            default:
                return null;
        }
    }
}
