//20. Write a java program to replace ‘a’ with ‘$’ in the following String
//          “I am always ready to learn although I do not always like being taught.”


public class Replace$ {
    public static void main(String[] args){
       String s =  "I am always ready to learn although i do not always like being taught";
        String s1 = s.replace('a','$');
        System.out.println(s1);

    }
}
//Output:
//        I $m $lw$ys re$dy to le$rn $lthough i do not $lw$ys like being t$ught
//
//        Process finished with exit code 0
