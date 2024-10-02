import java.util.HashMap;

class HashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Hindi", 100);
        examScores.put("Computer Programming", 100);

        // examScores.putIfAbsent("Math", 70); 
        // examScores.replace("Math", 70); 

        // System.out.println(examScores.get("English"));

        // examScores.clear();

        
        // examScores.remove("Sociology");


        // examScores.forEach((subject, score) -> {
        //     System.out.println(subject + " - " + score);
        // });


        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        
        System.out.println(examScores.toString());

        // System.out.println(examScores.containsKey("Math"));

        // System.out.println(examScores.containsValue(100));
        // System.out.println(examScores.containsValue(Integer.valueOf(100)));


        // System.out.println(examScores.isEmpty());
        
        // System.out.println(examScores.size());

        // System.out.println(examScores.getOrDefault("Religion", -1));

    }
}
