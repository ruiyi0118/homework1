# 知识导入基础编程题

## 实现路径

- 题目1：

  - 1.1：'src/main/java/com/ksyun/whgc/yinruiyi/StringUtils.java'下的 reverse() 函数
  - 1.2：'src/main/java/com/ksyun/whgc/yinruiyi/StringUtils.java'下的 countLetters() 函数
  - 1.3：'src/main/java/com/ksyun/whgc/yinruiyi/StringUtils.java'下的 printMostFrequentLetters() 函数
  - 1.4：'src/main/java/com/ksyun/whgc/yinruiyi/StringUtils.java'下的 longestSubstring() 函数

- 题目2：

  - 2.1：

    - 'src/main/java/com/ksyun/whgc/yinruiyi/Student.java'

      定义一个学生类，包括姓名、年龄、住址和出生年月等属性，使用了@Property注解来标注每个属性的名称

    - 'src/main/java/com/ksyun/whgc/yinruiyi/Property.java'

      使用@Retention和@Target注解来指定注解的生命周期和使用范围，并定义了一个name属性来表示属性的名称

  - 2.2：'src/main/java/com/ksyun/whgc/yinruiyi/CollectionUtils.java'，定义一个工具类来输出集合对象

- 题目3：'src/main/java/com/ksyun/whgc/yinruiyi/PrintThread.java'

  PrintThread类实现了Runnable接口，其中run方法中的逻辑是保证每个线程按照ABCABC...的顺序打印自己的ID值。

------

## 测试方法

- 题目1：

  - 1.1：'src/test/java/TestStringUtils.java'，输入/输出样例：

    ```
    请输入原始字符串：Hello World!
    反转的字符串为: !dlroW olleH
    ```

  - 1.2：'src/test/java/TestStringUtils.java'，输入/输出样例：

    ```
    请输入原始字符串：Hello World!
    每个字母出现的次数: { =1, !=1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
    ```

  - 1.3：'src/test/java/TestStringUtils.java'，输入/输出样例：

    ```
    请输入原始字符串：Hello World!
    出现次数最多的字母是：l，它出现了 3 次。
    ```

  - 1.4：'src/test/java/TestStringUtils.java'，输入/输出样例：

    ```
    请输入原始字符串：abbcabcbb
    不含有重复字符的最长子串：bca
    ```

- 题目2：'src/test/java/TestStudent.java'，输出样例，students.xlsx文件在Excel中打开：

  ![image-20230420164423754](C:\Users\90606\AppData\Roaming\Typora\typora-user-images\image-20230420164423754.png)

- 题目3：'src/test/java/TestPrintThread.java'，输出样例：

  ```
  输出：ACBACBACBACBACB
  ```

  ​	在每个线程中，首先通过prev锁来保证前一个线程已经打印完自己的ID值。然后通过self锁来打印自己的ID值，并通知下一个线程可以开始打印了。最后线程释放self锁，并等待前一个线程的通知，从而保证了三个线程的执行顺序。

  

------

## Git 提交信息

- 提交记录 1：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 08:55:39 2023 +0800

- 提交记录 2：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 09:13:48 2023 +0800
- 提交记录 3：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 09:19:36 2023 +0800
- 提交记录 4：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 09:24:10 2023 +0800
- 提交记录 5：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 09:34:46 2023 +0800
- 提交记录 6：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 16:35:35 2023 +0800
- 提交记录 7：commit id：“@ruiyi0118” <906063940@qq.com>，提交时间：Thu Apr 20 17:11:54 2023 +0800
