package Skinfold;

public class SkinfoldMaleSpecficDurninEtRahman1967 extends SkinfoldMaleSpecfic{
	
	double density; // densidade
	
	public double Teens() { /* Adolescentes */

    	density = Math.log10(1.1533 - 0.0643) * (getBI() + getTR() + getSB() + getSI());
    	
        return density;
    	
    	//System.out.println(denstiy);
    }
    
    public double YoungMen() { /* Homens Jovens */

    	density = Math.log10(1.161 - 0.0632) * (getBI() + getTR() + getSB() + getSI());
    	
        return density;
    }
    
    public double CalculateFatPercentage(double age, int gender) {
    	
    	double fatPercentage = 0;
    	
    	if (age >= 7 && age <= 8 && gender == 1){
    		
    		fatPercentage = 497 - (538/density);
    	}
    	else if (age >= 9 && age <= 10 && gender == 1){
    		fatPercentage = 489 - (530/density);
    		
    	}
    	else if (age >= 11 && age <= 12 && gender == 1){
    		
    		fatPercentage = 481 - (523/density);
    	}
    	else if (age >= 13 && age <= 14 && gender == 1){
    		
    		fatPercentage = 464 - (507/density);
    	}
    	else if (age >= 15 && age <= 16 && gender == 1){
    		
    		fatPercentage = 459 - (503/density) ;
    	}
    	else if (age >= 17 && age <= 19 && gender == 1){
    		
    		fatPercentage = 453 - (498/density);
    	}
    	else if (age >= 20 && age <= 50 && gender == 1){
    		
    		fatPercentage = 450 - (495/density);
    	}
    	else if (age >= 7 && age <= 8 && gender == 2){
    		
    		fatPercentage = 503 - (543/density);
    	}
    	else if (age >= 9 && age <= 10 && gender == 2){
    		
    		fatPercentage = 495 - (535/density);
    	}
    	else if (age >= 11 && age <= 12 && gender == 2){
    		
    		fatPercentage = 484 - (525/density);
    	}
    	else if (age >= 13 && age <= 14 && gender == 2){
    		
    		fatPercentage = 469 - (512/density);
    	}
    	else if (age >= 15 && age <= 16 && gender == 2){
    		
    		fatPercentage = 464 - (507/density);
    	}
    	else if (age >= 17 && age <= 19 && gender == 2){
    		
    		fatPercentage = 462 - (505/density);
    	}
    	else if (age >= 20 && age <= 50 && gender == 2){
    		
    		fatPercentage = 459 - (503/density);
    	}

    	return fatPercentage;
    }
}