public class Population {
    public static void main(String[] args) {
        long currpopulation = 312032486;
        final long seconds = (365*24*60*60)*5;
        long birth= seconds/7;
        long death= seconds/13;
        long imm= seconds/45;
         
        long newpop = currpopulation+birth-death+imm;
        System.out.println("current popultion: "+ currpopulation);
        System.out.println("new population: "+newpop);

    }

    
}
