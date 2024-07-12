public class usuarios {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar(); smartTv.diminuirVolume(); smartTv.diminuirCanal();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

    }
}
