//Matriculation: 7219292
//Bekzod Nazarov
public class MathCalc {
    public static void main(String[] args) {
        double diameterSun = 865000.0;
        double diameterEarth = 7600.0;

        double radiusSun = diameterSun / 2.0;
        double radiusEarth = diameterEarth / 2.0;

        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);

        double volumeRatio = volumeSun / volumeEarth;

        System.out.printf("The volume of the Earth is %.2f cubic miles,", volumeEarth);
        System.out.printf(" the volume of the Sun is %.2f cubic miles,", volumeSun);
        System.out.printf(" and the ratio of the volume of the Sun to the volume of the Earth is %.2f.%n", volumeRatio);
    }
}
