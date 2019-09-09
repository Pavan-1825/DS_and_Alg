package datastructures_algorithms;

public class SwithCondition {

    public void swithDay(Week week){

        switch (week){

            case MONDAY:
                 System.out.println("Today is MONDAY");
                break;
            case TUEDAY:
                System.out.println("Today is TUEDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Today is SATURDAY");
                break;
            case SUNDAY:
                System.out.println("Today is SUNDAY");
                break;

                default:
                    System.out.println("The Day is not avialable in a week.");

        }
    }
}
