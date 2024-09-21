public class APCalendar
{
 
 private static boolean isLeapYear(int year)
 {
   return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
 }
 
 public static int numberOfLeapYears(int year1, int year2)
 {
   int count = 0;
   for(int i = year1; i <= year2; i++)
     {
       if(isLeapYear(i))
       {
         count++;
       }
     }

   return count;
 }
 
 private static int firstDayOfYear(int year)
 {
   
 }
 
 private static int dayOfYear(int month, int day, int year)
 {
   
 }
 
 public static int dayOfWeek(int month, int day, int year)
 {
   int dayNum;
   dayNum = dayOfYear(month, day, year) % 7 + firstDayOfYear(year);
   
   if(dayNum >= 7)
     {
       dayNum % 7;
     }
   
   return dayNum;
   
 }

} 
