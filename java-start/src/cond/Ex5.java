package cond;

public class Ex5 {
    public static void main(String[] args) {
        String a="F";
        String grade = switch (a) {
            case "A" -> "탁월함";
            case "B" -> "좋음";
            case "C" -> "준수";
            case "D" -> "향상필";
            case "F" -> "재수강";
            default -> "학생맞음?";
        };
        System.out.println("학점은 " + a + "칭찬은 " + grade);
    }
}
