package dao;
import dao.Stack;

public class pharantasses_checker {
   public static String Verifica_Paranteze(String string) {
        Stack paranteze = Stack.empty();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                paranteze.push('(');
            } else if (string.charAt(i) == ')') {
               if(paranteze.este_oare_goala())
               {
                   return "Paranteza nu este pusa la locul potrivit";
               }
               else {
                   paranteze.pop();
               }
            }

        }
        if(paranteze.este_oare_goala()){
            return "totul arata bine, se pare ca ati setat toate parantezele corect";
        }
else
    return "Nu ati inchis careva dintre paranteze";
    }
}
