public class HelloWorld {
    // 1.声明这是一个native函数，由本地代码实现
    public static native String sayHello(String name);

    public static void main(String[] args) {
        // 3.调用本地函数
        String text = sayHello("sdw");
        System.out.println(text);
    }

    static {
        // 2.加载实现了native函数的动态库，只需要写动态库的名字
        System.load("/Users/sdw/Desktop/HelloWorld.jnilib");
    }
}
