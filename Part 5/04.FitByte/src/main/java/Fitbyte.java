public class Fitbyte {
    private int age;
    private int resting;


    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.resting = restingHeartRate;
    }
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentageOfMaximum){
        return (double) ((this.maximumHeartRate()-this.resting))*(percentageOfMaximum)+this.resting;
    }
}