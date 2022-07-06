package methodeTraining;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MethodeString {
    public static String repeatString(String str){
        return str.repeat(3);
    }
    public static String stripString(String str){
        return str.strip();
    }
    public static Boolean isBlankString(String str){
        return str.isBlank();
    }
    public static List<String> linesString(String str){
        if(str == null) return List.of();
        return str.lines().toList();
    }
    public static String stripLeading(@NotNull String str){
        return str.stripLeading();
    }
    public static String stripTrailing(@NotNull String str){
        return str.stripTrailing();
    }

    public static void main(String[] args) {
        String str = "   Hello world!  ";
        System.out.println(repeatString(str));
        System.out.println(repeatString(stripTrailing(str)));
        System.out.println(stripLeading(str));
        System.out.println(stripString(str));
        System.out.println(linesString(str));
        System.out.println("Str puis un string vide : ");
        System.out.println(isBlankString(str));
        System.out.println(isBlankString(" "));
    }
}
