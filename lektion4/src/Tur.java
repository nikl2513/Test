public class Tur
{

        Die terning1 = new Die();
        Die terning2 = new Die();
        int SumAfTerninger;
        public int tur ()
        {
            terning1.roll();
            terning2.roll();
            SumAfTerninger = terning1.getFaceValue() + terning2.getFaceValue();
            return SumAfTerninger;
        }
public int getTerning1Value()
    {

        return terning1.getFaceValue();
    }
    public int getTerning2Value()
    {

        return terning2.getFaceValue();
    }
}
