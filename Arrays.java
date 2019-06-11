import java.util.HashMap;

public class Arrays {

        public HashMap<String, Integer> Hm() {

                HashMap<String, Integer> hm =  new HashMap<>();

                for(String word :  Arr()) {
                        hm.put(word, hm.getOrDefault(word, 0) +  1);
                }

                return hm;
        }

        private String[] Arr(){
               String str = "Каперсы, Паста, Артишок, Салат, Семга, Сельдерей, Борщ, Оливки, Капоната, Салат, Борщ, "+
                        "Артишок, Семга, Чизкейк, Вареники, Салат, Капоната, Лазанья, Борщ, Семга, Артишок";

               return str.split(", ");
        }
}
