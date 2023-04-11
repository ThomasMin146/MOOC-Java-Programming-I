
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
        
        /*int dni = 30;
        int mesiace = (dni%(12*30))/30;
        int roky = dni/(12*30);
        
        
        int zvysneDni = (dni%(12*30))%30;
        
        System.out.println(roky);
        
        System.out.println(mesiace);
        System.out.println(zvysneDni);*/
        
        
                
    }
}
