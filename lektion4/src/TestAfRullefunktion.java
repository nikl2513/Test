public class TestAfRullefunktion {
    public static void main(String[] args) {
        int antGan = 0;
        int samlet =0;
        Die terning = new Die();
        for (antGan =0; antGan < 1000; antGan++){
            terning.roll();
            System.out.println(terning.getFaceValue());
            samlet = samlet + terning.roll();
        }
        System.out.println(samlet);
    }
}
