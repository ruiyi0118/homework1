import com.ksyun.whgc.yinruiyi.StringUtils;

import java.util.Scanner;

public class TestStringUtils {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入原始字符串：");
        String s = in.nextLine();
        String reversed = StringUtils.reverse(s);
        System.out.println("反转的字符串为: " + reversed);
    }
}
