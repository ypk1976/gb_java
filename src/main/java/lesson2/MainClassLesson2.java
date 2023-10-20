package lesson2;

public class MainClassLesson2 {
    public static void main(String[] args) {
        String string = "my string";
        String another = string + " " + string + "!";
//        System.out.println(another);

        StringBuilder sBuild = new StringBuilder();
        sBuild.append(1).append(another).append(" hola!");
        StringBuffer sBuff = new StringBuffer();
        System.out.println(sBuild);
        sBuild.delete(1,5);
        System.out.println(sBuild);
        for (int i = 0; i < 10; i++) {
            sBuild.append(i);
        }
        System.out.println(sBuild);
    }
}
