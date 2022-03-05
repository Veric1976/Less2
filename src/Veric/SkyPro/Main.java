package Veric.SkyPro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte b = 0x0A; //  TEEN
        short sh = -32_768; // 2^16/2-1 range. max value for int not signed value=65535,what define type not signed int?
        int i = 123_456_789; // 2^32/2-1 range
        long l = 12_345_678_910_111_213L; // 2^64/2-1 range
        float f = 2.718_282f;
        double d = 2.718_281_828_459_0452;
/* end 1-ask */
        float weightFirstBoxerMan = 78.2f;
        float weightSecondBoxerMan = 82.7f;
        float totalWeightBoxerMans = weightFirstBoxerMan + weightSecondBoxerMan;
        System.out.println("Общий вес бойцов = " + totalWeightBoxerMans + " кг");
        System.out.println("Разница м/у весом бойцов 1 и 2 = " + (weightSecondBoxerMan-weightFirstBoxerMan) + " кг");
/* end 2-ask */
        float completedBreakfast;
        float weightBananas = 0.080f; //80g
        byte numberBananasToBreakfast = 5; // 5 pieces
        int valueMilk_mlToBreakfast = 200; // 200ml
        float milkRatioValueToWeight = 100f / 105f; //100ml=105gr ChernobylCow, milk grosser then watter
        float iceCreamPlombir = 100f; //100g
        byte numberIceCreamPlombirToBreakfast = 2;
        float weightRawEgg = 0.070f; // 70g
        byte numberRawEggToBreakfast = 4;
        completedBreakfast = numberBananasToBreakfast*weightBananas+valueMilk_mlToBreakfast*milkRatioValueToWeight+
                iceCreamPlombir*numberIceCreamPlombirToBreakfast+weightRawEgg*numberRawEggToBreakfast;
        System.out.println("Общий вес завтрака для бойца = " + completedBreakfast + "гр" +
                "(" + completedBreakfast/1000 + "кг)");
/* end 3-ask */
        float neededChangeWeightToLow = 7; // reduce weight on 7 kg
        float normalRatio1_ChangeWeightPerDay = 0.250f; // normal drying
        float aggressiveRatio2_ChangeWeightPerDay = 0.500f; // aggressive drying
        System.out.println("Время/в сутках/ адаптации бойца под новые правила в весовых категориях " +
                "при двух схемах сушки:\n щадящая = " + neededChangeWeightToLow/normalRatio1_ChangeWeightPerDay +
                "сут"+ "\n усиленная = " + neededChangeWeightToLow/aggressiveRatio2_ChangeWeightPerDay + "сут" +
                "\n с чередованием рациона = " + neededChangeWeightToLow/(normalRatio1_ChangeWeightPerDay+
                aggressiveRatio2_ChangeWeightPerDay)*2);
/* end 4-ask */
        System.out.println("_ _ _ _");
        float salaryMasha = 67_760f;
        float salaryDen = 83_690f;
        float salaryKrystina = 76_230f;
        salaryMasha *= 1.1;
        salaryDen *= 1.1;
        salaryKrystina *= 1.1;
        System.out.println("Теперь ежемесячный доход Маши равен " + salaryMasha +
                ", и общий доход Маши на этот год = " + salaryMasha*12 +"руб, вырос на = " +
                salaryMasha/1.1*0.1*12 + "руб");
        System.out.println("Теперь ежемесячный доход Дениса равен " + salaryDen +
                ", и общий доход Дениса на этот год = " + salaryDen*12 +"руб, вырос на = " +
                salaryDen/1.1*0.1*12 + "руб");
        System.out.println("Теперь ежемесячный доход Кристины равен " + salaryKrystina +
                ", и общий доход Кристины на этот год = " + salaryKrystina*12 +"руб, вырос на = " +
                salaryKrystina/1.1*0.1*12 + "руб");
    }
}

