public class Main {
    public static void main(String[] args) {
        RadnikPoSatu radnikPoSatu= new RadnikPoSatu("Jovan","Jovanovic","1205973710122","123-1234-002345-23",5);
        radnikPoSatu.isplatiPlatu();
        System.out.println( radnikPoSatu );

        RadnikPoDanu radnikPoDanu=new RadnikPoDanu("Sima","Mirkovic","2309968710122","556-6433-34560-12",6);
        radnikPoDanu.isplatiPlatu();
        System.out.println(radnikPoDanu);

        RadnikFiksno radnikFiksno= new RadnikFiksno("Marko","Markovic","0105984710354","830-1234-4566-23");
        radnikFiksno.isplatiPlatu();
        System.out.println(radnikFiksno);

    }

}