import java.util.Scanner;

public class task5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String email,fileName;

        System.out.println("输入文件名:");
        fileName = input.nextLine();

        System.out.println("输入邮箱:");
        email = input.nextLine();

        int index = fileName.lastIndexOf(".");
        String prefix =fileName.substring(index+1,fileName.length());
        if (index != -1 && index != 0 && prefix.equals("java"))
            System.out.println("Java文件名正确");
        else
            System.out.println("Java文件名无效");
            
        int index2 = email.lastIndexOf("@");
        int index3 = email.indexOf('.');
        if (index2 != -1 && index3 > index2)
            System.out.println("邮箱格式正确");
        else
            System.out.println("邮箱格式无效");
    }
}
