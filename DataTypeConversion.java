public class DataTypeConversion {
    public static void main(String[] args) {
        // byte x = 3;
        // int y = x;
        // System.out.println("小轉大: " + y);

        // int x = 1024;
        // byte y = (byte)x;
        // System.out.println("大轉小y : " + y + " = x : " + x);

        // float f = (float)3.141592653579;
        // System.out.println("double 轉 float: " + f);

        // String s = "34";
        // x = Integer.parseInt(s);
        // System.out.println("字串轉整數: " + x);
        // double d = Double.parseDouble(s);
        // System.out.println("字串轉浮點數: " + d);
        int x = 34;
        String s = String.valueOf(x);
        System.out.println("整數轉字串: " + s);

        float f = 3.14F;
        s = String.valueOf(f);
        System.out.println("浮點數轉字串: " + s);
    }
    
}
