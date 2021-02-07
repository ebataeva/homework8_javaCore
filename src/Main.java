public class Main {
    public static void main(String[] args) {
        Barriers[] barriers = GenerateCompetitors.getBarriers();
Athletes[] athletes =  GenerateCompetitors.getCompetitors();
for (Athletes a: athletes){
 for(Barriers b: barriers){
     if(b instanceof Track){
     a.run((Track) b);}else {
         a.jump((Wall) b);
     }
 }
}
    }
}
