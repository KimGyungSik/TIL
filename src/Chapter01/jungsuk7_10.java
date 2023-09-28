package Chapter01;

public class jungsuk7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH :"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH :"+t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL :"+t.getVolume());
        t.gotoPrevChannel();
        System.out.println("CH :"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH :"+t.getChannel());

    }
}
class MyTv2 {
   private boolean isPowerOn;
    private int  channel;
   private int volume;
   private int PrevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int channel) {
        if(!(MIN_CHANNEL<channel&&channel<MAX_CHANNEL)) return;
        PrevChannel = this.channel;
        this.channel=channel;
    }
    int getChannel() {
        return channel;
    }
    void setVolume(int volume) {
        if(!(MIN_VOLUME<volume&&volume<MAX_VOLUME)) return;
        this.volume = volume;
    }
    int getVolume() {
        return volume;
    }
    void gotoPrevChannel() {
        setChannel(PrevChannel);
    }

}







