package src.Study.Study3;

public class Study4 {
    public static void main(String[] args) { 
        int month = (int)(Math.random() * 11 + 1);
        switch (month) {
            case 1 -> System.out.println("January  一月");
            case 2 -> System.out.println("February 二月");
            case 3 -> System.out.println("March 三月");
            case 4 -> System.out.println("April 四月");
            case 5 -> System.out.println("May 五月");
            case 6 -> System.out.println("June 六月");
            case 7 -> System.out.println("July 七月");
            case 8 -> System.out.println("August 八月");
            case 9 -> System.out.println("September 九月");
            case 10 -> System.out.println("October 十月");
            case 11 -> System.out.println("November 十一月");
            case 12 -> System.out.println("December 十二月");
        }
    }      
}