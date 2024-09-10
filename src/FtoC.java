public class FtoC implements Convert{

    @Override
    public void convert(int birlik) {
        System.out.println((birlik-35)*5/9);
    }
}
