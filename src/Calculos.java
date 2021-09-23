public class Calculos {
    public static float calcularNatalidade(float nascidos, float habitantes) {
        float taxaNatalidade = (nascidos * 1000) / habitantes;
        System.out.printf("A taxa de natalidade é de %.2f porcento.", taxaNatalidade);
        return taxaNatalidade;

    }

    public static float calcularMortalidade(float obitos, float habitantes) {
        float taxaMortalidade = (obitos * 1000) / habitantes;
        System.out.printf("A taxa de mortalidade é de %.2f porcento.", taxaMortalidade);
        return taxaMortalidade;

    }
}