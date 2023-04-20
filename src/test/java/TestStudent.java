import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ksyun.whgc.yinruiyi.Student;

import static com.ksyun.whgc.yinruiyi.CollectionUtils.printCollection;

public class TestStudent {

    public static void main(String[] args) throws IOException {
        // 模拟生成学生集合
        List<Student> students = generateStudents();
        printCollection(students);
    }

    /**
     * 模拟生成学生集合
     */
    private static List<Student> generateStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("张三", 18, "北京市海淀区", new Date()));
        students.add(new Student("李四", 20, "上海市浦东新区", new Date()));
        students.add(new Student("王五", 22, "广州市天河区", new Date()));
        return students;
    }

}
