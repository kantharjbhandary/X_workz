package parent.child.external;

import parent.child.internal.Diwali;
import parent.child.internal.Festival;

public class FestivalRunner {

        public static void main(String[] args) {
            Festival festival = new Festival();
            festival.name();
            festival.culture();
            festival.celebrationType();
            festival.publicHoliday();
            festival.foodSpecialties();

            System.out.println("-------------------------");

            Diwali diwali = new Diwali();
            diwali.name();
            diwali.culture();
            diwali.celebrationType();
            diwali.publicHoliday();
            diwali.foodSpecialties();

            System.out.println("-------------------------");

            Festival festival1 = new Diwali();
            festival1.name();
            festival1.culture();
            festival1.celebrationType();
            festival1.publicHoliday();
            festival1.foodSpecialties();
        }
    }

